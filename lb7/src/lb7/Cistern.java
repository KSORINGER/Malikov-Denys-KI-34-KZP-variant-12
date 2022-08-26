package lb7;

public class Cistern implements GruzovikInfo {
	
	private String mark;
	private  int materialWeight;
	private  double bakVolume;
	private  String materialType;	
    private String explosiveness;
    
	public Cistern(String mark, int materialWeight, double bakVolume, String materialType, String explosiveness ) {
		this.mark = mark;
    	this.materialWeight = materialWeight;
    	this.bakVolume = bakVolume;
    	this.materialType = materialType;  
		this.explosiveness = explosiveness;	
	}
	
	public String getMark() { 
		return mark;
	}
	
	public String getExplosiveness() {
		return explosiveness;
	}
	
	public String getMaterialType() {
		return materialType;
	}
	
	@Override
	public int compareTo(GruzovikInfo o) {
		 Integer i = materialWeight;
	        return i.compareTo(o.materialWeight());		
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
		System.out.print(getMark() + " is cistern, " + " it trandporting material of weight" + materialWeight() + 
				"kg,\n" + "volume of bak is very big ~ " + bakVolume() + "l. This gruzovyk is transporting  " + getMaterialType() +".\n\n");
		
	}

}
