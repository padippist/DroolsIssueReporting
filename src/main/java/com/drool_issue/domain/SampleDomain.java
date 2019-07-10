package com.drool_issue.domain;

public class SampleDomain {
	private int instanceVariable1;
	private String instanceVariable2;
	private int instanceVariable3;
	private int instanceVariable4;
	
	
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
	
	public int getInstanceVariable4() {
		return instanceVariable4;
	}
	public void setInstanceVariable4(int instanceVariable4) {
		this.instanceVariable4 = instanceVariable4;
	}
	
	public SampleDomain getAnotherFunction(SampleDomain sampleDomain) {
		sampleDomain.setInstanceVariable4(5);
		System.out.println("getAnotherFunction(SampleDomain sampleDomain)");
		return sampleDomain;
	}
	
}
