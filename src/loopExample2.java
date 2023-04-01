import java.util.Scanner;

public class loopExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplam = 0;
        int n;

        do {
            System.out.print("bir sayi giriniz:");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 == 0);
        System.out.println("Sayilarin toplami :"+ toplam);
    }
}