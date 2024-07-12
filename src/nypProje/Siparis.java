package nypProje;

import java.io.*;
import java.util.*;

class Siparis {
	private Yemek yemek;
	private Icecek icecek;
	public Garson garson;
	private Musteri musteri;
	public Date tarih;
	public static long siparisNo;
	public static long siparisNoSayac=1;
	
	public Siparis() {		
	}	
	
	public Siparis(Urun urun, Garson garson, Musteri musteri, Date tarih, long siparisNo) {
		super();
		if (urun instanceof Yemek) {
            this.yemek = (Yemek) urun;
        } 
		else if (urun instanceof Icecek) {
            this.icecek = (Icecek) urun;
        }
		this.garson = garson;
		this.musteri = musteri;
		this.tarih = tarih;
		this.siparisNo = siparisNoSayac++;
	}
	
	//Siparis Bilgisini konsola yazdıracak metod.
	void siparisBilgisi() {
		 System.out.println("\nSipariş Bilgileri:");
		 if (yemek != null) {
	            System.out.println("Yemek Adı: " + yemek.getAd() + "\nFiyat: " + yemek.getFiyat());
	        } else if (icecek != null) {
	            System.out.println("İçecek Adı: " + icecek.getAd() + "\nFiyat: " + icecek.getFiyat());
	        }
	        System.out.println("Müşteri: " + musteri.getAd());
	        System.out.println("Garson: " + garson.getAd());
	        System.out.println("Sipariş Numarası: " + siparisNo);
	        System.out.println("Şu anki zaman: " + tarih);
	        System.out.println("Sipariş Alındı.");
	    }
	//klasör ve metin dosyası oluşturup Siparis Bilgisini metin dosyasına yazdıracak metod.
	void siparisYazdir(PrintWriter yazici) { 
		
		File klasor=new File("Siparisler");
		
		 // Klasör zaten varsa hata vermesini engellemek için kontrol ediliyor.
		 if (!klasor.exists()) {
		        if (klasor.mkdir()) {
		        	System.out.println("\n\n-----------------------------");
		            System.out.println("Klasör oluşturuldu: " + klasor.getName());
		        } else {
		        	System.out.println("\n\n------------------------------");
		            System.out.println("Klasör oluşturma başarısız.");
		        }
		    } 		    
        //dosya oluşturuluyor.
        File dosya = new File("siparisler\\siparis_1.txt");
        
        try {
            if (dosya.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + dosya.getName());
                System.out.println("------------------------------\n\n");
            }             
        } catch (IOException ex) {
            System.out.println("Dosya oluşturma hatası: " + ex.getMessage());
            System.out.println("------------------------------\n\n");
        }
   
        // Metin dosyasına veri yazılıyor
		yazici.println("\nSipariş Bilgileri:");
		 if (yemek != null) {
			 yazici.println("Yemek Adı: " + yemek.getAd() + "\nFiyat: " + yemek.getFiyat());
		    } else if (icecek != null) {
		    	yazici.println("İçecek Adı: " + icecek.getAd() + "\nFiyat: " + icecek.getFiyat());
		    }
		 yazici.println("Müşteri: " + musteri.getAd());
		 yazici.println("Garson: " + garson.getAd());
		 yazici.println("Sipariş Numarası: " + siparisNo);
		 yazici.println("Şu anki zaman: " + tarih);
		 yazici.println("Sipariş Alındı.");
		 yazici.close();		
	}	
}
