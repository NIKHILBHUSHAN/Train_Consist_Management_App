import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest  {

    static List<TrainConsistManagementApp.Bogie> bogieList=TrainConsistManagementApp.addlistofbogies();



    static List<TrainConsistManagementApp.Bogie> CapacityGreaterThanThreshold(int Threshold){
        return bogieList.stream().filter(bogie -> bogie.capacity>Threshold).collect(Collectors.toList());
    }

   @Test
    void testFilter_CapacityGreaterThanThreshold(){

        List<TrainConsistManagementApp.Bogie> list=CapacityGreaterThanThreshold(70);
       assertEquals(2,list.size());

    }

    List<TrainConsistManagementApp.Bogie> CapacityEqualToThreshold(int Threshold){
        return bogieList.stream().filter(bogie->bogie.capacity>=Threshold).collect(Collectors.toList());
    }
    @Test
    void testFilter_CapacityEqualToThreshold(){
        List<TrainConsistManagementApp.Bogie> list=CapacityEqualToThreshold(70);
        assertEquals(2,list.size());
    }

    List<TrainConsistManagementApp.Bogie> CapacityLesserThanThreshold(int Threshold){
        return bogieList.stream().filter(bogie->bogie.capacity<Threshold).collect(Collectors.toList());
    }
    @Test
    void testFilter_CapacityLessThanThreshold(){
        List<TrainConsistManagementApp.Bogie> list=CapacityLesserThanThreshold(70);
        assertEquals(2,list.size());
    }
    @Test
    void testFilter_MultipleBogiesMatching(){
        List<TrainConsistManagementApp.Bogie> list=CapacityGreaterThanThreshold(70);
        assertTrue(list.size()>1);
        for(TrainConsistManagementApp.Bogie b:list){
            assertTrue(b.capacity>70);
        }
    }

    @Test
    void testFilter_NoBogiesMatching(){
        List<TrainConsistManagementApp.Bogie> list=CapacityGreaterThanThreshold(100);
        assertTrue(list.size()==0);
    }

    @Test
    void testFilter_AllBogiesMatching(){
        List<TrainConsistManagementApp.Bogie> list=CapacityGreaterThanThreshold(10);
        assertEquals(4,list.size());
    }

    @Test
    void testFilter_EmptyBogieList(){
        List<TrainConsistManagementApp.Bogie> emptylist=new ArrayList<>();
        List<TrainConsistManagementApp.Bogie> result=emptylist.stream().filter(bogie->bogie.capacity>70).collect(Collectors.toList());
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged(){
        List<TrainConsistManagementApp.Bogie> list=CapacityGreaterThanThreshold(10);
        assertEquals(bogieList.size(),list.size());
        assertEquals(bogieList,list);
    }

}
