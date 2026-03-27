
import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("UC5-preserve insertion orders of bogies");
        System.out.println("=====================================");
        Set<String> trainConsist=new LinkedHashSet<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");

        trainConsist.add("Cargo");
        trainConsist.add("Gaurd");
        trainConsist.add("Sleeper");
        System.out.println("Final Train Formation:\n"+trainConsist+"\n");
        System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically");




        System.out.println("UC5 formation setup completed...");



    }

}
