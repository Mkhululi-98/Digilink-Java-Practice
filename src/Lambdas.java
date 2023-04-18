public class Lambdas {
    public static void main(String[] args) {
        Runner rn = new Runner();
        rn.run(new Executable() {
            @Override
            public int exec(int a, int b) {
                return a + b;
            }
        });
        System.out.println("======Lambda======");

        rn.run((int a, int b )->{
            System.out.println(a+b);
            return a + b;
        });
    }
}
class Runner{
    public void run(Executable e){
        System.out.println("Running....");
        int a = e.exec(1,2);
    }
}
interface Executable{
    public int exec(int a, int b );
}