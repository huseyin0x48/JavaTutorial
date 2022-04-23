public class Main {

    public static void main(String[] args) {

        int sayi = 21;

        if (sayi<20) {
            System.out.println("Sayi 20 den kucuktur");
        } else if(sayi==20){
            System.out.println("Sayi 20 ye esittir");
        } else {
            System.out.println("Sayi 20 den buyuktur");
        }


        char not = 'B';

        switch (not) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }
    }
}
