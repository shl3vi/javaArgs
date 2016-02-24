package io.sealights.javaBuildAgent.args;


import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class ArgsParserWrapper{

	static final String SCAN = "scan";
	static final String CONFIG = "config";

	static  CommandLineParser PARSER = new DefaultParser();

	public static Arguments getArguments(String[] args) throws ParseException{
		// parse the command line arguments
		final Options options = createModeOptions();
		CommandLine line = PARSER.parse(options, args,true);

		boolean config = line.hasOption(CONFIG);
		boolean scan = line.hasOption(SCAN);

		if (config && !scan) {
			return createConfigArgumentsObject(args);
		} else if (scan && !config) {
			return createScanArgumentsObject(args);
		} else{
			System.out.println("SeaLights Build Scanner: invalid mode. Valid modes are 'scan' or 'config'.\n\n");
			new HelpFormatter().printHelp("Type '-help' for more information.", "", options, "",	true);
			System.exit(0);
		}

		return null;

	}

	private static Arguments createConfigArgumentsObject(String[] args) throws ParseException{

		// parse the command line arguments
		CommandLine line = PARSER.parse(createConfigOptions(), args);

		return new Arguments(
				CONFIG,
				(String) line.getParsedOptionValue("customerid"),
				(String) line.getParsedOptionValue("server"),
				(String) line.getParsedOptionValue("proxy"),
				(String) line.getParsedOptionValue("javahome"),
				(String) line.getParsedOptionValue("javaclassprefix")
				);
	}

	private static Arguments createScanArgumentsObject(String[] args) throws ParseException{

		// parse the command line arguments
		CommandLine line = PARSER.parse(createScanOptions(), args);

		//Should come together: 'workspacepath', 'technology', 'scm'
		int counter = 0;
		counter += line.hasOption("workspacepath") ? 1:0;
		counter += line.hasOption("technology") ? 1:0;
		counter += line.hasOption("scm") ? 1:0;
		if (counter != 0 && counter != 3){
			throw new ParseException(
					"The 'workspacepath', 'technology' and 'scm' command-line arguments, must all be specified together or not at all");
		}

		return new Arguments(
				SCAN,
				(String) line.getParsedOptionValue("workspacepath"),
				(String) line.getParsedOptionValue("outputpath"),
				(String) line.getParsedOptionValue("branch"),
				(String) line.getParsedOptionValue("build"),
				(String) line.getParsedOptionValue("commit"),
				(String) line.getParsedOptionValue("appname"),
				(String) line.getParsedOptionValue("technology"),
				(String) line.getParsedOptionValue("scm"),
				(String) line.getParsedOptionValue("dependency"),
				(String) line.getParsedOptionValue("dependenciesFile"),
				(String) line.getParsedOptionValue("recursive")
				);
	}
	
	private static Option createOptionFromArray(String[] opt){
		Builder ob = Option.builder(opt[0]).desc(opt[1]); 
		
		if (opt[2] != null){
			ob.longOpt(opt[2]);
		}
		if (opt[3] != null){
			ob.required();
		}
		if (opt[4] != null){
			ob.hasArgs();
		}
		
		return ob.build(); 
	}

	private static Options createScanOptions() throws AlreadySelectedException{
		
		String[][] scanOptions = {
				//{name, desc,shortname,required,hasArgs}
				{"scan","Flag to indicate scan mode", null,"true", null},
				{"workspacepath", "Path to the workspace where the source code exists", null, null,"true"},
				{"outputpath", "Path where the compiled output exists", null,null,"true"},
				{"branch", "Branch name", null,"true", "true"},
				{"build","Build version", null, "true", "true"},
				{"commit",
					"commit ID, as provided by the SCM (e.g. SHA1 for git, revision for SVN, changeset for TFS). May be automatically detected by the SCM.",
					null,null,"true"},
				{"appname", "Application Name", null, "true", "true"},
				{"technology", "The technology in which the project is written (more than one value may be specified)",null,null,"true"},
				{"scm", "The Source Control Management used (currently only 'git' is supported)", null, null, "true"},
				{"dependency",
					"Project dependencies. Pattern should be a semicolon-separated AppName@Branch@Build list. May be specified more than once.", "d", null, "true"},
				{"dependenciesFile", "A path to a json file that is in the following format: [{\"appName\":\"\",\"branch\":\"\",\"build\":\"\"},{...}]",
						null, null,"true"},
				{"recursive","Starts a recursive search for JARs & WARs in folder specified by the 'workspacepath' option", "r",null,null }
		};
		
		Options options = new Options();
		
		for (int i=0; i<scanOptions.length; i++){
			options.addOption(createOptionFromArray(scanOptions[i]));
		}

		return options;
	}

	private static Options createConfigOptions() throws AlreadySelectedException{
		String[][] configOptions = {
				//{name, desc,shortname,required,hasArgs}
				{"config","Flag to indicate configuration mode", null, "true", null},
				{"customerid", "Customer ID (mandatory, unless already exists in sealights.json)"
					, null, "true", "true"},
				{"server", "SeaLights Server URL", null, "true", "true"},
				{"proxy", "Proxy server (optional, must be a valid URL)", null,null, "true"},
				{"javahome", "Java Only. Path to java home (default value will be taken from environment JAVA_HOME)",
					null,null,"true"},
				{"javaclassprefix","Comma-separated list of prefixes in the form of 'com/example/,io/sealights/demo/'",
						null,"true", "true"}
		};

		Options options = new Options();
		
		for (int i=0; i<configOptions.length; i++){
			options.addOption(createOptionFromArray(configOptions[i]));
		}
		
		return options;
	}

	private static Options createModeOptions() { 

		String[][] modeOptions={
				{"config","Flag to indicate configuration mode",null,null,null},
				{"scan", "Flag to indicate scan mode",null,null,null},
				{"help", "Show this help page", "h", null, null}
		};

		Options options = new Options(); 
		OptionGroup og = new  OptionGroup();

		for (int i=0; i<modeOptions.length; i++){
			og.addOption(createOptionFromArray(modeOptions[i]));
		}

		options.addOptionGroup(og);

		return options; 
	} 
}