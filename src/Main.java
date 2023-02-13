import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        System.out.println("Enter a number to start the count");
        int number = scanner.nextInt();

        System.out.println("If you want to stop the loop, enter 0");
        while (number != 0) {
            number = scanner.nextInt();
            if(number > 0 ){
                positive++;
            }else if(number < 0) {
                negative++;
            }
        }
        System.out.println("Positive numbers: "+ positive);
        System.out.println("Negative numbers: "+ negative);


    }
}
