// This lesson teaches passing variables through function.
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processing...");
        MyUtils.printStuff(",I made this");
        MyUtils.printStuff2(5);
        MyUtils.sum2Numbers(5, 6);
        int myVar = MyUtils.add10(25) ; // Because the add10
        System.out.println(myVar);
    }

}
