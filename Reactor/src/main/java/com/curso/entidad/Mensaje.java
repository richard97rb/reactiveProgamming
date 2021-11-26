package com.curso.entidad;

public class Mensaje {

	private String id;
	private String texto;

	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", texto=" + texto + "]";
	}

}
