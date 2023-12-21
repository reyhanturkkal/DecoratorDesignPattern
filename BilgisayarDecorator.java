abstract class BilgisayarDecorator implements Bilgisayar{
    protected Bilgisayar bilgisayar;

    public BilgisayarDecorator(Bilgisayar bilgisayar){
        this.bilgisayar = bilgisayar;
    }

    @Override
    public Double fiyat() {
        return bilgisayar.fiyat();
    }

    @Override
    public String aciklama() {
        return bilgisayar.aciklama();
    }
}
