package UTS;

import java.util.Scanner;
public class Bmi {

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;

        System.out.println("Masukan berat badan :");
        berat = go.nextInt();
        System.out.println("Masukan tinggi badan :");
        tinggi = go.nextDouble();
        tinggi/=100;
        bmi= berat/(tinggi*tinggi);
        System.out.print("Bmi mu adalah" + bmi);

        if(bmi<18){
            System.out.println("Kurus banget");

        }
        else if(bmi<24){
            System.out.println("Biasa aja");
        }
        else if(bmi<30){
            System.out.println("Agak Gendutan");
        }
        else if(bmi<80){
            System.out.println("Obesitas");
        }
    }
}

