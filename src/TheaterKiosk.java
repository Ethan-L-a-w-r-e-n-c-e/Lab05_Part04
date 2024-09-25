import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        
        int age;
        System.out.println("What is your age? ");
        if (scan.hasNextInt()){
            age = scan.nextInt();
            if(age >= 21 && age <= 122) {
                System.out.println("You get a wristband");
                
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("You entered a wrong data type");
            System.exit(0);
        }
    }
}