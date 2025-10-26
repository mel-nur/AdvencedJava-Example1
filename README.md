# springIntro

Basit Spring IoC/DI örneği (Java + Maven).

Hızlı kullanım:

```powershell
cd 'C:\Users\cotak_8sfhz1n\IdeaProjects\springIntro'
mvn -DskipTests compile
``` 

Çalıştırma: IDE'den `org.example.Main` sınıfını çalıştırmak en kolay yoldur.

Notlar:
- `applicationContext.xml` içinde `MsSqlCustomerDal` kullanılıyor. Farklı bir DAL için XML'i güncelleyin.
- Proje eğitim amaçlı; veri tabanı işlemleri yerine konsola yazma yapılır.

---

 
## Hakkında

Bu proje, Spring çerçevesini kullanarak IoC (Inversion of Control) ve DI (Dependency Injection) kavramlarını öğretmek amacıyla hazırlanmış küçük bir örnektir. `ICustomerDal` ve `ICustomerService` arayüzleri ile servis ve veri erişim katmanları ayrıştırılmıştır. `MsSqlCustomerDal`, `MySqlCustomerDal` ve `CustomerDal` gibi farklı DAL (Data Access Layer) implementasyonları bulunur. Hangi DAL'ın kullanılacağı `applicationContext.xml` ile belirlenir; bağlantı dizesi `values.properties` üzerinden sağlanır. Örnek uygulama eğitim amaçlıdır — gerçek veritabanı işlemleri yerine konsola yazma yapılmaktadır.

## Proje yapısı ve nasıl çalışır

- `src/main/java/org/example` — kaynak kodu
	- `ICustomerService` — servis katmanı arayüzü (business logic)
	- `CustomerManager` — servis implementasyonu; `ICustomerDal` bağımlılığını setter injection ile alır
	- `ICustomerDal` — veri erişim katmanı arayüzü
	- `MsSqlCustomerDal`, `MySqlCustomerDal`, `CustomerDal` — DAL implementasyon örnekleri
	- `Main` — uygulama giriş noktası; Spring XML ile `service` bean'i alınıp `add()` çağrılır

- `src/main/resources/applicationContext.xml` — Spring bean konfigürasyonu (setter injection ve property-placeholder örneği)
- `src/main/resources/values.properties` — yapılandırma değerleri (ör. `database.connectionString`)
- `pom.xml` — Maven proje tanımı ve bağımlılıklar

---
