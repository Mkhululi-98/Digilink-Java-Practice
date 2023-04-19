import java.io.*;
import java.util.Scanner;

public class Machine {
    public void readFil(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner read = new Scanner(file);

        while(read.hasNext()){
            System.out.println(read.nextLine());
        }
    }
}
class App{
    public static void main(String[] args) throws FileNotFoundException{
        Machine files = new Machine();
        files.readFil("C:/Users/mkululi/Desktop/res.txt");
        //Anonymous Class Implementation
        Machine anon = new Machine(){
            @Override public void readFil(String Fname){
                System.out.printf("Cannot read file: %30s",Fname);
            }
        };
        anon.readFil("Names.txt");
    }
}