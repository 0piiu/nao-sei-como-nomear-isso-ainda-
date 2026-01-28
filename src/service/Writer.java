package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements TextWriter{

	@Override
	public boolean writer(String txt, File path) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			String line;
			while(line != null) {
				
			}
		}
		catch(IOException e ) {
			System.out.println("Erro " + e.getMessage());
		}
	}
	
}
