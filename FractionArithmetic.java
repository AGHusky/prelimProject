import java.util.Scanner;
public class FractionArithmetic {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Fraction users = new Fraction();
        int[] num = new int[3];
        int[] den = new int[3];
        int userinput = 0;

        //alwin part greetings



        //
        System.out.println("-----------------------------------------------------");
        System.out.println("Fractions!");
        System.out.println();

        //check the user input
        do {
            userinput = AskUser();
            switch (userinput){
                case 1: //enter value of Fraction 1
                    System.out.println("Enter the value for Fraction 1");
                    System.out.print("numerator: ");
                    num[0] = kbd.nextInt();
                    users.setNumerator(num[0]);
                    do{
                        System.out.print("denominator: ");
                        den[0] = kbd.nextInt();
                    }while (den[0] == 0);
                    users.setDenominator(den[0]);
                    System.out.println("Fraction 1 = " + num[0] +"/"+den[0]);
                    System.out.printf("Decimal = %.2f", users.toDouble());
                    System.out.println();
                    System.out.println();
                    break;

                case 2: //enter value of Fraction 2
                    System.out.println("Enter the value for Fraction 2");
                    System.out.print("numerator: ");
                    num[1] = kbd.nextInt();
                    users.setNumerator(num[1]);
                    do{
                        System.out.print("denominator: ");
                        den[1] = kbd.nextInt();
                    }while (den[1] == 0);
                    users.setDenominator(den[1]);
                    System.out.println("Fraction 1 = " + num[1] +"/"+den[1]);
                    System.out.printf("Decimal = %.2f", users.toDouble());
                    System.out.println();
                    System.out.println();
                    break;

                case 3: //addition - Lopez
                    //getting the gcd


                case 4: //subtraction - Doria
                    Fraction sub = new Fraction();
                    int diff;
                    System.out.println("Difference of " + num[0] +"/"+den[0] + " and " + num[1] +"/"+den[1] + ": ");
                    sub.subtractFraction(num, den);
                    System.out.println("result is: " + sub.toString());
                    break;


                case 5: // multiplication - garcia
                    System.out.println("Using Fractions from Case 1 and Case 2 for Multiplication");
                    System.out.println("Fraction 1 = " + num[0] + "/" + den[0]);
                    System.out.println("Fraction 2 = " + num[1] + "/" + den[1]);

                    // Perform multiplication
                    users.multiplyFraction(num[0], den[0], num[1], den[1]);
                    System.out.println("Result of multiplication: " + users.toString());
                    System.out.println();
                    System.out.println();
                    break;

                case 6: //divide - Vigilia
                    Fraction div = new Fraction();
                    div.divideFraction(num, den);
                    System.out.println("Dividend of " + num[0] +"/"+den[0] + " and " + num[1] +"/"+den[1] + ": ");
                    System.out.println("Result of Division: " +div.toString()+" or " +div.toDouble());
                    System.out.println();
                    break;

                case 7: // reduce - Pulmano

                case 8: // quit program
                    exit();

                default:
                    System.out.println("User input is out of bound!");
                    System.out.println("TRY AGAIN!");
                    AskUser();
            }
        }while (true);
    }

    public static int AskUser(){
        String[] ask = {"Enter Value of Fraction 1", "Enter Value of Fraction 2","Add Fractions", "Subtract Fractions", "Multiply Fractions", "Divide Fractions", "Reduce Fractions", "Quit",};
        Scanner kbd = new Scanner(System.in);
        System.out.println("What do you want to do? ");
        for (int i = 0; i < ask.length; i++){
            System.out.println((i + 1) + ". " + ask[i]);
        }
        System.out.print("UserInput: ");
        return kbd.nextInt();
    }

    public static void exit(){
        //ending UI - Doria



        System.exit(0);
    }


}

