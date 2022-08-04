import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double kg,boy,indeks;
        Scanner inp=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (Metre Cinsinden) :");
        boy=inp.nextDouble();

        System.out.print("Kilonuzu Giriniz :");
        kg=inp.nextDouble();

        indeks=kg/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz :"+"\s"+indeks);
    }
}
