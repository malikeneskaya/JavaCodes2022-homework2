public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    //camel casing
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 7;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi) {
            mesaj = "SAyı mevcuttur: " + aranacak;
            mesajVer("Sayi mevcuttur : " + aranacak);
        } else {
            mesajVer("Sayi mevcut degildir : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
