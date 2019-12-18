package com.apache.maven.Calculadora.controller;

import com.apache.maven.Calculadora.service.CalculatorServices;
import com.apache.maven.Calculadora.bean.OperationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	//inicializo el bean
	OperationBean form = new OperationBean();
	
	//me conecto a los servicios
	@Autowired
	private CalculatorServices calculatorServices;
	
	@RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationBean",form);
        return "calculator";
	}
	
	

}
