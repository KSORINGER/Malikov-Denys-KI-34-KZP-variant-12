package lb4;

import java.io.FileWriter;
import java.io.IOException;

public class Sea extends Basin implements MoreInfo {

	private int salinity;
	private int ports;
	private int fauna;
	private int flora;
    private int yearstotransform;
	public Sea(String name, double length, double width, double depth, int salinity) {
		super(name, length, width, depth);
		this.salinity = salinity;		
	}	
	
    public int getSalinity() {
    	return salinity;
    }
	
	public void setPorts(int ports) {
		this.ports = ports;
	}
	
	public void setnumeroffauna(int fauna) {
		this.fauna = fauna;
	}
	
	public void setnumerofflora(int flora) {
		this.flora = flora;
	}
	
	public int yearstotransform() {
		int yearstotransform = (int) (Volume() / 0.5);
		return yearstotransform;
	}
	
	@Override
	public int ports() {
		return ports;
	}
	@Override
	public int fauna() {
		return fauna;
	}
	@Override
	public int flora() {
		return flora;
	}
	
	protected void WritetoFile()  {
	   	 try (FileWriter fw = new FileWriter("laboratorka4.txt")) {
	   		 fw.write("This is " + getName() + "\n");
	   		 fw.write(getName() + "'s lenght = " + getLength() + "\n");
	   		 fw.write(getName() + "'s width = " + getWidth() + "\n");
	   		 fw.write(getName() + "'s depth = " + getDepth() + "\n");
	   		 fw.write(getName() + "'s volume is " + Volume() + "\n");
	   		 fw.write(getName() + "'s square  = "  + Square() + "\n");
	   		 fw.write(getName() + "'s salinity is " + getSalinity() + "\n");
	   		 fw.write(getName() + "'s pollution is " + getPollution() + "\n");
	   		 fw.write(getName() + " has " + ports() + "\n");
	   		 fw.write(getName() + "'s flora " + flora() + " species." + "\n");
	   		 fw.write(getName() + " - " + fauna() + " fauna species." + "\n");
	   		 fw.write(getName() + " needs " + yearstotransform() + " years to restore." + "\n");	   		 
	   		 fw.flush();
	   		 fw.close();
	   	 } catch (IOException exception) {    		 
	   		 System.out.println(exception.getMessage());
	   	 }
	    }
}
