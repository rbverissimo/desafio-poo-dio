import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		
		/* INSTANCIANDO O BOOTCAMP */ 
		Bootcamp bootcamp1 = new Bootcamp(); 
		bootcamp1.setNome("SpringBoot Experience");
		bootcamp1.setDescricao("Imersão em framework SpringBoot para desenvolvimento Java moderno");

		
		/* INSTANCIANDO CURSOS E MENTORIAS */
		Curso curso1 = new Curso();
		curso1.setTitulo("Programação Orientada a Objetos");
		curso1.setDescricao("Aprender fundamentos sobre a POO");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("SpringBoot Framework");
		curso2.setDescricao("Simplifcar projetos Java com Spring Framework");
		curso2.setCargaHoraria(10);
		
		Conteudo mentoria1 = new Mentoria(); 
		mentoria1.setTitulo("Scrum e Cultura Ágil");
		
				
		/* INCLUINDO CONTEUDOS ÀS ESTRUTURAS DE DADOS DO BOOTCAMP */
		
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		
		
		/* INSTANCIANDO OS DESENVOLVEDORES QUE FARÃO PARTE DO BOOTCAMP */
		Dev dev1 = new Dev();
		dev1.setNome("Renato");
		dev1.inscreverBootcamp(bootcamp1);
		
		Dev dev2 = new Dev(); 
		dev2.setNome("Joana"); 
		dev2.inscreverBootcamp(bootcamp1);
		
		Dev dev3 = new Dev();
		dev3.setNome("Roberto");
		dev3.inscreverBootcamp(bootcamp1);
		
		
		System.out.println(bootcamp1.toString());
		
		
		
		
	}

}
