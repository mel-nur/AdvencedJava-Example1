package org.example;

/**
 * Veri erişim katmanı için basit bir arayüz (interface).
 * Farklı veri tabanları (MsSQL, MySQL, Oracle gibi) bu arayüzü implemente eder.
 */
public interface ICustomerDal {
    // Müşteri ekleme işlemini temsil eden yöntem.
    void add();
}
