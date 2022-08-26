package lb7;

import java.util.ArrayList;

public class Gruzovuk<T extends GruzovikInfo> {
	private ArrayList<T> arr;

    public Gruzovuk() {
        arr = new ArrayList<T>();
    }
//find minimal material weight
    public T findMinWeight() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(min) < 0)
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

    public void WriteToPC(T dani) {
        arr.add(dani);
        System.out.println("------------------------ Element turned to Base:---------------------------");
        dani.print();
    }

    public void DeleteData(int x) {
        arr.remove(x);
    }
}

