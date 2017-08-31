package br.pucgoias.cmp1144.controle;
import com.google.gson.Gson;
import br.pucgoias.cmp1144.entidade.Pessoa;
import com.thoughtworks.xstream.XStream;

public class PessoaController {
		
		public String hello(String nome) {
			String result = "O nome informado no caminho foi: " + nome;
			return result;
		}

		public String getPessoaJSON(String nome){
			Pessoa pessoa = new Pessoa();
			pessoa.setId(1234);
			pessoa.setNome(nome);
			pessoa.setEmail("email@pucgoias.br");
			pessoa.setIdade(18);
			Gson gson = new Gson();
			String json = gson.toJson(pessoa);
			return "JSON: " + json;
		}
		
		public String getPessoaXML(String nome){
			Pessoa pessoa = new Pessoa();
			pessoa.setId(1234);
			pessoa.setNome(nome);
			pessoa.setEmail("email@pucgoias.br");
			pessoa.setIdade(18);
			XStream xstream = new XStream();
			String xml = xstream.toXML(pessoa);
			return "XML: " + xml;
		}	
	}