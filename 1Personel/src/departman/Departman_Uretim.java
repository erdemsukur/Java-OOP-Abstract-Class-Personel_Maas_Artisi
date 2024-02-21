package departman;

public class Departman_Uretim extends Personel_Base {
	
	public int paketSayisi;
	
	public Departman_Uretim(String adi, String soyadi, int maas, int yil) {	
		super(adi, soyadi, maas, yil);
		this.paketSayisi=0;
	}
	
	public void setPaketSayisi(int paketSayisi) {
		this.paketSayisi=paketSayisi;
	}
	
	public double getPaketSayisi() {
		return this.paketSayisi;
	}
	
	public double paketSayisi() {
		double islem=getPaketSayisi()*0.2;
		return islem;
	}
	
	
	int odenek=0;
	
	@Override
	public double cocukZamHesapla() {
		
		if(getCocukSayisi()-3>=3) {
			odenek=115*(getCocukSayisi()-3);
				return odenek;
			}
		else return 0;
	}

	@Override
	public double saatHesapla(int saat) {
		if (saat>200) {
			odenek=60*(saat-200);
			return odenek;
			}
			else return 0;
	}
	
	@Override
	public double yilZamHesapla() {
		double guncel1=0.0;
		if(getYil()>=5) {		
		 guncel1=getMaas()*0.36;
		}
		else {
		 guncel1=getMaas()*0.26;
		}
		return guncel1;
	}
	
	@Override
	public double maasHesapla() {
		double yeniMaas=(paketSayisi()+saatHesapla(this.saat)+cocukZamHesapla()+yilZamHesapla());
		return yeniMaas;
	}

	public void yeniMaasGoruntule() {
		System.out.print("\n");
		System.out.print("Çalışan Adı: "+getAdi()+" "+getSoyadi()+"\n");
		System.out.print("Paket Ücreti: "+paketSayisi()+" TL"+"\n");
		System.out.print("Çocuk Ücret: "+cocukZamHesapla()+" TL"+"\n");
		System.out.print("Saatlik Ücret: "+saatHesapla(this.saat)+" TL"+"\n");
		System.out.print("Yıllık Ham Artış: "+yilZamHesapla()+" TL"+"\n");
		System.out.print("Yeni Net Maas: "+(maasHesapla()+getMaas())+" TL");
	}

}
