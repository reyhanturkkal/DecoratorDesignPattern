// Temel Bilesen Sinifi

public class TemelBilgisayar implements Bilgisayar{
    @Override
    public Double fiyat() {
        return 25000.00;
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayar";
    }
}
