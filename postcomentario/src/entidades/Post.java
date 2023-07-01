package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	
	private LocalDateTime data;
	private String titulo;
	private String legenda;
	private Integer likes;
	
	
	private List<Comentario> comentes = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(LocalDateTime data, String titulo, String legenda, Integer likes) {
		this.data = data;
		this.titulo = titulo;
		this.legenda = legenda;
		this.likes = likes;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentes() {
		return comentes;
	}
	
	public void addComentario(Comentario come) {
		comentes.add(come);
		
	}
	
	public void removeComentario(Comentario come) {
		comentes.remove(come);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
		sb.append("Comenatario: \n");
		for (Comentario c : comentes) {
			sb.append(c.getTexto() + '\n');
		}
		return sb.toString();
		
		
		
		
	}
	
	
}
