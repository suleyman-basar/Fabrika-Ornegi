
public class main {

	public static void main(String[] args) {
	
		Yaratici _y = new Yaratici();
        IUrun urun;
        
        for(int i=1; i<=12; i++)
        {
        	urun = _y.UretimZamani(i);
            System.out.println(urun.tedarikEdilenYer());
        }
		
	}

}
