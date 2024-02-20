package prog2.prelimGroup;

import java.util.Scanner;
public class FractionArithmetic {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Fraction Fraction1 = new Fraction();
        Fraction Fraction2 = new Fraction();
        Fraction users = new Fraction();
        int[] num = new int[2];
        int[] den = new int[2];
        int userinput = 0;

        ///set values
        num[0] = Fraction1.getNumerator();
        num[1] = Fraction2.getNumerator();

        den[0] = Fraction1.getDenominator();
        den[1] = Fraction2.getDenominator();

        //alwin part greetings
        System.out.print(". 　　　。　　　　•　 　ﾟ　　。 　　.\n" +
                ".　　 。　　　• . 　　 • 　　　　• . 　　 • 　　　　••\n" +
                "\n" +
                "　　ﾟ　　 Fraction was not An Impostor.　 ඞ。•.\n" +
                "　　'　　  1 Impostor remains  　　。\n" +
                "\n" +
                "　　ﾟ　　　.　　　. 　　　　.• . 　　 • 　　　　•　 .");
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(" (/▽＼ ) Welcome to Group1 ♪(´▽｀) ");
        System.out.println(" (´▽`ʃ♡ƪ) Fraction Arithmetic Calculator 👈(ﾟヮﾟ👈)");
        System.out.println("-------------------------------------------------");

        //check the user input
        do {
            userinput = AskUser();
            switch (userinput){
                case 1: //enter value of Fraction 1
                    System.out.println("Enter the value for Fraction 1");
                    System.out.print("numerator: ");
                    Fraction1.setNumerator(kbd.nextInt());
                    num[0] = Fraction1.getNumerator();
                    do{
                        System.out.print("denominator: ");
                        Fraction1.setDenominator(kbd.nextInt());
                        den[0] = Fraction1.getDenominator();
                    }while (Fraction1.getDenominator() == 0);
                    System.out.println("Fraction 1 = " + Fraction1.getNumerator() +"/"+Fraction1.getDenominator());
                    System.out.printf("Decimal = %.2f", Fraction1.toDouble());
                    System.out.println();
                    System.out.println();
                    break;

                case 2: //enter value of Fraction 2
                    System.out.println("Enter the value for Fraction 2");
                    System.out.print("numerator: ");
                    Fraction2.setNumerator(kbd.nextInt());
                    num[1] = Fraction2.getNumerator();
                    do{
                        System.out.print("denominator: ");
                        Fraction2.setDenominator(kbd.nextInt());
                        den[1] = Fraction2.getDenominator();
                    }while (Fraction2.getDenominator() == 0);
                    System.out.println("Fraction 2 = " + Fraction2.getNumerator() +"/"+Fraction2.getDenominator());
                    System.out.printf("Decimal = %.2f", Fraction2.toDouble());
                    System.out.println();
                    System.out.println();
                    break;

                case 3: //addition - Lopez
                    Fraction add = new Fraction();
                    add.addFraction(num, den);
                    System.out.println("Fraction 1 = " + Fraction1.getNumerator() + "/" + Fraction1.getDenominator());
                    System.out.println("Fraction 2 = " + Fraction2.getNumerator() + "/" + Fraction2.getDenominator());
                    System.out.println("======================================================");
                    System.out.println("Result of adding the two fractions: " + add.toString());
                    System.out.println("======================================================");
                    break;


                case 4: //subtraction - Doria
                    Fraction sub = new Fraction();
                    sub.subtractFraction(num, den);
                    System.out.println("Fraction 1 = " + Fraction1.getNumerator() + "/" + Fraction1.getDenominator());
                    System.out.println("Fraction 2 = " + Fraction2.getNumerator() + "/" + Fraction2.getDenominator());
                    System.out.println("======================================================");
                    System.out.println("Result of subtracting the two fractions: " + sub.toString());
                    System.out.println("======================================================");
                    System.out.println();
                    break;


                case 5: //multiplication - garcia
                    Fraction multi = new Fraction();
                    multi.multiplyFraction(num, den);
                    System.out.println("Fraction 1 = " + Fraction1.getNumerator() + "/" + Fraction1.getDenominator());
                    System.out.println("Fraction 2 = " + Fraction2.getNumerator() + "/" + Fraction2.getDenominator());
                    System.out.println("======================================================");
                    System.out.println("Result of multiplying the two fractions: " + multi.toString());
                    System.out.println("======================================================");
                    System.out.println();
                    break;


                case 6: //divide - Vigilia
                    Fraction div = new Fraction();
                    div.divideFraction(num, den);
                    System.out.println("Fraction 1 = " + Fraction1.getNumerator() + "/" + Fraction1.getDenominator());
                    System.out.println("Fraction 2 = " + Fraction2.getNumerator() + "/" + Fraction2.getDenominator());
                    System.out.println("======================================================");
                    System.out.println("Result of Dividing the two fractions: " + div.toString());
                    System.out.println("======================================================");
                    System.out.println();
                    break;

                case 7: // reduce - Pulmano
                    do {
                        System.out.println("Which Fraction would you want to reduce? ");
                        System.out.println("1. Fraction1");
                        System.out.println("2. Fraction2");
                        System.out.print("User Input( 1 / 2 ): ");
                        if(kbd.nextInt() == 1){
                            Fraction1.reduceFraction(Fraction1.getNumerator(), Fraction1.getDenominator());
                            System.out.println("======================================================");
                            System.out.println("Reduced Fraction: " + Fraction1.toString());
                            System.out.println("======================================================");
                            break;
                        } else if (kbd.nextInt() == 2) {
                            Fraction2.reduceFraction(Fraction2.getNumerator(), Fraction2.getDenominator());
                            System.out.println("======================================================");
                            System.out.println("Reduced Fraction: " + Fraction2.toString());
                            System.out.println("======================================================");
                            break;
                        }
                    }while (kbd.nextInt() > 2);
                    break;
                case 8: // quit program
                    exit();

                default:
                    System.out.println("User input is out of bound!");
                    System.out.println("TRY AGAIN!");
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
        System.out.println("████████╗██╗░░██╗░█████╗░███╗░░██╗██╗░░██╗  ██╗░░░██╗░█████╗░██╗░░░██╗  ███████╗░█████╗░██████╗░\n" +
                "╚══██╔══╝██║░░██║██╔══██╗████╗░██║██║░██╔╝  ╚██╗░██╔╝██╔══██╗██║░░░██║  ██╔════╝██╔══██╗██╔══██╗\n" +
                "░░░██║░░░███████║███████║██╔██╗██║█████═╝░  ░╚████╔╝░██║░░██║██║░░░██║  █████╗░░██║░░██║██████╔╝\n" +
                "░░░██║░░░██╔══██║██╔══██║██║╚████║██╔═██╗░  ░░╚██╔╝░░██║░░██║██║░░░██║  ██╔══╝░░██║░░██║██╔══██╗\n" +
                "░░░██║░░░██║░░██║██║░░██║██║░╚███║██║░╚██╗  ░░░██║░░░╚█████╔╝╚██████╔╝  ██║░░░░░╚█████╔╝██║░░██║\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝  ░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝\n" +
                "\n" +
                "████████╗██████╗░██╗░░░██╗██╗███╗░░██╗░██████╗░  ░█████╗░██╗░░░██╗████████╗  ░█████╗░██╗░░░██╗██████╗░\n" +
                "╚══██╔══╝██╔══██╗╚██╗░██╔╝██║████╗░██║██╔════╝░  ██╔══██╗██║░░░██║╚══██╔══╝  ██╔══██╗██║░░░██║██╔══██╗\n" +
                "░░░██║░░░██████╔╝░╚████╔╝░██║██╔██╗██║██║░░██╗░  ██║░░██║██║░░░██║░░░██║░░░  ██║░░██║██║░░░██║██████╔╝\n" +
                "░░░██║░░░██╔══██╗░░╚██╔╝░░██║██║╚████║██║░░╚██╗  ██║░░██║██║░░░██║░░░██║░░░  ██║░░██║██║░░░██║██╔══██╗\n" +
                "░░░██║░░░██║░░██║░░░██║░░░██║██║░╚███║╚██████╔╝  ╚█████╔╝╚██████╔╝░░░██║░░░  ╚█████╔╝╚██████╔╝██║░░██║\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░  ░╚════╝░░╚═════╝░░░░╚═╝░░░  ░╚════╝░░╚═════╝░╚═╝░░╚═╝\n" +
                "\n" +
                "░█████╗░░█████╗░██████╗░███████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "██║░░╚═╝██║░░██║██║░░██║█████╗░░\n" +
                "██║░░██╗██║░░██║██║░░██║██╔══╝░░\n" +
                "╚█████╔╝╚█████╔╝██████╔╝███████╗\n");
        System.exit(0);
    }


}

