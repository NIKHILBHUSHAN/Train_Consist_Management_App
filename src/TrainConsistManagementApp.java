import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("UC4 - Maintain ordered Bogie Consist");
        System.out.println("=====================================");
        List<String> trainConsist=new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Gaurd");
        System.out.println("Initial train consist:\n"+trainConsist+"\n");
        trainConsist.add(2,"Pantry  car");
        System.out.println("After adding Pantry car at posistion 2:\n"+trainConsist+"\n");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("after removing last and first bogie:\n"+trainConsist+"\n");
        System.out.println("UC4 ordered consist operations completed...");

    }

}
