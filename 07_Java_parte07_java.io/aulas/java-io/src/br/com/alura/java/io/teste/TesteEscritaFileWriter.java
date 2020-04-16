package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		/*
		OutputStream fos = new FileOutputStream("lorem4.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		*/
		
		//opcao 1
		/*
		FileWriter fw = new FileWriter("lorem4.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        
        fw.close();
		*/
		
		//opcao 2
		/*
		FileWriter fw = new FileWriter("lorem4.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();
		*/
		
		//opcao 3
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();
		
		
	}
}
