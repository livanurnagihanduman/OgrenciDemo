public class Main {
    public static void main(String[] args) {

        OgrenciDemo ogrenci = new OgrenciDemo("Livanur Nagihan Duman" ,1,"2727",100,80,99);
        ogrenci.isPass();


        OgrenciDemo ogrenci2 = new OgrenciDemo("Muhammet Esat Duman",1,"3131",85,60,90);
        ogrenci2.isPass();

        OgrenciDemo ogrenci3 = new OgrenciDemo(" Duman",1,"4646",30,25,45);
        ogrenci3.isPass();
    }
}