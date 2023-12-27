public class MyUtils {

    public static void printStuff(String argument) { // Pass a String argument
        System.out.println("You know what? " + argument);
    }

    public static void printStuff2(int argumentINT) { // Pass an integer argument
        System.out.println("You lucky number is:  " + argumentINT);
    }

    public static void sum2Numbers(int x, int y) { // add two numbers together
        System.out.println(x + y);
    }

    public static int add10(int x) { // add 10 to a number
        int result = x + 10;
        return result;
    }
}
