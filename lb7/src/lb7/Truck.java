package lb7;

public class Truck implements GruzovikInfo {

	private  String mark;
	private  int materialWeight;
	private  double bakVolume;
	private  String materialType;
	
	
    public Truck(String mark, int materialWeight, double bakVolume, String materialType) {
    	this.mark = mark;
    	this.materialWeight = materialWeight;
    	this.bakVolume = bakVolume;
    	this.materialType = materialType;    	
    }
	
	public String getMark() {
		return mark;
	}
    
	public String getMaterialType() { 
		return materialType;
	}
    
	@Override
	public int compareTo(GruzovikInfo gi) {		
		 Integer i = materialWeight;
	        return i.compareTo(gi.materialWeight());
	}

	@Override
	public int materialWeight() {
		return materialWeight;
	}

	@Override
	public double bakVolume() {		
		return bakVolume;
	}

	@Override
	public void print() {
		System.out.print("This is truck " + getMark() +  ", it transporing material of weight = " + materialWeight() + 
				"kg,\n" + "volume of bak is very big ~ " + bakVolume() + "l. This gruzovyk is transporting  " + getMaterialType() + ".\n\n");
				
	}
}
