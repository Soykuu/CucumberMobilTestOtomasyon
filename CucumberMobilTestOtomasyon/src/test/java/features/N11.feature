@N11
Feature:N11 mobil uygulaması
  Scenario: N11 mobil uygulamasını kullanarak telefon satın alma otomasyonu

    When Kategorilere tıklanır
    When Elektronik sekmesine tıklanır
    When Telefon Aksesuarları seçilir
    When Cep telefonu seçilir
    When Filtrelemeye tıklanır
    When Filtreleme yapılır
    When Sonuçları göstere tıklanır
    When Ürün sepete eklenir
    When Sepete gidilir
    Then Ürünün sepete geldiği kontrol edilir.