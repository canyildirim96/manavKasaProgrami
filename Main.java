import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00 , toplam ;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        armutkg = inp.nextDouble();

        System.out.print("Elma kaç kilo: ");
        elmakg = inp.nextDouble();

        System.out.print("Domates kaç kilo: ");
        domateskg = inp.nextDouble();

        System.out.print("Muz kaç kilo: ");
        muzkg = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        patlicankg = inp.nextDouble();

        toplam = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg) ;

        System.out.print("Toplam Ödemeniz Gereken Tutar: " + toplam);


    }
}