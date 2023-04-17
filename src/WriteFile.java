import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {

    public static void main(String[] args){
        People p1 = new People(1,"Mkululi",25);
        People p2 = new People(2,"Manina",24);

        try(FileOutputStream fl = new FileOutputStream("people.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fl);
            os.writeObject(p1);
            os.writeObject(p2);
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
