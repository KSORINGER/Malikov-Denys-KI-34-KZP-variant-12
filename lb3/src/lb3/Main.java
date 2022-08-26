/**
 * package lb3
 */
package lb3;

/**
 * Class Main implements main method for class Basin to demonstrate possibilities of this class
 * @author Denys Malikov
 *
 */
public class Main {	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Basin firstbasin = new Basin("BlackSea", 1167.3, 673.4, 1.3);
				
		System.out.println("This is " + firstbasin.getName() + "!");
		System.out.print("Length of " + firstbasin.getName() + " = " + firstbasin.getLength() + "km,");
		System.out.print(" width of this is " + firstbasin.getDepth() + "km");
		System.out.print(" and " + firstbasin.getDepth() + "km in depth. \n");				
		System.out.println(firstbasin.getName() + "'s volume = " + firstbasin.Volume());
		System.out.println(firstbasin.getName() + "'s square = " + firstbasin.Square());
		firstbasin.setPollution(2);
		firstbasin.setSalinity(18);	
		System.out.println(firstbasin.getName() + " is " + firstbasin.getPollution() + "% polluted.");	
		firstbasin.isPoluted();
		System.out.println(firstbasin.getName() + "'s salinity is " + firstbasin.getSalinity() + "%.");		
		System.out.println(firstbasin.TypeofBasin());		
		firstbasin.WritetoFile();
	}
	
}
