package org.example;

/**
 * Basit bir Data Access Layer (DAL) örneği.
 * ICustomerDal arayüzünü (interface) uygular.
 * Bu sınıfta gerçek veri tabanı erişimi yok; sadece bağlantı dizesini
 * saklar ve add() metodu çalıştığında konsola örnek bir mesaj yazar.
 */
public class CustomerDal implements ICustomerDal{

    // Bağlantı bilgisi (dependency olarak Spring ile inject edilebilir)
    String connectionString;

    // getter/setter: Spring XML konfigürasyonundaki <property> ile set edilebilir
    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString=connectionString;
    }

    @Override
    public void add() {
        // Gerçek uygulamada burada DB'ye ekleme yapılır.
        // Bu örnekte sadece konsola bağlantı ve örnek çıktı yazıyoruz.
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("Oracle veri tabanına eklendi.");
    }
}
