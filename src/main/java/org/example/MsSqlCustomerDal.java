package org.example;

/**
 * MsSQL için basit DAL implementasyonu.
 * ICustomerDal arayüzünü uygular. Gerçek projede burada JDBC/ORM kodu olur.
 */
public class MsSqlCustomerDal implements ICustomerDal{

    // Bağlantı dizesi (config üzerinden inject edilir)
    String connectionString;

    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString=connectionString;
    }

    @Override
    public void add() {
        // Örnek çıktı: bağlantı bilgisi gösterilir ve hangi DB'ye eklendiği yazılır.
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("MsSQL veri tabanına eklendi.");
    }
}
