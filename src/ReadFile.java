import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args){
        try(FileInputStream fl = new FileInputStream("people.bin")){
            ObjectInputStream os = new ObjectInputStream(fl);
            People p1 = (People)os.readObject();
            People p2 = (People)os.readObject();
            os.close();
            System.out.println(p1.age);
            System.out.println(p2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
