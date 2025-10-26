package org.example;

/**
 * Servis katmanı için arayüz. Business logic çağrılarını burada tanımlarız.
 * Uygulama farklı servis implementasyonlarına sahip olabilir; bu örnekte
 * basitçe add() metodu vardır.
 */
public interface ICustomerService {
    void add();
}
