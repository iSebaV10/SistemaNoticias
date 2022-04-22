package com.edutecno.desafioSistemaDeNoticias.model;

public class Noticia {
	
private String titulo;
private String url;
private String parrafo;

public Noticia(String titulo, String url, String parrafo) {
	super();
	this.titulo = titulo;
	this.url = url;
	this.parrafo = parrafo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getParrafo() {
	return parrafo;
}

public void setParrafo(String parrafo) {
	this.parrafo = parrafo;
}

@Override
public String toString() {
	return "Noticia [titulo=" + titulo + ", url=" + url + ", parrafo=" + parrafo + "]";
}



}
