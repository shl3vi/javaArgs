package io.sealights.javaBuildAgent;

import org.apache.commons.cli.ParseException;

import io.sealights.javaBuildAgent.args.ArgsParserWrapper;
import io.sealights.javaBuildAgent.args.Arguments;

public class App{
	public static void main(String[] args) throws ParseException {
		try{
			Arguments arguments = ArgsParserWrapper.getArguments(args);

		} catch (ParseException exp) {
			// oops, something went wrong
			System.err.println("Parsing failed.  Reason: " + exp.getMessage());
			System.out.println(exp.getMessage());
			System.exit(1);
		} catch (Exception e) {
			System.err.println("Server failed: " + e.getMessage());
			System.exit(2);
		}
	}
}
