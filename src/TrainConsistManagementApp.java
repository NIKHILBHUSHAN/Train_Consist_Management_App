import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static List<Bogie> bogieList;
    static class Bogie{
        String name;
        int capacity;
        Bogie(String name,int capacity){
            this.name=name;
            this.capacity=capacity;
        }
    }

    public static List<Bogie> addlistofbogies(){
        bogieList=new ArrayList<>();
        bogieList.add(new Bogie("Sleeper",72));
        bogieList.add(new Bogie("AC Chair",56));
        bogieList.add(new Bogie("First Class",24));
        bogieList.add(new Bogie("General",90));
        return bogieList;
    }
    public static void main(String[] args){
        System.out.println("=======================================");
        System.out.println("UC8-Filter Passenger Bogies Using Streams");
        System.out.println("=======================================");
        addlistofbogies();
        System.out.println("All Bogies");
        for (Bogie b:bogieList){
            System.out.println(b.name+"->"+b.capacity);
        }
        System.out.println("\nAfter filtering");
        List<Bogie> result=bogieList.stream().filter(bogie -> bogie.capacity>60).collect(Collectors.toList());
        for (Bogie b:result){
            System.out.println(b.name+"->"+b.capacity);
        }

        System.out.println("UC8 filtering completed...");



    }


}
