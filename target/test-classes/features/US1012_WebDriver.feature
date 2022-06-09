
  Feature: US1012 kullanici WebDrivera giderek bilgiler girildi

    Scenario: TC17 kullanici siteye bilgileri girebilmeli

      Given kullanici "webUrl" anasayfasinda
      Then Login portala kadar asagi inildi
      And kullanici 2 sn bekler
      Then Login Portal a tiklayin
      And kullanici 2 sn bekler
      And  Diger window'a gecin
      And "username" ve "password" kutularina deger yazdirin
      And kullanici 2 sn bekler
      And login butonuna basin
      And kullanici 2 sn bekler
      And Popup'ta cikan yazinin "validation failed" oldugunu test edin
      Then Ok diyerek Popup'i kapatin
      Then Ilk sayfaya geri donun
      And Ilk sayfaya donuldugunu test edin
      Then sayfayi kapatir