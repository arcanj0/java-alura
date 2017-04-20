package org.arcanjo.alura.java3.testeIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) throws FileNotFoundException {

		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
		System.out.println("Digite sua mensagem: ");
		
		while (entrada.hasNextLine()){
			
			System.out.println(entrada.nextLine());
			
		}
		
		entrada.close();
		
	}

}