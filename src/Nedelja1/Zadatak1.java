package Nedelja1;

import java.util.Scanner;

public class Zadatak1 {

        public static boolean isValid(String str) {
            // broji koliko imamo parova  zagrada
            int brojac = 0;


// Znamo da nas string ne moze da pocne sa zatvorenom i da se sigurno nece zavrsiti otvorenom zagradom
            if (str.charAt(0) == ')' || str.charAt(str.length() - 1) == '(')
                return false;
            else {
                for (int i = 1; i < str.length() - 1; i++) {
                    if (str.charAt(i) == '(') {
                        brojac++;
                    }
//Ispitujemo da li svaka zagrada ima par  i ako ima ,a mi imamo zatvorenu zagradu vracamo false

                    else if (brojac == 0 && str.charAt(i) == ')')
                        return false;
                        // inace smanjujemo nas brojac jer je on nasao svoj par
                    else brojac--;
                }
            }

            return (brojac == 0);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(isValid(s));
        }
    }


