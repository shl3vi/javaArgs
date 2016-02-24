package io.sealights.javaBuildAgent.args;

public class Arguments{
	
	String mode;
	
	//config options
	String customerIdOption;
	String serverOption;
	String proxyOption;
	String javaHomeOption;
	String javaClassPathPrefixOption;
	
	//scan options
	String workspacePathOption;
	String outputPathOption;
	String branchOption;
	String buildOption;
	String commitOption;
	String appnameOption;
	String technologyOption;
	String scmOption;
	String dependencyOption;
	String dependenciesFilesOption;
	String recursiveOption;

	public Arguments(String mode, String customerIdOption, String serverOption, String proxyOption,
			String javaHomeOption, String javaClassPathPrefixOption) {
		this.mode = mode;
		this.customerIdOption = customerIdOption;
		this.serverOption = serverOption;
		this.proxyOption = proxyOption;
		this.javaHomeOption = javaHomeOption;
		this.javaClassPathPrefixOption = javaClassPathPrefixOption;
	}

	public Arguments(String mode, String workspacePathOption, String outputPathOption, String branchOption,
			String buildOption, String commitOption, String appnameOption, String technologyOption, String scmOption,
			String dependencyOption, String dependenciesFilesOption, String recursiveOption) {
		this.mode = mode;
		this.workspacePathOption = workspacePathOption;
		this.outputPathOption = outputPathOption;
		this.branchOption = branchOption;
		this.buildOption = buildOption;
		this.commitOption = commitOption;
		this.appnameOption = appnameOption;
		this.technologyOption = technologyOption;
		this.scmOption = scmOption;
		this.dependencyOption = dependencyOption;
		this.dependenciesFilesOption = dependenciesFilesOption;
		this.recursiveOption = recursiveOption;
	}

	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCustomerIdOption() {
		return customerIdOption;
	}
	public void setCustomerIdOption(String customerIdOption) {
		this.customerIdOption = customerIdOption;
	}
	public String getServerOption() {
		return serverOption;
	}
	public void setServerOption(String serverOption) {
		this.serverOption = serverOption;
	}
	public String getProxyOption() {
		return proxyOption;
	}
	public void setProxyOption(String proxyOption) {
		this.proxyOption = proxyOption;
	}
	public String getJavaHomeOption() {
		return javaHomeOption;
	}
	public void setJavaHomeOption(String javaHomeOption) {
		this.javaHomeOption = javaHomeOption;
	}
	public String getJavaClassPathPrefixOption() {
		return javaClassPathPrefixOption;
	}
	public void setJavaClassPathPrefixOption(String javaClassPathPrefixOption) {
		this.javaClassPathPrefixOption = javaClassPathPrefixOption;
	}
	public String getWorkspacePathOption() {
		return workspacePathOption;
	}
	public void setWorkspacePathOption(String workspacePathOption) {
		this.workspacePathOption = workspacePathOption;
	}
	public String getOutputPathOption() {
		return outputPathOption;
	}
	public void setOutputPathOption(String outputPathOption) {
		this.outputPathOption = outputPathOption;
	}
	public String getBranchOption() {
		return branchOption;
	}
	public void setBranchOption(String branchOption) {
		this.branchOption = branchOption;
	}
	public String getBuildOption() {
		return buildOption;
	}
	public void setBuildOption(String buildOption) {
		this.buildOption = buildOption;
	}
	public String getCommitOption() {
		return commitOption;
	}
	public void setCommitOption(String commitOption) {
		this.commitOption = commitOption;
	}
	public String getAppnameOption() {
		return appnameOption;
	}
	public void setAppnameOption(String appnameOption) {
		this.appnameOption = appnameOption;
	}
	public String getTechnologyOption() {
		return technologyOption;
	}
	public void setTechnologyOption(String technologyOption) {
		this.technologyOption = technologyOption;
	}
	public String getScmOption() {
		return scmOption;
	}
	public void setScmOption(String scmOption) {
		this.scmOption = scmOption;
	}
	public String getDependencyOption() {
		return dependencyOption;
	}
	public void setDependencyOption(String dependencyOption) {
		this.dependencyOption = dependencyOption;
	}
	public String getDependenciesFilesOption() {
		return dependenciesFilesOption;
	}
	public void setDependenciesFilesOption(String dependenciesFilesOption) {
		this.dependenciesFilesOption = dependenciesFilesOption;
	}
	public String getRecursiveOption() {
		return recursiveOption;
	}
	public void setRecursiveOption(String recursiveOption) {
		this.recursiveOption = recursiveOption;
	}
	
}