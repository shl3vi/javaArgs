package io.demo;

public abstract class Human{
	
	public Human(Gender gender) {
		this.setGender(gender);
	}

	private Gender gender;
	public Gender getGender() {
		//Should be instrumented
		return this.gender;
	}

	public void setGender(Gender g) {
		//Should be instrumented
		this.gender = g;
	}
}