package ex001xml;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Main {
public static void main(String[] args) {
	
	Universidade uni = new Universidade();
	uni.setId(222);
	uni.setNome("PUCGO");
	uni.setEndereco("rua 10");
	uni.setSigla("puc");
	uni.setSite("puc@puc.com");
	
	Professor prof = new Professor();
	prof.setCpf("123123123");
	prof.setId(333);
	prof.setNome("fulano");
	
	Sala sala = new Sala();
	sala.setArea("a");
	sala.setId(12);
	sala.setNumero("5656");
	sala.setTipo("abc");
	
	Aluno aluno = new Aluno();
	aluno.setCpf("321312321");
	aluno.setData_nasc("19900101");
	aluno.setEndereco("rua rio verde");
	aluno.setId(8989);
	aluno.setNome("ALUNO001");

	Curso curso = new Curso();
	curso.setId(10);
	curso.setNome("Analise e Desenv. Sist.");
	curso.setSigla("ADS");
	
	Aula aula = new Aula();
	aula.setId_aluno(aluno.getId());
	aula.setId_sala(sala.getId());
	aula.setId_curso(curso.getId());
	aula.setId_professor(prof.getId());
	aula.setDia_semana("segunda");
	aula.setHorario("18:45 - 20:30");

	Dados dados = new Dados();
	dados.setUniversidade(uni);
	dados.setProfessor(prof);
	dados.setSala(sala);
	dados.setAluno(aluno);
	dados.setCurso(curso);
	dados.setAula(aula);
	
	XStream xstream = new XStream();
	xstream.alias("universidade", Universidade.class);
	xstream.alias("professor", Professor.class);
	xstream.alias("sala", Sala.class);
	xstream.alias("aluno", Aluno.class);
	xstream.alias("curso", Curso.class);
	xstream.alias("aula", Aula.class);
	String xml = xstream.toXML(dados);
	System.out.println(xml);
	
	XStream xstream2 = new XStream(new StaxDriver());
	xstream2.alias("universidade", Universidade.class);
	xstream2.alias("professor", Professor.class);
	xstream2.alias("sala", Sala.class);
	xstream2.alias("aluno", Aluno.class);
	xstream2.alias("curso", Curso.class);
	xstream2.alias("aula", Aula.class); 
	Dados dados2 = (Dados)xstream2.fromXML(xml);
	
	Universidade uni2 = new Universidade();
	uni2 = (Universidade) dados2.Universidade;
	
	Professor prof2 = new Professor();
	prof2 = (Professor)dados2.Professor;
	
	Sala sala2 = new Sala();
	sala2 = (Sala) dados2.Sala;
	
	Aluno aluno2 = new Aluno();
	aluno2 = (Aluno)dados2.Aluno;
	
	Curso curso2 = new Curso();
	curso2 = (Curso)dados2.Curso;
	
	Aula aula2 = new Aula();
	aula2 = (Aula)dados2.Aula;
	
	System.out.println("\nID Aluno: "+aula2.getId_aluno());
	System.out.println("Nome Faculdade: "+uni2.getNome());
	System.out.println("Nome Professor: "+prof2.getNome());
	 
	}
}
