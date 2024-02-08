public class Main {
    public static void main(String[] args) {

        System.out.println("Enter three integers: ");
        
        int num1 = 890;
        int num2 = 78;
        int num3 = 4567;

        int largest;
        if (num2 < num1) { if (num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        } else {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        }

        System.out.println("The largest integer is: " + largest);
    }
}
