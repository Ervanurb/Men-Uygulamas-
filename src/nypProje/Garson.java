package nypProje;

import java.util.ArrayList;

class Garson extends Kisi {

	public Garson(String ad) {
		super(ad);
		
	}
	
	public Garson() {
		
	}

	public void siparisAl(Siparis s, ArrayList <Siparis> siparisler, Yemek yemek, Icecek içecek) {
		
		 new Restoran().rastgeleSiparisOlustur();
	}

}