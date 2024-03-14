package bg.uni.fmi.lab01.baseline;

import java.util.Comparator;

public class DogWeightComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
