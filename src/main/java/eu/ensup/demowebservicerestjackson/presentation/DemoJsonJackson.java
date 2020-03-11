package eu.ensup.demowebservicerestjackson.presentation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.ensup.demowebservicerestjackson.domaine.Employe;

/**
 * Hello world!
 *
 */
public class DemoJsonJackson {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Employe empl = new Employe("NDIAYE", "Khady");
		List<Employe> listEmployes = new ArrayList<Employe>();
		listEmployes.add(empl);
		listEmployes.add(new Employe("FALL", "Yacine"));

		// Object vers fichier Json
		File resultfile = new File("employe.json");
		mapper.writeValue(resultfile, listEmployes);

		// Json vers 1 Object
//		Employe listEmploye = mapper.readValue(resultfile, Employe.class);
//		System.out.println(listEmploye);

		// Json vers 1 liste Object
		listEmployes = mapper.readValue(resultfile, List.class);
		System.out.println(listEmployes);
	}
}
