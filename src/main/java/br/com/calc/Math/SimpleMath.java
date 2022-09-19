package br.com.calc.Math;

public class SimpleMath {

	//@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(Double numberOne ,Double numberTwo) {
		return numberOne + numberTwo;
	}
		
	//@RequestMapping(value = "/substracao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double substracao(Double numberOne ,Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	//@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplicacao(Double numberOne ,Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	//@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divisao(Double numberOne ,Double numberTwo) {
		return numberOne / numberTwo;
	}	
	
	//@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media(Double numberOne ,Double numberTwo) {
		return (numberOne + numberTwo)/2;
		}

	//@RequestMapping(value = "/raizquadrada/{numberOne}", method=RequestMethod.GET)
	public Double raizquadrada(Double numberOne) {
		return Math.sqrt(numberOne)  ;
	}
}
