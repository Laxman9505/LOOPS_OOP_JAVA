import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which you want fabonicci series of");
        int count = sc.nextInt();
        int number1 = 0,number2 = 1;
        int i = 1;
        while (i<= count){
            System.out.print(number1 + "");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
            i++;
        }
    }
}
