package com.edutecno.sistemadenoticias.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edutecno.desafioSistemaDeNoticias.model.Noticia;




public class LeerTxt {
	private final static Logger logger = LoggerFactory.getLogger(LeerTxt.class);
	
	private List<Noticia> noticias = new ArrayList<Noticia>();

	public List<Noticia> leerArchivoTXT() { 
		try {
			FileReader fr = new FileReader("src/main/resources/static/noticias.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea != null) {
				String[] lineaArreglo = linea.split("@@");
				Noticia noticia = new Noticia(lineaArreglo[0], lineaArreglo[2], lineaArreglo[1]);
				
				noticias.add(noticia);
				linea = br.readLine();
			}
			br.close();
			
		} catch (IOException e) {
			logger.error("Error al leer el fichero "+ "noticiasTXT" + ": " + e);
			e.printStackTrace();

		}
		logger.info("El achivo esta listo para ser enviado");
		return noticias;
	}

}
