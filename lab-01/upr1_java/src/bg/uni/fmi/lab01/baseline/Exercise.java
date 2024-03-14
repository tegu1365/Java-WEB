package bg.uni.fmi.lab01.baseline;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.sort;

public class Exercise {

    public int nthOddNumber(int[] array,int n) throws Exception {
        ArrayList<Integer> oddNumbers=new ArrayList<Integer>();
        for (var x:array){
            if(x%2!=0){
                oddNumbers.add(x);
            }
        }

        try{
            return oddNumbers.get(n-1);
        }catch (Exception e){
            throw new Exception("Index "+n+" exceeds the number of odd numbers in the array: "+oddNumbers.size());
        }
    }

    public void addFirst(ArrayList<String> list, String str){
        list.add(0,str);
    }
    public String addMiddle(ArrayList<String> list, int index){
       return list.get(index);
    }

    public void remove3th(ArrayList<String> list){
        list.remove(2);
    }
    public void replace2nd(ArrayList<String> list,String str){
        list.set(1,str);
    }



    public void sortDogs(){
        ArrayList<Dog> dogs=new ArrayList<Dog>();
        dogs.add(new Dog("Aaa",5));
        dogs.add(new Dog("Bss",3));
        dogs.add(new Dog("Asd",7));
        //dogs.sort(Dog::compareTo);
        Comparator<? super Dog> DogWeightComparator = new DogWeightComparator();
        sort(dogs,DogWeightComparator);
        System.out.println(dogs);
    }
    public void replace2nd(ArrayList<String> list,int n){
        list.set(1,list.get(n-1));
    }
    public boolean findElement(ArrayList<String> list, String str){
        return list.contains(str);
    }
    public int sizeOfMap(Map<Integer,String> map){
        return map.size();
    }

    public void flightsMapping(){
        Map<String,List<FlightLeg>> flights=new HashMap<String,List<FlightLeg>>();
        //flatMap
    }
}
