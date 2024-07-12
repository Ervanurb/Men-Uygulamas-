package nypProje;


class Icecek extends Urun {
	private String boy;

	public Icecek(String ad, double fiyat, String boy) {
		super(ad, fiyat);
		this.boy=boy;
	}
	
	 public Icecek(String ad) {
		
	}

	public Icecek() {
		
	}
	 
    @Override
	public void urunBilgisi() {//menuyuGoster metodundan çağırılmak üzere ürün bilgileri yazılır
		System.out.println("İçecek Adı:" +ad+"\nFiyat:" + fiyat +"\nBoy: " + boy + "\n-----------");
	}

	public String getBoy() {
		return boy;
	}
	//test sınıfından bilgi girebilmek için setter metodu
	public void setBoy(String boy) {
		this.boy=boy;
	}

}
