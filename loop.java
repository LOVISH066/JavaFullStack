import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        int evenSum = 0;
        int Altsum = 0;
        int fact = 1;

        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a++;
        }

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println("Sum: " + sum);

        for (int k = 0; k < arr.length; k++) {
            if (k % 2 == 0) {
                evenSum = evenSum + arr[k];
            }
        }
        System.out.println("Even Sum: " + evenSum);

        for (int l = 0; l < arr.length; l = l + 2) {

            Altsum = Altsum + arr[l];
        }
        System.out.println("Alt Sum: " + Altsum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shoe Brand Name: ");
        String user = sc.next();

        if (user.equals("nike")) {
            System.out.println("Just do it");
        } 
        else if (user.equals("adidas")) {
            System.out.println("Impossible is Nothing");
        } 
        else if(user.equals("sketchers")) {
            System.out.println("Make Walking Your Workout");
        } 
        else {
            System.out.println("No shoe brand found");
        }

        System.out.println("Enter any number to check it prime or not");
        
        int num = sc.nextInt();

        for (int m = 2; m <= num; m++) {
            if (num % m == 0) {
                System.out.println("It is prime");
            } else {
                System.out.println("Not prime");
            }
        }

        for (int b = num; b >= 1; b--) {

            fact = fact * num;
            num--;  
        }
        System.out.println(fact);

    }

}