package prog2.prelimGroup;

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
        }
        public void setNumerator(int num){ //finished
            numerator = num;
        }

        public int getNumerator(){
            return numerator;
        }

        public void setDenominator(int den){ //finished
            denominator = den;
        }
        public int getDenominator(){ //finished
            return denominator;
        }

        public String toString() { //todo
            if(getDenominator() == 0){
                return ("null or Null" );
            }
            else {
                return (getNumerator() + "/" + getDenominator() + " or " + toDouble());
            }
        }
        public double toDouble(){ //finished
                return ((double) numerator / denominator);
        }
        private int computeGCD(int num,int den){
            int gcd = 0;
            int remainder1;
            if (num % den == 0){
                gcd = den;
            }
            else {
                do{
                    remainder1 = num % den;
                    num = den;
                    den = remainder1;
                }while (remainder1 != 0);
                gcd = num;
            }
            return gcd;
        }

        public void addFraction(int[] num, int[] den){
            int finalNum, finalDen;
            if (den[0] == den[1]) {             // ---if same denominators---
                finalNum = num[0] + num[1];         // add the numerators
                finalDen = den[0];                  // copy denominator
                reduceFraction(finalNum, finalDen);     // simplify answer
            } else if (den[0] != den[1]) {      // ---if diff denominators---
                finalNum = (den[1] * num[0]) + (den[0] * num[1]);           // compute numerator
                finalDen = (den[0] * den[1])/computeGCD(den[0], den[1]);    // compute denominator
                // gcd of the denominators will be the final denominator
                reduceFraction(finalNum, finalDen);     // simplify answer
            }
        }
        public void subtractFraction(int[] num, int[] den){
            //Fraction 1 =  + num[0] +"/"+den[0]
            //Fraction 2 =  + num[1] +"/"+den[1]
            //gcd = to be used in formula
            int temp; //to be used for multiplying to numerator
            int diff; //difference

            int gcd = (den[0] * den[1])/computeGCD(den[0], den[1]);
            //sample input (4/5 - 2/3)
            temp = gcd/den[0];
            int num1 = temp * num[0];
            temp = gcd/den[1];
            int num2 = temp * num[1];
            diff = num1-num2;
            reduceFraction(diff, gcd);
        }

        public void multiplyFraction(int[] num, int[] den){
            int newNumerator = num[0] * num[1];
            int newDenominator = den[0] * den[1];
            reduceFraction(newNumerator, newDenominator);
        }

        public void divideFraction(int[] num, int[] den){
            int newNumerator = num[0] * den[1];//multiply num [0] to den [1]
            int newDenominator = den[0] * num[1];//multiply num [0] to num[1]
            setDenominator(newDenominator);
            if (newDenominator == 0){
                System.out.println("===========================================");
                System.out.println("Fraction error, Denominator Cannot Be Zero(0)");
                System.out.println("===========================================");
            }else {
                reduceFraction(newNumerator, newDenominator);
            }
        }

        public void reduceFraction(int num, int den) {
            int div = computeGCD(num, den);
            if (div != 1) {
                while (num % div == 0 && den % div == 0) {
                    div = computeGCD(num, den);
                    num = num / div;
                    den = den / div;
                }
            }
            setNumerator(num);
            setDenominator(den);
        }

}

