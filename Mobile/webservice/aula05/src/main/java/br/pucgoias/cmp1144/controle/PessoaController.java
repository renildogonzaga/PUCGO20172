package br.pucgoias.cmp1144.controle;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucgoias.cmp1144.entidade.Pessoa;

@RestController
@RequestMapping("/pessoaController")
public class PessoaController {
	
	Pessoa pessoa = new Pessoa();
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public String hello(@PathVariable String nome) {
		String result = "O nome informado no caminho foi: " + nome;
		return result;
	}
	@RequestMapping(value = "/{nome}.json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Pessoa getPessoaJSON(@PathVariable String nome){
		
		pessoa.setId(1234);
		pessoa.setNome(nome);
		pessoa.setEmail("email@pucgoias.br");
		pessoa.setIdade(18);
		
		return pessoa;
		
	}
}