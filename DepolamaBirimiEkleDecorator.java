public class DepolamaBirimiEkleDecorator extends BilgisayarDecorator{
    private int depolamaAlan;
    public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar, int depolamaAlan) {
        super(bilgisayar);
        this.depolamaAlan = depolamaAlan;
    }

    @Override
    public Double fiyat() {
        if (depolamaAlan == 512) {
            return super.fiyat() + 1999;
        } else if(depolamaAlan == 1) {
            return super.fiyat() + 3999;
        } else {
            return super.fiyat()+ 5999;
        }
    }

    @Override
    public String aciklama() {
        if (depolamaAlan == 512){
            return super.aciklama() + ' ' + depolamaAlan + " GB SSD Disk Eklendi...";
        }else {
            return super.aciklama() + ' ' + depolamaAlan + " TB SSD Disk Eklendi...";
        }
    }
}
