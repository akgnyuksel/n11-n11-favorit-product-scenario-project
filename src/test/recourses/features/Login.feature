@smoke
Feature: N11 Favori Urun Senaryosu
  User Story:
  Kullanici olarak, dogru kullanici bilgileri ile oturum acilabilmeli

  Background: Giris sayfasında kullanici varsayilarak
    Given kullanici giris sayfasinda

  Scenario: Kullanicinin sayfaya giris yaparak favorilere urun eklemesi
    When kullanici adini girer
    And kullanici sifresini girer
    And kullanici siteye girer
    And kullanici iphone kelimesini aratir
    And arama sonuclari sayfasi acilir
    And kullanici sayfadaki ucuncu urunu favorilere ekler
    And kullanici hesabindan favorilere gider
    And kullanici eklenen urunu favorilerden siler
    Then kullanici siteden cikar
