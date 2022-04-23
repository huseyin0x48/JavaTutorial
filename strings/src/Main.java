public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";

        System.out.println("Metin : " + mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());

        System.out.println("Birleştirilmiş metin : " + mesaj.concat(" Yaşasın"));

        System.out.println("İlgili ifade ile başlıyormu : " + mesaj.startsWith("A"));

        System.out.println("İlgili ifade ile bitiyormu : " + mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println("Metnin seçilmiş kısmı : ");
        System.out.println(karakterler);

        System.out.println("İlgili ifade baştan kaçıncı sırada : " + mesaj.indexOf("a"));

        System.out.println("İlgili ifade sondan kaçıncı sırada : " + mesaj.lastIndexOf("e"));

        System.out.println("İlgili ifadesi başka bir ifade ile değiştirilmiş metin : " + mesaj.replace(' ', '-'));

        System.out.println("Belirli ifadeden ifadeye kadarki metin : " + mesaj.substring(2, 4));

        for (String kelime : mesaj.split(" ")) {
            System.out.println("Belirli ifadeden itibaren parçalanmış metin : " + kelime);
        }

        System.out.println("Küçük harflere dönüştürülmüş metin : " + mesaj.toLowerCase());

        System.out.println("Büyük harflere dönüştürülmüş metim : " + mesaj.toUpperCase());

        System.out.println("Başındaki ve sonundaki boşluklar silinmiş metin : " + mesaj.trim());

    }
}
