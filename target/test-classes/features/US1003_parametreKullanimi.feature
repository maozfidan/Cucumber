
Feature: US1003 Kullanici parametre kullanarak arama yapabilmeli

  @parametra

  Scenario: TC06
    Given kullanici amazon anasayfasinda
    And  kullanici "Nutella" icin arama yapar
    And  sonuclarin "Nutella" icin arama yapar
    Then sayfayi kapatir