package nypProje;

import java.io.*;
import java.util.*;


class Restoran {
	private ArrayList <Urun> menu = new ArrayList<>();
	private ArrayList <Siparis> siparisler=new ArrayList<>();
	private ArrayList <Musteri> musteriler = new ArrayList<>();
	private ArrayList <Garson> garsonlar = new ArrayList<>();
	
	
	public Restoran() {
	}
	//test sınıfından gelen değerler ArrayListlere ekleniyor.
	public void menuyeUrunEkle(Urun urun) {
			menu.add(urun);		
	}
	public void musteriEkle(Musteri musteri) {
		 musteriler.add(musteri);		
	}	
	public void garsonEkle(Garson garson) {
		 garsonlar.add(garson);
	}
	
	public void menuyuGoster() {//test medodunda çağırılıyor.
		 System.out.println("---------MENÜ----------");
		 //for- each döngüsü ile menü içindeki bilgiler yazılır.
		 for(Urun x : menu) {
			 x.urunBilgisi();
		 }
	}
	
	 public void rastgeleSiparisOlustur() {
	        Random rastgeleSayi2 = new Random();
	        Date zaman = new Date();
	        
	        try (PrintWriter genelDosyaYazici = new PrintWriter(new FileWriter("siparisler.txt", true))) { // 'true' ile ekleme modu
	        	//for döngüsü ile 10 adet rastgele siparis, müşteri ve garson oluşturulur.
	            for (int i = 0; i < 10; i++) {
	                Musteri musteriDeg = musteriler.get(rastgeleSayi2.nextInt(musteriler.size()));
	                Garson garsonDeg = garsonlar.get(rastgeleSayi2.nextInt(garsonlar.size()));
	                Urun yiyecekVeIcecek = menu.get(rastgeleSayi2.nextInt(menu.size()));

	                long siparisNo = 1;
	                Siparis yeniSiparis = new Siparis(yiyecekVeIcecek, garsonDeg, musteriDeg, zaman, siparisNo);
	                siparisler.add(yeniSiparis);
	                //siparis bilgisi metodu ile siparis bilgileri ekrana yazılır
	                yeniSiparis.siparisBilgisi();

	                // Genel dosyaya yazdır
	                yeniSiparis.siparisYazdir(genelDosyaYazici);

	                // Her sipariş için ayrı dosya yazma
	                try (PrintWriter yazici = new PrintWriter(new FileWriter("siparisler/siparis_" + (i + 1) + ".txt"))) {
	                    yeniSiparis.siparisYazdir(yazici);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        } catch (IOException e) {//hata kontrolu
	            e.printStackTrace();
	        }
	 
	        
	       
	            
}
	        
	    
	   
}
