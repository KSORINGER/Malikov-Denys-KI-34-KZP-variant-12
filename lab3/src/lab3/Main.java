package lab3;

public class Main {

	public static void main(String[] args) {
		Basin fb = new Basin("Black Sea", 732.3, 521.4, 2.4);
		System.out.println("This is " + fb.getName() + "!");
		System.out.print("Length of "+ fb.getName() + " = " + fb.getLength() + "km, ");
		System.out.print("width of this " + fb.getDepth() + " and ");
		System.out.print("depth of " + fb.getName() + " is " + fb.getDepth() + "km.\n");
		System.out.println(fb.getName() + "'s square " + fb.Square());
		System.out.println(fb.getName() + "'s volume " + fb.Volume());
		fb.setPollution(4);
		fb.setSalinity(22);
		System.out.println("Pollution is " + fb.getPollution() + "%");
		System.out.println("Salinity is " + fb.getSalinity() + "%");
		fb.isPolluted();
		fb.TypeofBasin();
		fb.setAmountFlora(344);
		System.out.print("Flora of "+ fb.getName() + " " + fb.getAmountFlora() + " species.");
		fb.FloraInfo();
		fb.WritetoFile();
	}

}
