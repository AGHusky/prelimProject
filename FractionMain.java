package GroupProj;
import java.util.Scanner;
public class GroupProjFraction {
    public static void main(String[] args) {
        //variables
        Scanner kbd = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int userInput = 0;
        //create UI interface - alwin


        System.out.println("First fraction");
        System.out.print("Enter Numerator: ");
        int numerator1 = kbd.nextInt();
        System.out.print("Enter Denominator: ");
        int denominator1 = kbd.nextInt();
        Fraction fraction1 = new Fraction(new int[]{numerator1}, new int[]{denominator1});

        // Creating the second fraction
        System.out.println("Second fraction");
        System.out.print("Enter Numerator: ");
        int numerator2 = kbd.nextInt();
        System.out.print("Enter Denominator: ");
        int denominator2 = kbd.nextInt();
        Fraction fraction2 = new Fraction(new int[]{numerator2}, new int[]{denominator2});


        switch (askUser()){
            case 1:
                //adding fractions

            case 2:
                //subtract fractions

            case 3:
                //multiply fractions

            case 4:
                //divide fractions

            case 5:
                //reduce a fractions

            case 6:
                //create the UI exit

            default:
                System.out.println("Wrong user input");
                System.out.println("Please try again!");
                askUser();
        }
    }
    public static int askUser(){
        String[] ask = {"Add a fraction", "Subtract a fraction", "Multiply a fraction", "Divide a fraction", "Reduce a fraction", "Quit"};
        Scanner kbd = new Scanner(System.in);

        System.out.println("What do you want to do: ");
        for (int i = 0; i < ask.length; i ++){
            System.out.println((i + 1) + ". " + ask[i]);
        }
        return kbd.nextInt();
    }

    public static void exit(){
        //create art


        System.exit(0);
    }

}


