package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid4 {

    public static void main(String[] args) throws MalformedURLException {


        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.113:4444"),new ChromeOptions());

        driver.get("https://medunna.com/");

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());



    }
}
