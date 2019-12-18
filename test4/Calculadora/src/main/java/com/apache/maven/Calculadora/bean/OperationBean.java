package com.apache.maven.Calculadora.bean;

public class OperationBean {
	
	private String operation;
    private float a;
    private float b;
    
    public OperationBean() {
    	
    }
    
    public OperationBean(String operation) {
        this.operation = operation;
    }

    public OperationBean(float a, float b) {
        this.a = a;
        this.b = b;
    }

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

}
