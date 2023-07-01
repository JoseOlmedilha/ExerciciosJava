package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) {

		Comentario c1 = new Comentario("Fazer boa viagem");
		Comentario c2 = new Comentario("Uau, isso é incrível! ");
		
		Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		
		System.out.println(p1);
		
		
		
	}

}
