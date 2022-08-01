import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria(); 
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso Completo de Java");
		curso1.setCargaHoraria(10);
		
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso Completo de JavaScript");
		curso2.setCargaHoraria(10);
		
		mentoria1.setTitulo("Java e Programação a Objetos");
		mentoria1.setDescricao("Mentoria para alunos de curso de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println(mentoria1.toString());
		
	}

}
