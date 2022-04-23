public class Main {

    public static void main(String[] args) {

        String mesaj = mesajVer("abc");
        System.out.println(mesaj);

        int toplama = topla(5, 2, 10, 15, 68, 5, 12);
        System.out.println(toplama);


    }

    public static String mesajVer(String metin) {
        return metin;
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }


}
