package departman;
public abstract class Personel_Base {
	 private String adi;
	 private String soyadi;
	 private int maas;
	 private int cocukSayisi;
	 private int yil;
	 protected int saat;
	
	abstract public double maasHesapla();
	abstract public double cocukZamHesapla();
	abstract public double saatHesapla(int saat);
	abstract public double yilZamHesapla();
	
	public Personel_Base(String adi, String soyadi, int maas, int yil) {
		this.adi=adi;
		this.soyadi=soyadi;
		this.maas=maas;
		this.yil=yil;
	}
	
	public void setCocukSayisi(int cocukSayisi) {
		this.cocukSayisi=cocukSayisi;
	}
	
	public void setSaat(int saat) {
		this.saat=saat;
	}

	public String getAdi() {
		return this.adi;
	}
	
	public String getSoyadi() {
		return this.soyadi;
	}
	
	public int getMaas() {
		return this.maas;
	}
	
	public int getCocukSayisi() {
		return this.cocukSayisi;
	}
	
	public int getSaat() {
		return this.saat;
	}
	
	public int getYil() {
		return this.yil;
	}

}
