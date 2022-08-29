/**
 * package lab3
 */
package lab3;

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
     
     
     /**
      * Method to set pollution
      * 
      */
     public void setPollution(int pol) {
    	 pollution.setPollution(pol);
     }
     
     /**
      * Method to get pollution
      * 
      */
     public int getPollution() {
    	 return pollution.getPollution();
     }
     
     /**
      * Method give info about purity
      */
     public void isPolluted() {
    	 pollution.isPoluted();
     }
     
     /**
      * Method to set salinity of water
      * 
      */
     public void setSalinity(int sal) {
    	 salinity.setSalinity(sal);
     }
     
     /**
      * Method to get salinity of water
      * 
      */
     public int getSalinity() {
    	 return salinity.getSalinity();
     }
     /**
      * Method to take info about type of basin accTo salinity
      * 
      */  
     public void TypeofBasin() {
    	 salinity.TypeofBasin();
     }
     
     /**
      * Method to set flora 
      * 
      */
     public void setAmountFlora(int flr) {
    	 flora.setAmountFlora(flr);
     }
     
     /**
      * Method to get flora of water
      * 
      */
     public int getAmountFlora() {
    	 return flora.getAmountFlora();
     }
     
     /**
      * Method to take floraInfo
      * @param flora
      */
     public void FloraInfo() {
    	 flora.FloraInfo();
     }
     /**
      * Method to set fauna 
      * 
      */
     public void setAmountFauna(int fna) {
    	 fauna.setAmountFauna(fna);
     }
     /**
      * Method to get water amount fauna
      * @param fauna
      */
     public int getAmountFauna() {
    	 return fauna.getAmountFauna();
     }
     /**
      * Method to take fauna info
      * 
      */
     public void FaunaInfo() {
    	 fauna.FaunaInfo();
     }
     
     
     
  class Pollution {
    	 private int poll;
    	 
    	 public void setPollution(int pollution) {
    		 this.poll = pollution;
    	 }
    	 
    	 public int getPollution() {
    		 return poll;
    	 }   	 

         public void isPoluted() {
        	 if(poll > 5) {
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
    	 
    	 public int getSalinity() {
    		 return sal;
    	 }
         public String TypeofBasin() {
        	 if(sal > 0 && sal <= 2) {    		 
        		 return  "It's freshwatered basin(lake or river).";
        	 } else if (sal > 2 && sal < 5) {
        		 return "It's salty lake.";
        	 } else if (sal > 5 && sal < 24) {
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
    		  return flr;
    	  }
    	  
    	  public void FloraInfo() {
    		  if(flr < 100 && flr >=0) {
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
    		 return fna;
    	 }
    	 
    	 public void FaunaInfo() {
        	 if(fna >= 0 && fna <= 250) {
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