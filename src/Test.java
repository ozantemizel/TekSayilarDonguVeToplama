import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int n;
        int toplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz.");
            n=input.nextInt();
            if(n%4==0){
                toplam+=n;
            }
        } while (n%2==0);

        System.out.println("Dörde tam bölünen sayıların toplamı: "+toplam);
    }
}
