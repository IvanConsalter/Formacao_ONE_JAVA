package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteClasseSystem {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in; 
		//tente o tipo generico InputStream
		
		InputStreamReader isr = new InputStreamReader(fis);
		//tente o tipo generico Reader
		
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}

}
