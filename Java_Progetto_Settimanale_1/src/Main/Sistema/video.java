package Main.Sistema;

public class video extends elementoMultimediale{
	protected int  luminosità = 5;
	public video(String titolo, int durata, int volume, int luminosità) {
		super(titolo, durata, volume);
		// TODO Auto-generated constructor stub
	}
	public void diminuisciLuminosità() {
		if(luminosità - 1 < luminosità) {
			luminosità -= 1;
			System.out.printf("%nLuminosità diminuita di 1 %n");
		}
	}
	public void play() {
		System.out.println(titolo);
		System.out.println("Durata video: " + durata + " minuti");
		System.out.printf("Luminosità attuale: ");
		for(int i = 0; i <= luminosità; i++) {
			System.out.printf("*");
		}
	}
	public void aumentaLuminosità() {
		// TODO Auto-generated method stub
		if(luminosità + 1 > luminosità) {
			luminosità += 1;
			System.out.printf("%nLuminosità aumentata di 1");
		}
	}
	@Override
	public void abbassaVolume() {
		if(volume - 1 > volumeMax)
			volume -= 1;
		System.out.printf("%nVolume video abbassato di 1 %n");
	};
	@Override
	public void alzaVolume() {
		if(volume +1 < volumeMax)
			volume += 1;
		System.out.printf("%nVolume video alzato di 1 %n");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	};
	

}
