import java.io.Serializable;

public class People implements Serializable {
    int id;
    String name;
    int age;

    public  People(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Person ID "+ id+", name " + name +", age "+age;
    }
}
