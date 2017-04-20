package org.arcanjo.alura.java3.testeIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
			
		InputStream is = System.in; //new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Digite seu texto: ");
		String linha = br.readLine();
		
		while (linha != null){
			
			System.out.println(linha);
			linha = br.readLine();
			
		}
		
	}

}
