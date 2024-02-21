package departman;

public class Departman_Main {

	public static void main(String[] args) {
	
		Departman_Pazarlama dp=new Departman_Pazarlama("Erdem", "Şükür", 4500, 7);
		dp.setCocukSayisi(5);
		dp.setIhracatBedel(10000);
		dp.setSaat(260);
		

		Departman_Uretim du=new Departman_Uretim("Nurten","Çalışkan", 7500, 2);
		du.setCocukSayisi(2);
		du.setPaketSayisi(1500);
		du.setSaat(300);
		
		Departman_Muhasebe dM=new Departman_Muhasebe();
		dM.maasYazdir(dp, du);
	}

}
