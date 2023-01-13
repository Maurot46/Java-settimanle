package Main.Sistema;

public class audio extends elementoMultimediale {
	

	public audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
	}
	public void abbassaVolume() {
		if(volume - 1 > volumeMax)
			volume -= 1;
		System.out.printf("%nVolume audio abbassato di 1");
	};
	public void alzaVolume() {
		if(volume +1 < volumeMax)
			volume += 1;
		System.out.printf("%nVolume audio alzato di 1 %n");
	};

	@Override
	public void aumentaLuminosità() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		for(int i = 0; i <= durata; i++) {
			System.out.printf(titolo);
			for(int v = 0; v <= i; v++ ) {
				System.out.printf("!");
			}
			System.out.println();
		}
	}
	@Override
	public void diminuisciLuminosità() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	

}
