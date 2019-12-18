package com.apache.maven.Calculadora.service;

import org.springframework.stereotype.Service;

import com.apache.maven.Calculadora.bean.OperationBean;

@Service
public class CalculatorServices {

	
	/**
	 * servicio que devuelve la suma de dos valores
	 * @param form
	 * @return
	 */
	private int add(OperationBean form){
        return form.getA() + form.getB();
    }
	
	/**
	 * servicio que devuelve la resta de dos valores
	 * @param form
	 * @return
	 */
    private int subtract(OperationBean form){
        return form.getA() - form.getB();
    }
}
