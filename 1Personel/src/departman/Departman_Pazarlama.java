package departman;

public class Departman_Pazarlama extends Personel_Base{
	
	public int ihracatBedel;
	public Departman_Pazarlama(String adi, String soyadi, int maas, int yil) {
		super(adi, soyadi, maas, yil);
		this.ihracatBedel=0;
	}
		
	public void setIhracatBedel(int ihracatBedel) {
			this.ihracatBedel=ihracatBedel;
		}
	
	int odenek=0;
	
	public double getIhracatBedel() {
		return this.ihracatBedel;
	}
	
	public double ihracatBedel() {
		if (getIhracatBedel()>=250000) {
			return getMaas()*0.1;
		}
		else {
			return 0;
		}
	}

	@Override
	public double cocukZamHesapla() {
		
		if(getCocukSayisi()>=3) {
			odenek=115*(getCocukSayisi()-3);
				return odenek;
			}
		else return 0;
	}

	@Override
	public double saatHesapla(int saat) {
		if (saat>200) {
			odenek=55*(saat-200);
			return odenek;
			}
			else return 0;
	}
		
	@Override
	public double yilZamHesapla() {
		double guncel1=0.0;
		if(getYil()>=5) {		
		 guncel1=getMaas()*0.35;
		}
		else {
		 guncel1=getMaas()*0.25;
		}
		return guncel1;
	}

	@Override
	public double maasHesapla() {
		double yeniMaas=(ihracatBedel()+saatHesapla(this.saat)+cocukZamHesapla()+yilZamHesapla());
		return yeniMaas;
	}
		
	public void yeniMaasGoruntule() {
		System.out.print("Çalışan Adı: "+getAdi()+" "+getSoyadi()+"\n");
		System.out.print("İhracat Komisyonu: "+ihracatBedel()+" TL"+"\n");
		System.out.print("Çocuk Ücret: "+cocukZamHesapla()+" TL"+"\n");
		System.out.print("Saatlik Ücret: "+saatHesapla(this.saat)+" TL"+"\n");
		System.out.print("Yıllık Ham Artış: "+yilZamHesapla()+" TL"+"\n");
		System.out.print("Yeni Net Maas: "+(maasHesapla()+getMaas())+" TL");
	}


}
