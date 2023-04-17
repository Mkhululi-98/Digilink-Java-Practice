import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsCollections {
    public static void main(String[] args){
        HashMap<Integer,String> hMap = new HashMap<Integer,String>();
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<Integer,String>();
        TreeMap<Integer, String> tMap = new TreeMap<Integer,String >();
        System.out.println("===============HashMap===============");
        testMap(hMap);
        System.out.println("===============LinkedHashmap===============");
        testMap(lhMap);
        System.out.println("==============TreeMap================");
        testMap(tMap);
    }

    public static void testMap(Map<Integer,String> map){
        map.put(45,"Pirates");
        map.put(1,"Sundowns");
        map.put(5,"Chiefs");
        map.put(8,"Royal AM");
        map.put(7,"Amazulu");
        map.put(10,"Maritzburg united");

        for(Integer keys: map.keySet()){
            System.out.println(keys+": "+ map.get(keys));
        }
    }
}
