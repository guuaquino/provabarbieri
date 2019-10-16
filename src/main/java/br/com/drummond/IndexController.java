package br.com.drummond;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value="/api5/{numero}", method=RequestMethod.GET)	 
   public Integer RetornarMultiplo(@PathVariable("numero") Integer numero) {
		
	   if (numero%5 == 0) {
			  numero = numero*5;
			 }else
				 {numero = -1;}
	   
	return numero;			 	 
					 	 
		 }
	   
   }
	
	
