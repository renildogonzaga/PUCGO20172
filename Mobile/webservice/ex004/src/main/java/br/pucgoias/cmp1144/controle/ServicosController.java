package br.pucgoias.cmp1144.controle;
import java.lang.invoke.SwitchPoint;
import java.nio.channels.SelectableChannel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicosController")
public class ServicosController {
	
	@RequestMapping(value = "/{lista}", method = RequestMethod.GET)
	public @ResponseBody String hello(@PathVariable String lista) {
		String r;
		r = "teste";
		return r;
	}
}
