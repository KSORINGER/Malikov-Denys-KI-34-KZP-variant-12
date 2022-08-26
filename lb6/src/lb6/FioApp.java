package lb6;

import java.io.*;
import java.util.*;

public class FioApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner s = new Scanner(System.in);
		CalcWfio obj = new CalcWfio();		
		System.out.print("Enter x -> ");
		obj.calculate(s.nextInt());
		System.out.println("Result of example is: " + obj.getResult());
		obj.writeResTxt("textRes.txt");
		obj.writeResBin("BinRes.bin");
		obj.readResBin("BinRes.bin");
		System.out.println("Result(bin) is: " + obj.getResult());
		obj.readResTxt("textRes.txt");
		System.out.println("Result(text) is: " + obj.getResult());
		s.close();
	}
}
