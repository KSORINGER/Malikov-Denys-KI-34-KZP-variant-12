package lb4;

import java.io.FileWriter;
import java.io.IOException;

abstract class Basin {
	
	 private String name;   
    private double length;
    private double width;
    private double depth;
    private double pollution;
/**
 *   Constructor Basin to set short info about the object(water field)
 * @param name
 * @param length
 * @param width
 * @param depth
 */
    public Basin(String name, double length, double width, double depth) {
   	 this.name = name;
   	 this.length = length;
   	 this.width = width;
   	 this.depth = depth;
    }
  /**
   *   Method to get name   
   * @return name
   */
    public String getName() {   	 
   	 return name;
    }
    /**
     *   Method to get length   
     * @return length
     */
    public double getLength() {       	 
   	 return length;
    }
    /**
     *   Method to get width
     * @return width
     */
    public double getWidth() {    	 
   	 return width;
    }
    /**
     *   Method to get depth   
     * @return depth
     */
    public double getDepth() {       	 
   	 return depth;
    }
    /**
     *   Method to get pollution   
     * @return pollution
     */
    public double getPollution() {     	 
   	 return pollution;
    }   
    /**
     * Method to set pollution of water 
     * @param poll
     */
    public void setPollution(int poll) {
   	 pollution = poll;
    }
	/**
     * Method give info about purity
     */
    public void isPoluted() {
   	 if(pollution > 5) {
   		 System.out.println(name + " is polluted!");
   	 } else {
   		 System.out.println(name + " is clear!");
   	 }     	 
    }
  
    /**
     * Method Volume return volume of basin
     * @return volume
     */
    public double Volume() {
   	 double volume = length * width * depth;
   	 return Math.round(volume);   	 
   	 }

    /**
     * Method Square return square of basin
     * @return square
     */
    public double Square() {
   	 double sq = length * width;
   	 return Math.round(sq);
    }
       
     protected abstract void WritetoFile();	    
}