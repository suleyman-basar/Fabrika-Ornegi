
public class Yaratici {

	public IUrun UretimZamani(int ay) {
		if(ay % 3 == 0) {
			return new IspanyaMantari();
		}else if (ay % 11 == 0) {
			return new İsvicreMantari();
		}else 
			return new IngiltereMantari();
	}
	
}
