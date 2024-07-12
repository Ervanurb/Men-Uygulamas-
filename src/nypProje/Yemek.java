package nypProje;



class Yemek extends Urun {
	private String tur;
	
	public Yemek(String ad, double fiyat, String tur) {
		super(ad, fiyat);
		this.tur=tur;
	}
	
	public Yemek(String ad) {
		
	}

	public Yemek() {
		
	}
	@Override 
	public void urunBilgisi() {//menuyuGoster metodundan çağırılmak üzere ürün bilgileri yazılır
		System.out.println("Yemek Adı:" +ad+"\nFiyat:" + fiyat + "\nTur: " + tur +"\n-----------");
	}
	
	
	public String getTur() {
		return tur;
	}
	//test sınıfından bilgi girebilmek için setter metodu
	public void setTur(String tur) {
		this.tur=tur;
	}



}
