import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args){
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> lList = new LinkedList<Integer>();

        doTimings("ArrayList",aList);
        doTimings("LinkedList",lList);
    }
    public static void doTimings(String type, List<Integer> list){

        for(int i = 0; i < 1E5;i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1E5;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken = "+(end - start)+" For type: "+type);
    }
}
