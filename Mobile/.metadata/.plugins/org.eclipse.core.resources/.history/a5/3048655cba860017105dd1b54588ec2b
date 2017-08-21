package ex001json;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		String path = ((System.getProperty("user.dir")));
		System.out.println(path);
		Gson gson = new Gson();
		
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
		
		String json1 = gson.toJson(dados);
		
		try{
			   FileWriter writer = new FileWriter(System.getProperty("user.dir")+"\\test002.json");
			   writer.write(json1);
			   writer.close();	   
		}	catch (Exception e) {
			// TODO: handle exception
		}

		try {

			System.out.println("Reading JSON from a file");
			System.out.println("----------------------------");
			Gson gson2 = new GsonBuilder().create();
			BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\test002.json"));
			Dados dados2 = gson2.fromJson(br, Dados.class);
			System.out.println("Universidade: " + dados2.getUniversidade());
			System.out.println("Professor: " + dados2.getProfessor());
			System.out.println("Sala: " + dados2.getSala());
			System.out.println("Aluno: " + dados2.getAluno());
			System.out.println("Curso: " + dados2.getCurso());
			System.out.println("Aula: " + dados2.getAula());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
