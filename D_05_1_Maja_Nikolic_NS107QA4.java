package domaciZadaci;

import java.util.Scanner;

public class D_05_1_Maja_Nikolic_NS107QA4 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Unesite ocenu za uslugu:");
                int usluga = scan.nextInt();

                System.out.println("Unesite ocenu za kvalitet:");
                int kvalitet = scan.nextInt();

                double prosek = (usluga + kvalitet) / 2.0;

                if (usluga < 1 || usluga > 10 || kvalitet < 1 || kvalitet > 10 ) {
                    System.out.println("Podaci nisu validni");
                    System.exit(1);
                }
                if (prosek > 5 && prosek < 10) {
                    System.out.println("Prosek je veci od 5");
                } else if (usluga == 1 && kvalitet == 1) {
                    System.out.println("Treba popraviti uslugu i kvalitet");
                } else if (prosek < 5 && usluga == 1) {
                    System.out.println("Treba popraviti uslugu");
                } else if (prosek < 5 && kvalitet == 1) {
                    System.out.println("Treba popraviti kvalitet");
                } else if (prosek <= 5) {
                    System.out.println("Prosek je srednja zalost");
                }
            }
        }




