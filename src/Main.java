public class Main {
    public static void main(String[] args) {
        //Arrays
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        String[] names = {"name","surname","age","DOB"};
        System.out.println("Hello world!");

        for(int i = 0; i < names.length;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println(" ");
        for(String name: names){
            System.out.print(name+" ");
        }
        //Multi dimensional arrays

        int[][] grid = {{1,2,3,4,5,6,7},
                        {5,6,7,8,9},
                        {2,3,4,5,6,7,8},
                        {5,6,7,8,9}};
        System.out.println();
        for(int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        Person p1 = new Person();
        p1.name = "Joe Bloggs";
        p1.age = 23;
        Person p2 = new Person();
        p2.name = "Sarah Smith";
        p2.age = 32;
        //System.out.println(p2.name);
        p1.speak();
        System.out.println("Years till retirement: " +p1.calculateRet());
        p2.speak();
        System.out.println("Years till retirement: " +p2.calculateRet());
    }
}
class Person{
    String name;
    int age;
    public  void speak(){
        System.out.println("My name is "+ this.name+
                " I am "+age+" years old.");
    }
    public int calculateRet(){
        int yearsl = 65 - age;
        return yearsl;
    }
}