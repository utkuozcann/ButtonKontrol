Uygulama Açıklaması
Bu uygulamada Java Swing kullanarak basit bir grafik kullanıcı arayüzü (GUI) oluşturuluyor ve bu arayüzde özelleştirilmiş butonlarla etkileşim sağlanıyor. 

MyButton1 Sınıfı
MyButton1: Özelleştirilmiş bir JButton sınıfıdır. Butonların aktif (yeşil renk, belirli bir ikon) ve pasif (kırmızı renk, farklı bir ikon) durumlarını yönetir.
setActive(boolean): Butonun aktif veya pasif durumunu ayarlar.
isActive(): Butonun aktif olup olmadığını kontrol eder.
setActiveColor(Color), setPassiveColor(Color): Aktif ve pasif durumlar için renkleri ayarlar.
setActiveIcon(String), setPassiveIcon(String): Aktif ve pasif durumlar için ikonları ayarlar.

Main Sınıfı
Ana uygulama sınıfıdır. Bir pencere oluşturur ve içine bir panel yerleştirir. Bu panelde 16 adet MyButton1 butonu bulunur.
Butonlara basıldığında gerçekleşecek eylemleri tanımlayan ActionListener içerir.
Eğer ilk butona basılırsa, tüm butonlar pasif hale getirilir. Diğer butonlar için, o anki durumları tersine çevrilir (aktif ise pasif, pasif ise aktif yapılır).

Kullanım Talimatları
Kurulum
Java Development Kit (JDK) yüklü olmalıdır.
Verilen kodu bir Java IDE'ye (örneğin IntelliJ IDEA, Eclipse) kopyalayın veya bir metin editöründe kaydedin ve .java uzantısı ile kaydedin.

Çalıştırma
Main sınıfını çalıştırın. Bu, GUI penceresini açacaktır.
Pencerede gösterilen butonlarla etkileşime geçin. Butonlara tıklayarak aktif/pasif durumlarını değiştirebilirsiniz.

Notlar
Uygulama, basit bir etkileşim mekanizması sağlar ve Swing kullanarak GUI geliştirmenin temellerini gösterir.

Bu uygulama, Java Swing kullanarak basit bir grafik kullanıcı arayüzü (GUI) oluşturan ve özelleştirilmiş butonlarla etkileşim sağlayan bir programdır. Temelde iki sınıftan oluşan bu uygulama, özel butonların durumlarını yöneten MyButton1 sınıfını içermektedir. Bu sınıf, butonların aktif ve pasif durumlarını kontrol etmek, renk ve ikonları ayarlamak gibi işlevlere sahiptir.

MyButton1 sınıfının temel özellikleri arasında, butonların durumunu belirten setActive ve isActive metodları bulunmaktadır. Ayrıca, renkleri belirlemek için setActiveColor ve setPassiveColor, ikonları belirlemek için setActiveIcon ve setPassiveIcon gibi metodlar da mevcuttur. Bu özellikler, butonların görsel özelliklerini kişiselleştirmek için kullanılabilir.

Main sınıfı, uygulamanın ana sınıfını temsil eder ve kullanıcı arayüzünü oluşturur. Bir pencere ve içine yerleştirilen bir panel içerir. Panele 16 adet MyButton1 butonu eklenir ve ActionListener kullanılarak butonlara tıklanma durumlarına göre işlemler gerçekleştirilir. İlk butona tıklanması durumunda tüm butonlar pasif hale getirilirken, diğer butonlarda ise durumları tersine çevrilir.

Kullanım talimatları, uygulamayı kullanmak için gerekli adımları içerir. JDK'nın yüklü olması, kodun bir Java IDE'ye kopyalanması ve çalıştırılması gibi basit adımlarla kullanıcıların uygulamayı etkileşimli bir şekilde deneyimlemeleri sağlanır. Bu talimatlar, uygulamanın kolayca kurulup çalıştırılabilmesini amaçlar.

Uygulama, temel bir etkileşim mekanizması sunarak Swing kütüphanesini kullanarak GUI geliştirmenin temel prensiplerini gösterir. Ayrıca, özelleştirilmiş butonlar gibi temel öğelerle nasıl etkileşimde bulunulabileceğini öğretir. Ancak, bu uygulama daha karmaşık projelerin temeli olarak kullanılabilecek öğrenme amaçlı bir örnektir.
Bu Java uygulaması, özelleştirilmiş JButton'lar kullanarak basit bir grafik kullanıcı arayüzü (GUI) oluşturan bir programdır. İki ana sınıftan oluşan bu uygulama, MyButton1 ve Main sınıflarını içerir. MyButton1 sınıfı, özel butonların davranışını kontrol eden metodları içerirken, Main sınıfı uygulamanın ana mantığını ve kullanıcı arayüzünü yönetir.

MyButton1 Sınıfı:
MyButton1 sınıfı, özelleştirilmiş bir JButton sınıfıdır ve şu özelliklere sahiptir:

setActive(boolean): Butonun aktif veya pasif durumunu ayarlar.
isActive(): Butonun aktif olup olmadığını kontrol eder.
setActiveColor(Color), setPassiveColor(Color): Aktif ve pasif durumlar için renkleri ayarlar.
setActiveIcon(String), setPassiveIcon(String): Aktif ve pasif durumlar için ikonları ayarlar.
Main Sınıfı:
Main sınıfı, uygulamanın ana sınıfını temsil eder ve şu özelliklere sahiptir:

Bir pencere oluşturur ve içine bir panel ekler.
Panele 16 adet MyButton1 butonu ekler.
ActionListener kullanarak butonlara tıklama durumlarına göre işlemler gerçekleştirir.
İlk butona tıklanması durumunda tüm butonları pasif hale getirir, diğer butonlarda ise durumları tersine çevirir.
Kullanım Talimatları:

Kurulum:

Java Development Kit (JDK) yüklü olmalıdır.
Verilen kodu bir Java IDE'ye (IntelliJ IDEA, Eclipse) kopyalayın veya bir metin editöründe kaydedin ve .java uzantısı ile kaydedin.
Çalıştırma:

Main sınıfını çalıştırın. Bu, GUI penceresini açacaktır.
Pencerede gösterilen butonlarla etkileşime geçin. Butonlara tıklayarak aktif/pasif durumlarını değiştirebilirsiniz.
Notlar:

Uygulama, basit bir etkileşim mekanizması sağlar ve Swing kullanarak GUI geliştirmenin temellerini gösterir.
MyButton1 sınıfı, özelleştirilmiş butonların görsel özelliklerini kişiselleştirmek için kullanılabilir.
Kullanım talimatları, uygulamayı kullanmak için gerekli adımları içerir ve JDK'nın yüklü olması gibi önkoşulları belirtir.
Uygulama, temel bir etkileşim mekanizması sunarak Swing kütüphanesini kullanarak GUI geliştirmenin temel prensiplerini gösterir



https://github.com/utkuozcann/ButtonKontrol/assets/153429918/79c9a386-a7d8-42df-b793-82baebb14cf7


