package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lines = new String [] {"Good Morning", "Good Afternon", "Good Night"};
		String path = "c:\\temp\\out.txt"; //arquivo de saida
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String l:lines) {
				bw.write(l);
				bw.newLine();
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
