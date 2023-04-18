import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queing {
    public static void main(String[] args) {
        Queue<String> names = new LinkedBlockingDeque<String>(4);
        //alternatively we can use offer()
        names.add("Mkululi");
        names.add("Manina");
        names.add("James");
        names.add("John");
        names.offer("Manina");
        for (String name: names){
            System.out.println(name);
        }
        for (int i = 0; i < 5; i ++ ){
            //alternatively we can use remove()
            System.out.println(names.poll()+" removed");
        }
    }
}
