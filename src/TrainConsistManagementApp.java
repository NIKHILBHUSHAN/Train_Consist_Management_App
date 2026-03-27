import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println(" UC6-Map Bogie to Capacity (HashMap) ");
        System.out.println("=====================================");
        Map<String,Integer> capacityMap=new HashMap<>();
        capacityMap.put("First Class",24);
        capacityMap.put("Cargo",120);
        capacityMap.put("sleeper",72);
        capacityMap.put("AC chair",56);
        for (Map.Entry<String,Integer> map:capacityMap.entrySet()){
            System.out.println(map.getKey()+"->"+map.getValue());
        }
        System.out.println("UC6 Boogie-Capacity mapping completed...");



    }

}
