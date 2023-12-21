public class Main {
    public static void main(String[] args) {
        // Temel Hali
        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("\nFiyat: " + temelBilgisayar.fiyat() + " TL");
        System.out.println("Aciklama: " + temelBilgisayar.aciklama() + '\n');

        // Ram Eklenmis Hali 8 GB
        Bilgisayar ramBilgisayar1 = new RamEkleDecorator(new TemelBilgisayar(),8);
        System.out.println("Fiyat: " + ramBilgisayar1.fiyat() + " TL");
        System.out.println("Aciklama: " + ramBilgisayar1.aciklama() + '\n');

        // Ram Eklenmis Hali 16 GB
        Bilgisayar ramBilgisayar2 = new RamEkleDecorator(new TemelBilgisayar(),16);
        System.out.println("Fiyat: " + ramBilgisayar2.fiyat() + " TL");
        System.out.println("Aciklama: " + ramBilgisayar2.aciklama() + '\n');

        // Ram Eklenmis Hali 32 GB
        Bilgisayar ramBilgisayar3 = new RamEkleDecorator(new TemelBilgisayar(),32);
        System.out.println("Fiyat: " + ramBilgisayar3.fiyat() + " TL");
        System.out.println("Aciklama: " + ramBilgisayar3.aciklama() + '\n');

        // Depolama Birimi Genisletilmis Hali 512 GB
        Bilgisayar depolamaBirimBilgisayar1 = new DepolamaBirimiEkleDecorator(new TemelBilgisayar(),512);
        System.out.println("Fiyat: " + depolamaBirimBilgisayar1.fiyat() + " TL");
        System.out.println("Aciklama: " + depolamaBirimBilgisayar1.aciklama() + '\n');

        // Depolama Birimi Genisletilmis Hali 1 TB
        Bilgisayar depolamaBirimBilgisayar2 = new DepolamaBirimiEkleDecorator(new TemelBilgisayar(),1);
        System.out.println("Fiyat: " + depolamaBirimBilgisayar2.fiyat() + " TL");
        System.out.println("Aciklama: " + depolamaBirimBilgisayar2.aciklama() + '\n');

        // Depolama Birimi Genisletilmis Hali 2 TB
        Bilgisayar depolamaBirimBilgisayar3 = new DepolamaBirimiEkleDecorator(new TemelBilgisayar(),2);
        System.out.println("Fiyat: " + depolamaBirimBilgisayar3.fiyat() + " TL");
        System.out.println("Aciklama: " + depolamaBirimBilgisayar3.aciklama() + '\n');


        // Depolama Birimi ve Ram Eklenmis Hali
        Bilgisayar depolamaRamBilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(),8),1);
        System.out.println("Fiyat: " + depolamaRamBilgisayar.fiyat() + " TL");
        System.out.println("Aciklama: " + depolamaRamBilgisayar.aciklama());


    }
}