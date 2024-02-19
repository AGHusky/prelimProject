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
        public String toString() { //finished
            return (numerator + "/" + denominator);   
        }
        public double toDouble(){ //finished
            return ((double) numerator / denominator);
        }
        private int computeGCD(int a, int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public int addFraction(){
            return 0;
        }
        public void subtractFraction(int[] num, int[] den){
            //Fraction 1 =  + num[0] +"/"+den[0]
            //Fraction 2 =  + num[1] +"/"+den[1]
            //gcd = to be used in formula
            int temp; //to be used for multiplying to numerator
            int diff; //difference
            int gcd = computeGCD(den[0], den[1]);
            setDenominator(gcd); // temporary value of gcd because gcd method is not finished (DELETE AFTER)
            //sample input (4/5 - 2/3)
            temp = gcd/den[0];
            num[0] = temp * num[0];
            temp = gcd/den[1];
            num[1] = temp * num[1];
            diff = num[0]-num[1];
            setNumerator(diff);
        }

        public void multiplyFraction(int num1, int den1, int num2, int den2) {
                int newNumerator = num1 * num2;
                int newDenominator = den1 * den2;
                setNumerator(newNumerator);
                setDenominator(newDenominator);
                reduceFraction(); // Simplify the result
            return 0;
        }

        public void divideFraction(int num [], int den[]){
        int numerator = num[0] * den[1];
        int denominator = den[0] * num[1];
        setNumerator(numerator);
        setDenominator(denominator);
        reduceFraction();

        }

        public int reduceFraction(){
            //todo
            return 0;
        }
}

