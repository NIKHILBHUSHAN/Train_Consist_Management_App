import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("   UC2-Add Passenger Bogies to train ");
        System.out.println("=====================================");
        List<String> passengerBogies=new ArrayList<>();
        passengerBogies.add("sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("FirstClass");
        System.out.println("After adding boggies:\nPassenger Boggies:"+passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair:\nPassenger Boggies:"+passengerBogies);
        System.out.println("Checking if Sleeper exists:\nContains Sleeper? :"+passengerBogies.contains("sleeper"));
        System.out.println("Final Passenger Consist:\n"+passengerBogies);
        System.out.println("UC2 operations completed succesfully");

    }

}
