package br.pucgoias.cmp1144.controle;

import java.lang.invoke.SwitchPoint;
import java.nio.channels.SelectableChannel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucgoias.cmp1144.entidade.Calculadora;
import br.pucgoias.cmp1144.entidade.Pessoa;

@RestController
@RequestMapping("/calculadoraController")
public class CalculadoraController {

	@RequestMapping(value = "/{valor1}" + "/{valor2}" + "/{op}" + "/json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Calculadora getResultadoJSON(@PathVariable String valor1, @PathVariable String valor2,
			@PathVariable String op) {
		return getResultado(valor1, valor2, op);
	}
	
	@RequestMapping(value = "/{valor1}" + "/{valor2}" + "/{op}" + "/xml", method = RequestMethod.GET, produces = "application/xml")
	public @ResponseBody Calculadora getResultadoXML(@PathVariable String valor1, @PathVariable String valor2,
			@PathVariable String op) {
		return getResultado(valor1, valor2, op);
	}
	
	public Calculadora getResultado(String valor1, String valor2, String op) {
		
		Calculadora c = new Calculadora();
		
		c.setValor1(Integer.parseInt(valor1));
		c.setValor2(Integer.parseInt(valor2));
		c.setOp(op);
		
		switch (c.getOp()) {
		case "sub":
			c.setValorTotal(c.getValor1() - c.getValor2());	
			break;
		case "add":
			c.setValorTotal(c.getValor1() + c.getValor2());	
			break;
		case "mult":
			c.setValorTotal(c.getValor1() * c.getValor2());	
			break;
		case "div":
			c.setValorTotal(c.getValor1() / c.getValor2());	
			break;
		default:
			c.setValorTotal(0);
			break;
		}
		return c;
	}
	// @RequestMapping(value = "/{nome}.json", method = RequestMethod.GET, produces
	// = "application/json")
	// public @ResponseBody Pessoa getPessoaJSON(@PathVariable String nome){
	//
	// pessoa.setId(1234);
	// pessoa.setNome(nome);
	// pessoa.setEmail("email@pucgoias.br");
	// pessoa.setIdade(18);
	//
	// return pessoa;
	// }

}
