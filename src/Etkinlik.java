import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        int sicaklik;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        sicaklik = girdi.nextInt();

        if (sicaklik <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (5 < sicaklik && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (15 < sicaklik && sicaklik <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (25 < sicaklik) {
            System.out.println("Yüzebilirsiniz.");
        }
        System.out.println(sicaklik);

    }
}
