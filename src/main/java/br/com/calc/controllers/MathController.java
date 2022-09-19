package br.com.calc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.calc.Math.SimpleMath;
import br.com.calc.converter.NumberConverter;

@RestController
public class MathController {

	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double soma(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo)) ;
	}

	
	@RequestMapping(value = "/substracao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double substracao(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.substracao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplicacao(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.multiplicacao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo)) ;
	}
	
	@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divisao(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.divisao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo)) ;
	}	
	
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media(
		@PathVariable(value="numberOne") String numberOne,
		@PathVariable(value="numberTwo") String numberTwo
		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.media(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo)) ;
	}		
	
	
	@RequestMapping(value = "/raizquadrada/{numberOne}", method=RequestMethod.GET)
	public Double raizquadrada(
		@PathVariable(value="numberOne") String numberOne

		) throws Exception  {
		
		if(!NumberConverter.isNumeric(numberOne) ) {
			throw new UnsupportedOperationException("digite apenas números");
		}
		return math.raizquadrada(NumberConverter.convertToDouble(numberOne)) ;
	}	
	

	
	

}
