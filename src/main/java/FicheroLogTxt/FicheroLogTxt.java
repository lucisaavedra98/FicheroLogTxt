package FicheroLogTxt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroLogTxt {

	private static final Logger LOGGER = LoggerFactory.getLogger(FicheroLogTxt.class);

	public static void main(String[] args) {
		String ruta = "log.txt";
		File archivo = new File(ruta);
		FileWriter file = null;
		PrintWriter pw = null;
		System.out.println("INICIANDO");
		try {
			LOGGER.info("Iniciando escritura de fichero...");
			file = new FileWriter(ruta,true);
			if (archivo.exists()) {
				LOGGER.info("Modificando fichero existente...");
			}
			
			else {
				LOGGER.info("Creando fichero nuevo...");
			}
			
			pw = new PrintWriter(file);
			pw.println("¿Qué es poesía? Dices mientras clavas");
			pw.println("en mi pupila tu pupila azul;");
			pw.println("¿Qué es poesía...? ¿Y tú me lo preguntas?");
			pw.println("¡Poesía... eres tú!");
			
			pw.close();
			LOGGER.info("Fin escritura de fichero..."); 
		} catch (IOException e) {
			e.printStackTrace();
			pw.close();
			LOGGER.info("Fin escritura de fichero...");
		}
		System.out.println("FIN");
	}

}
