public class test {
    public static void main(String[] args){
        Robot rob = new Robot();
        rob.start();
        Robot.Brain brain = rob.new Brain();
        brain.think();
        //static inner classes
        Robot.Battery bat = new Robot.Battery();
        bat.charge();
        System.out.print(calculate(4));
    }
    public static int calculate(int val){
        if(val == 1){
            return 1;
        }
        return calculate(val-1) * val;
    }
}
