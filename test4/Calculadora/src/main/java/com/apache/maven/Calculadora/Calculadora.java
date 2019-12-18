package com.apache.maven.Calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Calculadora maven sprengBoot
 * Test 4
 * Pureba-test
 * @author Nicola Gernone
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.apache.maven.Calculadora" })
public class Calculadora 
{
    public static void main( String[] args )
    {
    	 try {
			SpringApplication.run(Calculadora.class, args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
