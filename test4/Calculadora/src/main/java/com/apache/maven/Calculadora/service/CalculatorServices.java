package com.apache.maven.Calculadora.service;

import com.apache.maven.Calculadora.bean.OperationBean;

import io.corp.calculator.TracerImpl;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServices extends TracerImpl {
	
	/**
	 * servicio que devuelve la suma de dos valores
	 * @param form
	 * @return
	 */
	public float add(OperationBean form){
        try {
			return form.getA() + form.getB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			trace(e);
			return 0;
		}
    }
	
	/**
	 * servicio que devuelve la resta de dos valores
	 * @param form
	 * @return
	 */
    public float subtract(OperationBean form){
    	try {
			return form.getA() - form.getB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			trace(e);
			return 0;
			
		}
    }
}
