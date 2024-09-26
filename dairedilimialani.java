import java.util.Scanner;

public class dairedilimialani {
    public static void main(String[] args) {
        Scanner ımp=new Scanner(System.in);
        double r ,merkezacisi;
        double pi =3.14;
        System.out.print("Dairenin yarıçapını giriniz=" );
        r= ımp.nextDouble();
        System.out.print("Merkez açısını giriniz=");
        merkezacisi=ımp.nextDouble();

        double daireninalanı=(pi * (r*r) * merkezacisi) / 360;
        System.out.print("Daire diliminin alanı="+daireninalanı);
    }
}
