import java.util.*;

public class MapWithObjects implements Comparator<String> {
    public static void main(String[] args){
        People p1 = new People(1,"Mkululi",25);
        People p5 = new People(1,"Mkululi",25);
        People p2 = new People(2,"Manina",24);
        People p3 = new People(4,"James",29);
        People p4 = new People(5,"Bob",28);
        People p6 = new People(1,"Bill",25);
        People p7 = new People(2,"George",24);
        People p8 = new People(4,"Mac",29);
        People p9 = new People(5,"Steven",28);

        Map<People,Integer> maps = new LinkedHashMap<People,Integer>();
        maps.put(p1,1);
        maps.put(p5,1);
        maps.put(p9,2);
        maps.put(p2,3);
        maps.put(p3,4);
        maps.put(p4,5);
        maps.put(p6,6);
        maps.put(p7,7);
        maps.put(p8,8);
        ArrayList<String> snames = new ArrayList<String>();
        for(People pers: maps.keySet()){
            System.out.println(pers.name +"'s key: "+ pers+" Value: "+maps.get(pers));
            snames.add(pers.name);
        }
        Collections.sort(snames);
        System.out.println("=======Sorted names=========");
        for (String name: snames){
            System.out.println(name);
        }
        Collections.sort(snames, new MapWithObjects());
        System.out.println("=======Sorted according to name length=========");
        for (String name: snames){
            System.out.println(name);
        }
    }

    @Override
    public int compare(String o1, String o2) {
        int l1 = o1.length();
        int l2 = o2.length();
        if(l1 > l2){
            return 1;
        }
        else if(l1 < l2){
            return -1;
        }
        return 0;
    }
}
