import java.util.Scanner;

class input { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fname = sc.next();

        System.out.print("Enter Last Name: ");
        String lname = sc.next();
        
        String Name = fname + lname;
        System.out.println(Name);

    }





}
