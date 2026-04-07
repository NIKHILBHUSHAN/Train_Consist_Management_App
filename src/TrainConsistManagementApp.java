import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    static class Bogie{
        String name;
        int capacity;
        Bogie(String name,int capacity){
            this.name=name;
            this.capacity=capacity;
        }
    }
    public static void main(String[] args){
        System.out.println("=======================================");
        System.out.println("UC7-Sort Bogies by Capacity(Comparator)");
        System.out.println("=======================================");
        List<Bogie> bogieList=new ArrayList<>();
        bogieList.add(new Bogie("Sleeper",72));
        bogieList.add(new Bogie("AC Chair",56));
        bogieList.add(new Bogie("First Class",24));
        bogieList.add(new Bogie("General",90));
        System.out.println("Before Sorting:");
        for (int i=0;i<bogieList.size();i++){
            System.out.println(bogieList.get(i).name+"->"+bogieList.get(i).capacity);
        }
        System.out.println("\nAfter Sorting:");
        bogieList.sort((b1,b2)->b1.capacity-b2.capacity);
        for (int i=0;i<bogieList.size();i++){
            System.out.println(bogieList.get(i).name+"->"+bogieList.get(i).capacity);
        }
        System.out.println("UC7 Sorting completed...");



    }

}
