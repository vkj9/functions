import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1=input.nextInt();
        int n2 =input.nextInt();
        int n3 = input.nextInt();
        maxNum(n1,n2,n3);
        minNum(n1,n2,n3);
    }

    private static void maxNum(int n1, int n2, int n3) {
        int temp = Math.max(n1,n2);
        temp = Math.max(n3,temp);
        System.out.println("Max number is :- "+temp);
    }

    private static void minNum(int n1, int n2, int n3) {
        int temp = Math.min(n1,n2);
        temp = Math.min(n3,temp);
        System.out.println("Min number is :- "+temp);
    }

}
