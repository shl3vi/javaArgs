package io.sealights.javaBuildAgent.test;

import org.apache.commons.cli.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.sealights.javaBuildAgent.args.ArgsParserWrapper;
import io.sealights.javaBuildAgent.args.Arguments;

@Test(groups="UnitTest")
public class ArgumentParserTest {

	@Test
	public void giveGoodInput() throws ParseException {
		// Arrange
		String[] args = {
			"-config", "-customerid", "shahar", "-server",
			"http://url.com", "-proxy", "http://proxy.com",
			"-javahome", "C:/shahar", "-javaclassprefix", "someprefix"};
		// Act
		Arguments a = ArgsParserWrapper.getArguments(args);
		// Assert
		Assert.assertSame(a.getMode(), "config");
		Assert.assertSame(a.getCustomerIdOption(), "shahar");
		Assert.assertSame(a.getServerOption(), "http://url.com");
		Assert.assertSame(a.getProxyOption(), "http://proxy.com");
		Assert.assertSame(a.getJavaHomeOption(), "C:/shahar");
		Assert.assertSame(a.getJavaClassPathPrefixOption(), "someprefix");
		
	}
	
	@Test(expectedExceptions = ParseException.class, expectedExceptionsMessageRegExp = "Unrecognized option: -falsearg")
	public void givefalseArgument_shouldGetParseException() throws ParseException {
		// Arrange
		String[] args = {
			"-config", "-customerid", "shahar", "-server",
			"http://url.com", "-proxy", "http://proxy.com",
			"-javahome", "C:/shahar", "-javaclassprefix", "someprefix", "-falsearg"};
		// Act
		ArgsParserWrapper.getArguments(args);
		// Assert
	}

	@Test(expectedExceptions = ParseException.class, expectedExceptionsMessageRegExp = "Missing required option: javaclassprefix")
	public void skipRequiredArg_shouldGetParseException() throws ParseException {
		// Arrange
		String[] args = {
			"-config", "-customerid", "shahar", "-server",
			"http://url.com", "-proxy", "http://proxy.com",
			"-javahome", "C:/shahar"};
		// Act
		ArgsParserWrapper.getArguments(args);
		// Assert
	}
	
	@Test(expectedExceptions = ParseException.class, expectedExceptionsMessageRegExp = "Missing required option: javaclassprefix")
	public void DontGiveModeArgs_shouldGiveHelpText() throws ParseException {
		// Arrange
		String[] args = {
			"-config", "-customerid", "shahar", "-server",
			"http://url.com", "-proxy", "http://proxy.com",
			"-javahome", "C:/shahar"};
		// Act
		ArgsParserWrapper.getArguments(args);
		// Assert
		//TODO: check console output
	}

}
