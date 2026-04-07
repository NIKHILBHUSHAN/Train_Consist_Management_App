import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest  {

    static List<TrainConsistManagementApp.Bogie> bogieList=TrainConsistManagementApp.addlistofbogies();



    static List<TrainConsistManagementApp.Bogie> fbc(int threHold){
        return bogieList.stream().filter(bogie -> bogie.capacity>threHold).collect(Collectors.toList());
    }

   @Test
    void testFilter_CapacityGreaterThanThreshold(){

        List<TrainConsistManagementApp.Bogie> list=fbc(70);
       assertEquals(2,list.size());

    }

}