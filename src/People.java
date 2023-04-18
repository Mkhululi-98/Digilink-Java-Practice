import java.io.Serializable;
import java.util.Objects;

public class People implements Serializable {
    int id;
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id && age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public  People(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Person ID "+ id+", name " + name +", age "+age;
    }
}
