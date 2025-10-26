package org.example;

/**
 * Servis katmanı (business/service layer) örneği.
 * ICustomerService arayüzünü uygular ve bir ICustomerDal bağımlılığına sahiptir.
 * Bağımlılık setter ile (setCustomerDal) inject ediliyor — XML konfigürasyonda
 * <property name="customerDal" ref="..." /> kullanılıyor.
 */
public class CustomerManager implements ICustomerService{
    private ICustomerDal customerDal;

    // Constructor injection örneği (şu an yorum satırı halinde). Eğer constructor
    // kullanılsaydı Spring XML içinde <constructor-arg ref="database"/> kullnılabilirdi.
    /*
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    */

    // Setter injection: Spring bean konfigürasyonunda çağrılır.
    public void setCustomerDal(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add(){
        // İş kuralları (validation, logging vb.) buraya gelir; sonra veri erişim katmanını çağırırız.
        customerDal.add();
    }
}
