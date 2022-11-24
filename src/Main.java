import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Dizi : {15,12,788,1,-1,-778,2,0}
        //Girilen Sayı : 5
        //Girilen sayıdan küçük en yakın sayı : 2
        //Girilen sayıdan büyük en yakın sayı : 12
        int[] list = {15,12,788,1,-1,-778,2,0};
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz");
        n = input.nextInt();
        Arrays.sort(list);
        //DiziSıralı: {-778,-1,0,1,2,12,15,788}
        int nearestSmall= list[0];
        int nearestBig = list[0];

        for (int i : list) {
            if (i < n ) {
                nearestSmall=i;
            }
            if (i > n ) {
                nearestBig=i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmall);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestBig);

    }
}