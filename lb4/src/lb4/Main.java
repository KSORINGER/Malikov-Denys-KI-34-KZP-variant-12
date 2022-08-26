package lb4;

public class Main {

	public static void main(String[] args) {
	 Sea sea = new Sea("SeaofAzov", 354.4, 246.2, 0.07, 18);
	    System.out.println("This is " + sea.getName() + "!");
	    System.out.print("Length of " + sea.getName() + " = " + sea.getLength() + "km,");
		System.out.print(" width of this is " + sea.getWidth() + "km");
		System.out.print(" and " + sea.getDepth() + "km in depth. \n");		
		sea.setPorts(214);
		System.out.println(sea.getName() + " has " + sea.ports() + " ports.");
		System.out.println(sea.getName() + "'s volume ~ " + sea.Volume());
		System.out.println(sea.getName() + "'s square ~ " + sea.Square());
		sea.setPollution(2);	
		System.out.println(sea.getName() + " is " + sea.getPollution() + "% polluted.");
		sea.isPoluted();
		System.out.println(sea.getName() + " needs " + sea.yearstotransform() + " years to become swamp or fresh basin.");
		sea.setnumeroffauna(635);
		sea.setnumerofflora(414);
		System.out.println(sea.getName() + " - " + sea.fauna() + " fauna species.");
		System.out.println(sea.getName() + "'s flora " + sea.flora() + " species.");
         sea.WritetoFile();
	}

}
