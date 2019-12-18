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
	
	/**
	 * map del servicio calculator
	 * @param model
	 * @return
	 */
	@RequestMapping("/calculator")
    private String getCalculatorPage(Model model){
        model.addAttribute("operationBean",form);
        return "calculator";
	}
	
	/**
	 * servicio map para suma
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    private String add(@ModelAttribute("operationBean")  OperationBean form, Model model ){
        model.addAttribute("result", calculatorServices.add(form));
        return "calculator";
    }
	
	/**
	 * servicio map para subtracción
	 * @param form
	 * @param model
	 * @return
	 */
    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    private String subtract(@ModelAttribute("operationBean")  OperationBean form, Model model ){
        model.addAttribute("result", calculatorServices.subtract(form));
        return "calculator";
    }
	

}
