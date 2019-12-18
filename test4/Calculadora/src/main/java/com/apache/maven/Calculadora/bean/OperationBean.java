package com.apache.maven.Calculadora.bean;

public class OperationBean {
	
	private String operation;
    private int a;
    private int b;
    
    public OperationBean() {
    	
    }
    
    public OperationBean(String operation) {
        this.operation = operation;
    }

    public OperationBean(int a, int b) {
        this.a = a;
        this.b = b;
    }

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
