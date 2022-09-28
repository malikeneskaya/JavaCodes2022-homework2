public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.Topla(3, 4);
        double sonuc2 = dortIslem.Bol(13, 4);
        int sonuc3 = dortIslem.Cikar(3, 4);
        int sonuc4 = dortIslem.Carp(3, 4);

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);

    }
}