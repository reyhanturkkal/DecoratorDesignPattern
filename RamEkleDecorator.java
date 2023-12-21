public class RamEkleDecorator extends BilgisayarDecorator{
    private int ram;
    public RamEkleDecorator(Bilgisayar bilgisayar, int ram) {
        super(bilgisayar);
        this.ram = ram;
    }

    @Override
    public Double fiyat() {
        if (ram == 8) {
            return super.fiyat() + 2500;
        } else if(ram == 16) {
            return super.fiyat() + 4200;
        } else {
            return super.fiyat()+ 5600;
        }
    }

    @Override
    public String aciklama() {
        return super.aciklama() +  ' ' + ram + " GB RAM eklendi...";
    }
}
