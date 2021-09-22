import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r;
        double a, area,  pi = 3.14;

        System.out.print("Daire yarıçapını giriniz:");
        r = inp.nextInt();

        System.out.print("Daire açısını giriniz:");
        a = inp.nextInt();

        area =  (pi * (r * r) * a) / 360;

        System.out.print("Daire alanı:" + area);

    }
}
