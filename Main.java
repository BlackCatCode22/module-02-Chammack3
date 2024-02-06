public class Main {
    public static int compareTwoInts(int a, int b) {
        return Math.max(a, b);
    }
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 23;

        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);

        int largerInt = compareTwoInts(num1, num2);
        System.out.println("Larger integer: " + largerInt);

        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of the two integers: " + sum);
    }
}


