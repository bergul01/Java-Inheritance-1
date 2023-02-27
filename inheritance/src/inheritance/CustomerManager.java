package inheritance;

public class CustomerManager {
	
	public void add (Customer customer) { 
		//parametre içinde polimorfizm(çok biçimlilik) uygulanmıştır   
		//Customer tipinde Customer sınıfından , customer(müşteri) parametresi girdik
		/*bizden customer isteniliyor fakat main kısmına bakılıcak olursa biz customer yerine 
		 individual ve Corparete gönderiyoruz aslında çalışmaması gerekir fakat inheritance (kalıtım)
		 ile base veya super sınıfı gönderdiğimiz için sorun çıkmadı inheritanceyi extends ile yaptık  
		 individual ve corparete sınıflarında kalıtımı sağladık*/
		
		System.out.println(customer.customerNumber + " kaydedildi.");
		
	}
	
	public void addMultiple(Customer[] customers) {  //customers arrays parametre olarak istedik
		
		//foreach kullandık
		for (Customer customer : customers) { //customer türündeki her bir customers için yukarda ki metot olan add(customer) i çalıştır 
			add(customer);
		}	
	}
	
	
	
	
	//Aşağıda ki kod uzun versiyonudur.aşağıda ki kod polimorfizm yoktur
	/*
	public void add(IndividualCustomer customer) {							//iki tane add metodu ile overloading yapıldı aşırıyükleme 
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
		
	}
	*/
	
}
