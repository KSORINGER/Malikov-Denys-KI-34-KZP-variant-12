/**
 * package lb3
 */
package lb3;

import java.io.FileWriter;
import java.io.IOException;

public class Basin {
	
	 private String name;   
     private double length;
     private double width;
     private double depth;
     private Salinity salinity;
     private Pollution pollution;
     private Fauna fauna;
     private Flora flora;
 /**
  *   Constructor Basin to set short info about the object(water field)
  * @param name
  * @param length
  * @param width
  * @param depth
  */
     public Basin(String name, double length, double width) {
    	 this.name = name;
    	 this.length = length;
    	 this.width = width;
    	 salinity = new Salinity();
    	 pollution = new Pollution();
    	 fauna = new Fauna();
    	 flora = new Flora();
     }
     public Basin(String name, double length, double width, double depth) {
    	 this(name, length, width);
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
      * Method Volume return volume of basin
      * @return volume
      */
     public double Volume() {
    	 double volume = length * width * depth;
    	 return volume;   	 
    	 }

     /**
      * Method Square return square of basin
      * @return square
      */
     public double Square() {
    	 double sq = length * width;
    	 return sq;
     }
     
     public void setPollution(int pol) {
    	 pollution.setPollution(pol);
     }
     
     public int getPollution() {
    	 return pollution.getPollution();
     }
     
     public void isPolluted() {
    	 pollution.isPoluted();
     }
     
     
     public void setSalinity(int sal) {
    	 salinity.setSalinity(sal);
     }
     
     public int getSalinity() {
    	 return salinity.getSalinity();
     }
         
     public void TypeofBasin() {
    	 salinity.TypeofBasin();
     }
     
     public void setAmountFlora(int flr) {
    	 flora.setAmountFlora(flr);
     }
     public int getAmountFlora() {
    	 return flora.getAmountFlora();
     }
     
     public void floraInfo() {
    	 flora.floraInfo();
     }
     
     public int setAmountFauna(int fna) {
    	 fauna.setAmountFauna(fna);
     }
     public void getAmountFauna() {
    	 return fauna.getAmountFauna();
     }
     
     public void FaunaInfo() {
    	 fauna.FaunaInfo();
     }
     
     
     
     class Pollution {
    	 private int poll = 0;
    	 
    	 public void setPollution(int pollution) {
    		 this.poll = pollution;
    	 }
    	 
    	 public int getPollution() {
    		 return pollution;
    	 }   	 
         /**
          * Method give info about purity
          */
         public void isPoluted() {
        	 if(pollution > 5) {
        		 System.out.println("Is polluted!");
        	 } else {
        		 System.out.println("Is clear!");
        	 }  
        	 
         }
     }
     
     
     
     class Salinity {
    	 int sal;
    	 
    	 
    	 public void setSalinity(int salinity) {
    		 this.sal = salinity;
    	 }
    	 
    	 public void getSalinity() {
    		 return salinity;
    	 }
    	 
    	 
    	 /**
          * Method which determines type of basin according to salinity
          * @return
          */
         public String TypeofBasin() {
        	 if(salinity > 0 && salinity <= 2) {    		 
        		 return  "It's freshwatered basin(lake or river).";
        	 } else if (salinity > 2 && salinity < 5) {
        		 return "It's salty lake.";
        	 } else if (salinity > 5 && salinity < 24) {
        		 return "It's sea!";
        	 } else {
        		 return "This is ocean!";
        	 }
        	 
         } 
     }
     
     
     
     class Flora {
    	 
    	  int flr;
    	  
    	  public void setAmountFlora(int flora) {
    		  this.flr = flora;
    	  }
    	  
    	  public int getAmountFlora() {
    		  return flora;
    	  }
    	  
    	  public void floraInfo() {
    		  if(flora < 100 && flora >=0) {
    			  System.out.println("This basin has a little amount of flora.");
    		  } else {
    			  System.out.println("This basin has huge variety of flora!");
    		  }
    	  }
     }
     
     
     
     class Fauna {
    	 int fna;
    	 public void setAmountFauna(int fauna) {
    		 this.fna = fauna;
    	 }
    	 
    	 public int getAmountFauna() {
    		 return fauna;
    	 }
    	 
    	 public void FaunaInfo() {
        	 if(fauna >= 0 && fauna <= 250) {
        		 System.out.println("These waters have good variety of fauna.");
        	 } else {
        		 System.out.println("These waters have excellent variety of living beings!");
        	 }
    	 }

     }
     
     
          
     /**
      * WritetoFile designed for write info to file
      */
     public void WritetoFile()  {
    	 try (FileWriter fw = new FileWriter("laboratorka3.txt")) {
    		 fw.write("This is " + getName() + "\n");
    		 fw.write(getName() + "'s lenght = " + getLength() + "\n");
    		 fw.write(getName() + "'s width = " + getWidth() + "\n");
    		 fw.write(getName() + "'s depth = " + getDepth() + "\n");
    		 fw.write(getName() + "'s volume is " + Volume() + "\n");
    		 fw.write(getName() + "'s square  = "  + Square() + "\n");
    		 fw.write(getName() + "'s salinity is " + getSalinity() + "\n");
    		 fw.write(getName() + "'s pollution is " + getPollution() + "\n");
    		 fw.flush();
    		 fw.close();
    	 } catch (IOException exception) {    		 
    		 System.out.println(exception.getMessage());
    	 }
     }
}