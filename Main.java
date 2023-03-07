import java.util.Scanner;
public class Main {
    static double Us(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban:");
        double taban =input.nextInt();
        System.out.print("Üs:");
        double us = input.nextInt();
        double result = Math.pow(taban,us);
        return result;

    }


    public static void main(String[] args) {

        System.out.println("Toplam Sonuç:"+(int)Us());


    }


}


            






