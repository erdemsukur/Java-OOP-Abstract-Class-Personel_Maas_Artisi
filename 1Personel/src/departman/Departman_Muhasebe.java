package departman;

public class Departman_Muhasebe {
	
	public void maasYazdir(Departman_Pazarlama dp, Departman_Uretim du)
	{
		dp.yeniMaasGoruntule();
		System.out.print("\n");
		du.yeniMaasGoruntule();
		
	}
}
