Feature: Deneme soru cözümü
  @demo
  Scenario: TC1 soru cözümü
    Given kullanici "demoUrl" anasayfasinda

    Then “Will enable 5 seconds” butonunun enable olmasini beklenir
    Then “Will enable 5 seconds” butonunun enable oldugunu test edilir
    And sayfa kapanir