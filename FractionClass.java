package GroupProj;

import java.util.Scanner;

public class Fraction {

        private int[] numerator;
        private int[] denominator;
        private  int index;


        public  Fraction(){
            index = 0;


        }
       public Fraction(int index){
            numerator = new int[index];
            denominator = new int[index];
            this.index = 0;

        }
        public Fraction(int[] n, int[] d){
            numerator = n;
            denominator = d;
        }
        public int getNumerator(int index){
            return numerator[index];

        }
        public int getDenominator(int index){
            return denominator[index];
        }


    }

