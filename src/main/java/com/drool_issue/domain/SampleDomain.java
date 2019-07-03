package com.drool_issue.domain;

public class SampleDomain {
	private int instanceVariable1;
	private String instanceVariable2;
	private int instanceVariable3;
	
	
	public int getInstanceVariable1() {
		return instanceVariable1;
	}
	public void setInstanceVariable1(int instanceVariable1) {
		this.instanceVariable1 = instanceVariable1;
	}
	public String getInstanceVariable2() {
		return instanceVariable2;
	}
	public void setInstanceVariable2(String instanceVariable2) {
		this.instanceVariable2 = instanceVariable2;
	}
	public int getInstanceVariable3() {
		return instanceVariable3;
	}
	public void setInstanceVariable3(int instanceVariable3) {
		this.instanceVariable3 = instanceVariable3;
	}
	
	public boolean anotherFunction() {
		System.out.println("Called anotherFunction() from SampleDomain");
		return true;
	}
	
	public boolean anotherFunction(SampleDomain sampleDomain) {
		System.out.println("Called anotherFunction(SampleDomain sampleDomain) from SampleDomain");
		return true;
	}
	
	

}
