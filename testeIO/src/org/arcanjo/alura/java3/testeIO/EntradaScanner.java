package org.arcanjo.alura.java3.testeIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
        OutputStream os = new FileOutputStream("saida.txt");
        PrintStream saida = new PrintStream(os);
		
		while (entrada.hasNextLine()){
			
			saida.println(entrada.nextLine());
			
		}
		
		entrada.close();
		saida.close();
	}

}