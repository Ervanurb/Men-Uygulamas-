package nypProje;


public class Test {
	public static void main(String[] args) {
		 Restoran restoran = new Restoran();
		 
         // Menüye yemekleri ve içecekleri ekleme
    	 Urun yemek1=new Yemek("Cantık", 60.0, "Kebap");
    	 Urun yemek2=new Yemek("İskender", 250.0, "Kebap");
    	 Urun yemek3=new Yemek("Tavuk Şiş", 80.0, "Kebap");
    	 Urun yemek4=new Yemek("Pizza", 100.0, "Fastfood");
    	 Urun icecek1=new Icecek("Su", 7.0, "Yarım Litre");
    	 Urun icecek2=new Icecek("Şalgam", 30.0, "250 ml");
    	 Urun icecek3=new Icecek("Sprite", 30.0, "300 ml");
    	 Urun icecek4=new Icecek("Çay", 15.0, "Fincan");
    	 restoran.menuyeUrunEkle(yemek1);
    	 restoran.menuyeUrunEkle(yemek2);
    	 restoran.menuyeUrunEkle(yemek3);
    	 restoran.menuyeUrunEkle(yemek4);
    	 restoran.menuyeUrunEkle(icecek1);
    	 restoran.menuyeUrunEkle(icecek2);
    	 restoran.menuyeUrunEkle(icecek3);
    	 restoran.menuyeUrunEkle(icecek4);
    	 
    	 //Yemek menüsü konsola yazdırılıyor.
    	 restoran.menuyuGoster();
    	 
    	 //Müşteriler eklendi.
         restoran.musteriEkle(new Musteri("Aslı"));
         restoran.musteriEkle(new Musteri("Selim"));
         restoran.musteriEkle(new Musteri("Nazlı"));	
         restoran.musteriEkle(new Musteri("Ahmet"));
         restoran.musteriEkle(new Musteri("Sena"));
         //Garsonlar eklendi.
         restoran.garsonEkle(new Garson("Ahmet"));
         restoran.garsonEkle(new Garson("Mehmet"));
         restoran.garsonEkle(new Garson("Ayşe"));
         restoran.garsonEkle(new Garson("Sevde"));
         
         restoran.rastgeleSiparisOlustur();
	}
}
