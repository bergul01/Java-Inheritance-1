package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer engin =new IndividualCustomer(); //bireysel 
		engin.customerNumber="12345-bireysel";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();//kurumsal 
		hepsiBurada.customerNumber = "78910-kurumsal";
		
		SyndicateCustomer sendika = new SyndicateCustomer();//sendika 
		sendika.customerNumber ="99999-sendika";
		
		CustomerManager customerManager = new CustomerManager();
	
		Customer[] customers = {engin ,hepsiBurada ,sendika};  //customers arrys oluşturuldu.
		
		customerManager.addMultiple(customers);	//arrays içindekileri addMultiple metod kısmına parametre olarak yolluyoruz
		
		
		
	}
	

}
