package inheritance;

public class IndividualCustomer extends Customer {//bireysel müşteri , müşterinin geliştirilmiş versiyonudur//bireysel kullanıcı 
												//extends genişletmek anlamında 
										//extends ile Customer sınıfından yani üst sınıftan inheritance kalıtım yapıyoruz
	String firstName;					//extends ifadesinin kullanım amacı bireysel müşterininde id ve customerNumber'ına ulaşmak için kullanılır
	String lastName;					//main kısmından bireysel müşteri oluşturup id kısmına erişmemiz için extends i kullanıp customer sıınfını eklememiz gerekir 
	String nationalIdentity;			//bu işleme inheritance 

}
