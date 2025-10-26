package org.example;

/**
 * MySQL için basit DAL implementasyonu.
 * ICustomerDal arayüzünü uygular. Bu örnek uygulamada sadece konsola yazma var.
 */
public class MySqlCustomerDal implements ICustomerDal{

    // Bağlantı dizesi alanı (spring ile inject edilebilir)
    String connectionString;
    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString=connectionString;
    }

    @Override
    public void add() {
        // Gerçek uygulamada burası MySQL'e ekleme yapar; örnekte konsola yazıyoruz.
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("MySQL veri tabanına eklendi");
    }
}
