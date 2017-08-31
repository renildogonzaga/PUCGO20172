package br.pucgoias.cmp1144.controle;
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String exibirServicos() {
		String r;
		r = "Serviços Disponíveis:\nConsultar Estados do Brasil: /getBREstados"
				+ "\n  || Consultar Países: /getPaises"
				+ "\n  || Consultar Carros: /getCarros";
		return r;
	}
	
	@RequestMapping(value = "/getCarros", method = RequestMethod.GET)
	public @ResponseBody String listarCarros() {
		return getCarros();
	}
	
	@RequestMapping(value = "/getPaises", method = RequestMethod.GET)
	public @ResponseBody String listarPaises() {
		return getPaises();
	}
	
	@RequestMapping(value = "/getBREstados", method = RequestMethod.GET)
	public @ResponseBody String listarBREstados() {
		return getEstadosBR();
	}
	
	public String getCarros() {
		String carros = "[{\"fabricante\":\"Ford\",\"modelo\":\"Aerostar\",\"ano\":1986}, {\"fabricante\":\"Mitsubishi\",\"modelo\":\"3000GT\",\"ano\":1999}, {\"fabricante\":\"Volkswagen\",\"modelo\":\"Golf\",\"ano\":1985}, {\"fabricante\":\"Volkswagen\",\"modelo\":\"Cabriolet\",\"ano\":1996}, {\"fabricante\":\"Infiniti\",\"modelo\":\"G\",\"ano\":2001}, {\"fabricante\":\"Cadillac\",\"modelo\":\"CTS\",\"ano\":2010}, {\"fabricante\":\"Subaru\",\"modelo\":\"Forester\",\"ano\":2000}, {\"fabricante\":\"Ford\",\"modelo\":\"F350\",\"ano\":1993}, {\"fabricante\":\"BMW\",\"modelo\":\"530\",\"ano\":2003}, {\"fabricante\":\"Chevrolet\",\"modelo\":\"Colorado\",\"ano\":2011}, {\"fabricante\":\"Ford\",\"modelo\":\"Transit Connect\",\"ano\":2010}, {\"fabricante\":\"Land Rover\",\"modelo\":\"Discovery\",\"ano\":2005}, {\"fabricante\":\"Buick\",\"modelo\":\"LeSabre\",\"ano\":1999}, {\"fabricante\":\"Lexus\",\"modelo\":\"RX\",\"ano\":2010}, {\"fabricante\":\"Audi\",\"modelo\":\"S6\",\"ano\":2008}, {\"fabricante\":\"Kia\",\"modelo\":\"Sorento\",\"ano\":2005}, {\"fabricante\":\"Lincoln\",\"modelo\":\"Mark VIII\",\"ano\":1995}, {\"fabricante\":\"Chevrolet\",\"modelo\":\"Aveo\",\"ano\":2008}, {\"fabricante\":\"Cadillac\",\"modelo\":\"Escalade EXT\",\"ano\":2010}, {\"fabricante\":\"Ford\",\"modelo\":\"Fairlane\",\"ano\":1965}, {\"fabricante\":\"Ford\",\"modelo\":\"Ranger\",\"ano\":1988}, {\"fabricante\":\"Isuzu\",\"modelo\":\"Axiom\",\"ano\":2002}, {\"fabricante\":\"Mazda\",\"modelo\":\"RX-7\",\"ano\":1985}, {\"fabricante\":\"Mazda\",\"modelo\":\"RX-8\",\"ano\":2007}, {\"fabricante\":\"Nissan\",\"modelo\":\"GT-R\",\"ano\":2009}, {\"fabricante\":\"Jeep\",\"modelo\":\"Grand Cherokee\",\"ano\":2000}, {\"fabricante\":\"Aptera\",\"modelo\":\"Type-1h\",\"ano\":2010}, {\"fabricante\":\"Chevrolet\",\"modelo\":\"Express 1500\",\"ano\":2010}, {\"fabricante\":\"Audi\",\"modelo\":\"S4\",\"ano\":2012}, {\"fabricante\":\"Volkswagen\",\"modelo\":\"Golf\",\"ano\":2006}, {\"fabricante\":\"Maserati\",\"modelo\":\"Biturbo\",\"ano\":1985}, {\"fabricante\":\"Buick\",\"modelo\":\"LeSabre\",\"ano\":1992}, {\"fabricante\":\"Ford\",\"modelo\":\"Taurus\",\"ano\":2001}, {\"fabricante\":\"Ford\",\"modelo\":\"E-Series\",\"ano\":1985}, {\"fabricante\":\"Ford\",\"modelo\":\"F250\",\"ano\":1998}, {\"fabricante\":\"Ferrari\",\"modelo\":\"599 GTB Fiorano\",\"ano\":2009}, {\"fabricante\":\"Mercury\",\"modelo\":\"Mariner\",\"ano\":2011}, {\"fabricante\":\"Lotus\",\"modelo\":\"Esprit\",\"ano\":1999}, {\"fabricante\":\"Chrysler\",\"modelo\":\"Fifth Ave\",\"ano\":1993}, {\"fabricante\":\"Acura\",\"modelo\":\"TL\",\"ano\":2008}, {\"fabricante\":\"BMW\",\"modelo\":\"M3\",\"ano\":2002}, {\"fabricante\":\"Volvo\",\"modelo\":\"S80\",\"ano\":1999}, {\"fabricante\":\"Dodge\",\"modelo\":\"Viper\",\"ano\":2010}, {\"fabricante\":\"Volkswagen\",\"modelo\":\"Golf\",\"ano\":1999}, {\"fabricante\":\"Mitsubishi\",\"modelo\":\"Precis\",\"ano\":1990}, {\"fabricante\":\"Ford\",\"modelo\":\"E250\",\"ano\":2003}, {\"fabricante\":\"Hyundai\",\"modelo\":\"Elantra\",\"ano\":2004}, {\"fabricante\":\"Nissan\",\"modelo\":\"Sentra\",\"ano\":2004}, {\"fabricante\":\"Kia\",\"modelo\":\"Optima\",\"ano\":2012}, {\"fabricante\":\"Chevrolet\",\"modelo\":\"Silverado\",\"ano\":2011}]";
		return carros;
	}
	
	public String getPaises() {
		String paises = "[{\"paises\":\"Thailand\"}, {\"paises\":\"Brazil\"}, {\"paises\":\"China\"}, {\"paises\":\"China\"}, {\"paises\":\"China\"}, {\"paises\":\"Argentina\"}, {\"paises\":\"Russia\"}, {\"paises\":\"France\"}, {\"paises\":\"Indonesia\"}, {\"paises\":\"Philippines\"}, {\"paises\":\"Ireland\"}, {\"paises\":\"Japan\"}, {\"paises\":\"Bosnia and Herzegovina\"}, {\"paises\":\"China\"}, {\"paises\":\"Russia\"}, {\"paises\":\"Afghanistan\"}, {\"paises\":\"Sri Lanka\"}, {\"paises\":\"Macedonia\"}, {\"paises\":\"Mexico\"}, {\"paises\":\"Armenia\"}, {\"paises\":\"Japan\"}, {\"paises\":\"China\"}, {\"paises\":\"Brazil\"}, {\"paises\":\"Peru\"}, {\"paises\":\"Japan\"}, {\"paises\":\"China\"}, {\"paises\":\"United States\"}, {\"paises\":\"China\"}, {\"paises\":\"France\"}, {\"paises\":\"China\"}]";
		return paises;
	}
	
	public String getEstadosBR() {
		String estados = "[{ 	\"ID\": \"1\", 	\"Sigla\": \"AC\", 	\"Nome\": \"Acre\" },      { 	\"ID\": \"2\", 	\"Sigla\": \"AL\", 	\"Nome\": \"Alagoas\" },      { 	\"ID\": \"3\", 	\"Sigla\": \"AM\", 	\"Nome\": \"Amazonas\" },      { 	\"ID\": \"4\", 	\"Sigla\": \"AP\", 	\"Nome\": \"Amapá\" },      { 	\"ID\": \"5\", 	\"Sigla\": \"BA\", 	\"Nome\": \"Bahia\" },      { 	\"ID\": \"6\", 	\"Sigla\": \"CE\", 	\"Nome\": \"Ceará\" },      { 	\"ID\": \"7\", 	\"Sigla\": \"DF\", 	\"Nome\": \"Distrito Federal\" },      { 	\"ID\": \"8\", 	\"Sigla\": \"ES\", 	\"Nome\": \"Espírito Santo\" },      { 	\"ID\": \"9\", 	\"Sigla\": \"GO\", 	\"Nome\": \"Goiás\" },      { 	\"ID\": \"10\", 	\"Sigla\": \"MA\", 	\"Nome\": \"Maranhão\" },      { 	\"ID\": \"11\", 	\"Sigla\": \"MG\", 	\"Nome\": \"Minas Gerais\" },      { 	\"ID\": \"12\", 	\"Sigla\": \"MS\", 	\"Nome\": \"Mato Grosso do Sul\" },      { 	\"ID\": \"13\", 	\"Sigla\": \"MT\", 	\"Nome\": \"Mato Grosso\" },      { 	\"ID\": \"14\", 	\"Sigla\": \"PA\", 	\"Nome\": \"Pará\" },      { 	\"ID\": \"15\", 	\"Sigla\": \"PB\", 	\"Nome\": \"Paraíba\" },      { 	\"ID\": \"16\", 	\"Sigla\": \"PE\", 	\"Nome\": \"Pernambuco\" },      { 	\"ID\": \"17\", 	\"Sigla\": \"PI\", 	\"Nome\": \"Piauí\" },      { 	\"ID\": \"18\", 	\"Sigla\": \"PR\", 	\"Nome\": \"Paraná\" },      { 	\"ID\": \"19\", 	\"Sigla\": \"RJ\", 	\"Nome\": \"Rio de Janeiro\" },      { 	\"ID\": \"20\", 	\"Sigla\": \"RN\", 	\"Nome\": \"Rio Grande do Norte\" },      { 	\"ID\": \"21\", 	\"Sigla\": \"RO\", 	\"Nome\": \"Rondônia\" },      { 	\"ID\": \"22\", 	\"Sigla\": \"RR\", 	\"Nome\": \"Roraima\" },      { 	\"ID\": \"23\", 	\"Sigla\": \"RS\", 	\"Nome\": \"Rio Grande do Sul\" },      { 	\"ID\": \"24\", 	\"Sigla\": \"SC\", 	\"Nome\": \"Santa Catarina\" },      { 	\"ID\": \"25\", 	\"Sigla\": \"SE\", 	\"Nome\": \"Sergipe\" },      { 	\"ID\": \"26\", 	\"Sigla\": \"SP\", 	\"Nome\": \"São Paulo\" },      { 	\"ID\": \"27\", 	\"Sigla\": \"TO\", 	\"Nome\": \"Tocantins\" }]";
		return estados;
	}
}
