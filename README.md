
n11.com, web sayfası üzerinden bir kullanıcının "Iphone" ürünü araması ve bu ürünün kullanıcının favorilerine eklenmesini, sonra da silinmesi ve sayfadan çıkılması süreçlerini test etmek istemektedir.

Projeyi github üzerinden aşağıdaki linke tıklayarak inceleyebilir ve indirebilirsiniz.

Proje Java programlama dili ile yazıldığından, Projeyi Java IntelliJ ile çalıştırabilirsiniz.

Proje içerisindeki testler tek bir sayfadan başlatılarak sonuçlandırılır. "runner" paketinin içerisinde tanımlanan "CukesRunner" sınıfı içerisindeki "public class CukesRunner" ibaresinin arkasındaki konsolda yer alan yürütme butonu testi tetikleyecek ve sonuclandıracaktır.

Projede  Projede BDD (Behaviour Driven Development) yaklaşımı uygulandı. Senaryo Ghirkin ile yazılarak tüm diğer teknik bilgisi olmayan ekip üyelerinin anlaması için son kullanıcı perspektifi ile yazıldı. Arka planda POM(Project Object Model) kullanılarak web elementler tek bir sayfa locate edildi. Yine bu projenin arka plan implemantasyonunda actuel kodlama mantığı olan JAVA-SELENIUM-JUNIT kullanılarak adım adım tüm uygulamalar gerçekleştirildi.

Projenin raporlanmasında daha detaylı raporlamalar yapan "Maven-Cucumber" raporlama sistemi kullanıldı. Bu raporlara "target" directory'nin altında ulaşabilirsiniz.