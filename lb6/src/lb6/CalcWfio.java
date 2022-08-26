package lb6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class CalcWfio {
	public void writeResTxt(String fName) throws FileNotFoundException {
		PrintWriter f = new PrintWriter(fName);
		f.printf("%f ",y);
		f.close();
	}
	public void readResTxt(String fName) {
		try	{
			File f = new File (fName);
			if (f.exists())	{
				Scanner s = new Scanner(f);
				y = s.nextDouble();
				s.close();
			} else
				throw new FileNotFoundException("File " + fName + "not found");
		}
		catch (FileNotFoundException ex) {
			System.out.print(ex.getMessage());
		}
	}
	public void writeResBin(String fName) throws FileNotFoundException, IOException {
		DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
		f.writeDouble(y);
		f.close();

	}
	public void readResBin(String fName) throws FileNotFoundException, IOException {
		DataInputStream f = new DataInputStream(new FileInputStream(fName));
		y = f.readDouble();
		f.close();
	}
	private double y;
	public double calculate(int x) throws CalcException {
		double rad;
		rad = x * Math.PI / 180.0;
		try {
			y = (Math.sin(rad) / 4 * Math.tan(rad));
			if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
					y==Double.POSITIVE_INFINITY || x==0 || x == 360 || x == -360 || x == 180 || x == -180 || 
					 rad==Math.PI/2.0 || rad==-Math.PI/2.0 || rad == 3.0 *Math.PI / 2.0 || rad == -3.0 *Math.PI / 2.0)
				throw new ArithmeticException();
		} catch (ArithmeticException ex) {
			if (rad==Math.PI/2.0 || rad==-Math.PI/2.0 || rad == 3.0 *Math.PI / 2.0 || rad == -3.0 *Math.PI / 2.0 )
				throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
						else if (x==0 || x == 360 || x == -360 || x == 180 || x == -180)
							throw new CalcException("Exception reason: X = 0");
								else
									throw new CalcException("Unknown reason of the exception during exception calculation");
		}
		return y;
	}	
	public double getResult() {
		return y;
	}
}