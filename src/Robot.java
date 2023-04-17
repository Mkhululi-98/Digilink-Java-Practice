public class Robot {
    private  int id;
    public Robot(){

    }
    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot");
        Brain br = new Brain();
    }
    class Brain{
        public void think(){
            System.out.print("Robot "+id+" is thinking");
        }
    }
    static class Battery{
        public void charge(){
            System.out.println("Charging battery... ");
        }
    }
}
