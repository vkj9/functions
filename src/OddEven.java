import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numToCheck = input.nextInt();
        oddOrEven(numToCheck);
    }

    private static void oddOrEven(int numToCheck) {
        if(numToCheck%2==0) System.out.println("Number is Even");
        else System.out.println("Number is odd");
    }
}
