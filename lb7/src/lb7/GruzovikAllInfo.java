package lb7;

public class GruzovikAllInfo {

	public static void main(String[] args) {
		Gruzovuk<? super GruzovikInfo> gruzovyk = new Gruzovuk<GruzovikInfo>();
		gruzovyk.WriteToPC(new Truck("Scania", 18000, 445.7, "Sand"));
		gruzovyk.WriteToPC(new Cistern("Volvo", 14000, 330.2, "Diesel", "65%"));
		gruzovyk.WriteToPC(new Cistern("Man", 26000, 585, "Gasoline", "48%"));
		gruzovyk.WriteToPC(new Truck("Daf", 11000, 180.2, "Cement"));
		GruzovikInfo smallestgruz = gruzovyk.findMinWeight();
        System.out.print("- - - - - - - - - - - - - - - - - - - - - - - -- - - - - - - - - - - - - -  \nThe lowest weight is in this:\n");
        smallestgruz.print();
	}
}

