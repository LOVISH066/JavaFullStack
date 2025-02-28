import java.util.Scanner; // importing to take inout from user

class switchweek {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        switch (data) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }

}
