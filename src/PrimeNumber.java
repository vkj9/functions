import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeOrNot = input.nextInt();
        boolean isPrime = checkPrime(primeOrNot);
        System.out.println(isPrime);
    }

    private static boolean checkPrime(int primeOrNot) {
        int c=2;
        if(primeOrNot<=1){
            System.out.println("Neither Prime Nor Composite");
            return false;
        }
        else {
            while (c*c<=primeOrNot){
                if (primeOrNot%c == 0) {
                    return false;
                }
                c++;
                }
                return true;
            }

        }
    }

