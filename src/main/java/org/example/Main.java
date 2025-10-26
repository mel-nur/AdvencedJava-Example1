package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        // Spring XML konfigürasyonunu yükle (classpath üzerindeki applicationContext.xml)
        // ClassPathXmlApplicationContext AutoCloseable olduğu için try-with-resources kullanıyoruz
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // Konfigürasyonda tanımlı 'service' bean'ini al ve ICustomerService türüne cast et
            ICustomerService customerService = context.getBean("service", ICustomerService.class);

            // Servis katmanını çağır (bu çağrı altında DAL implementasyonu çalışacaktır)
            customerService.add();

        }

        // Notlar:
        // IoC (Inversion of Control): Nesne örnekleme mantığı Spring'e devredildi.
        // Dependency Injection: CustomerManager içindeki ICustomerDal bağımlılığı context tarafından inject ediliyor.
        // SOLID ve temiz mimari konuları bu basit örnek üzerinden geliştirilebilir.
    }
}