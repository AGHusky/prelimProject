package prog2.prelimgroup;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }
    public Fraction(int wholeNumVal){ //finished
        numerator = wholeNumVal;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator){ //finished
        this.numerator = numerator;
        this.denominator = denominator;
        reduceFraction();

    }
    public void setNumerator(int num){ //finished
        numerator = num;
    }

    public void setDenominator(int den){ //finished
        denominator = den;
    }
    public int getDenominator(){ //finished
        return denominator;
    }

    public String toString() { //todo
        return (numerator + "/" + denominator + " or " + toDouble());
    }
    public double toDouble(){ //finished
        return ((double) numerator / denominator);
    }
    private int computeGCD(){
        return 15;
    }

    public void addFraction(int[] num, int[] den){ // - Lopez
        int fnum, fden, firstNum, secNum;
        if (den[0] == den[1]) {             // ---if same denominators---
            fnum = num[0] + num[1];         // add the numerators
            fden = den[0];                  // copy denominator
            System.out.println(fnum + "/" + fden);
        } else if (den[0] != den[1]) {      // ---if diff denominators---
            firstNum = den[1] * num[0];     // compute first numerator
            secNum= den[0] * num[1];        // compute second numerator
            fnum = firstNum + secNum;       // add the numerators
            fden = computeGCD();            // gcd of the denominators will be the final denominator
            //print
            System.out.println("Answer: " + fnum + "/" + fden);
        }
    }
    public void subtractFraction(int[] num, int[] den){
        //Fraction 1 =  + num[0] +"/"+den[0]
        //Fraction 2 =  + num[1] +"/"+den[1]
        //gcd = to be used in formula
        int temp; //to be used for multiplying to numerator
        int diff; //difference
        int gcd = computeGCD();
        setDenominator(gcd); // temporary value of gcd because gcd method is not finished (DELETE AFTER)
        //sample input (4/5 - 2/3)
        temp = gcd/den[0];
        num[0] = temp * num[0];
        temp = gcd/den[1];
        num[1] = temp * num[1];
        diff = num[0]-num[1];
        setNumerator(diff);
    }

    public int multiplyFraction(){
        //todo
        return 0;
    }

    public int divideFraction(){
        //todo
        return 0;
    }

    public int reduceFraction(){
        //todo
        return 0;
    }
}
