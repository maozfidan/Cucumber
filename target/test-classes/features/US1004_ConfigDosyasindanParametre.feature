
  Feature: US1004 Kullanici parametre ile configration file'i kullanilmali

    Scenario: TC07 Configration kullanilmali

      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici 2 sn bekler
      And url'in "amazon" icerdigini test eder
      And sayfayi kapatir