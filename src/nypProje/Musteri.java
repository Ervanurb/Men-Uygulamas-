package nypProje;

import java.util.ArrayList;

class Musteri extends Kisi {

	public Musteri(String ad) {
		super(ad);
		
	}
	
	public Musteri() {
		
	}

	public Siparis siparisVer(Yemek yemek,Icecek içecek) {
		Siparis siparis=new Siparis();
		
		 new Garson().siparisAl(siparis, new ArrayList<>(), new Yemek(), new Icecek());

		 
          
		return siparis;
		
		
	}

}