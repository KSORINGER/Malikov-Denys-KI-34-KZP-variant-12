package lb2;

import java.io.*;
import java.util.*;

/**
 * Клас Main реалізує приклад програми до лабораторної роботи №2
 * @author Malikov Denys
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {
	/**
	 * Статичний метод main є точкою входу в програму
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		int nRows;
		char[][] arr;
		String filler;

		Scanner in = new Scanner(System.in);
		File dataFile = new File("MyFile.txt");
		PrintWriter fout = new PrintWriter(dataFile);
		System.out.print("Enter the size of MATRIX: ");
		nRows = in.nextInt();
		in.nextLine();
		arr = new char[nRows][];
		for(int i = 0; i < nRows; i++)		{		 
			arr[i]= new char[nRows];
		}
		System.out.print("Enter filler-symbol: ");
		filler = in.nextLine();
		exit:
			for(int i = 0; i < nRows; i++)			{
				for(int j = 0; j < nRows; j++)				{
					
					if(filler.length() == 1)
					{
						        if(i < nRows/2 && j < nRows/2)
						        	arr[i][j] = (char) filler.codePointAt(0);
						        if(i > (nRows/2 - 1) && j > (nRows/2 - 1))
						        	arr[i][j] = (char) filler.codePointAt(0);						
						System.out.print(arr[i][j] + " ");
						fout.print(arr[i][j] + " ");
					}
					else if (filler.length() == 0)
					{
						System.out.println("Symbol not entered: ");
						break exit;
					}
					else 
					{
						System.out.print("Too much symbols: ");
						break exit;
					}
				}
				System.out.print("\n");
				fout.print("\n");
			}
		fout.flush();
		fout.close();
	}
}
