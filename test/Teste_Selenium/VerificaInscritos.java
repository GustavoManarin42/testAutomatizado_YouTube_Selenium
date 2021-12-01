package Teste_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Manarin
 */
public class VerificaInscritos {

    public void verificaIncritosPrinta(){
           //Configurando o driver que permite o acesso ao Chrome
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        
        //Instanciando a classe para acessar o Selenium
        WebDriver browser = new ChromeDriver();
        
        //Abrindo no navegador o site do YouTube
        browser.navigate().to("https://www.youtube.com");
        
        //Buscando pelo elento de busca do site
        browser.findElement(By.id("search")).sendKeys("D1 - Jornadas Digitais");
        
        //Clicando no botão de busca
        browser.findElement(By.id("search-icon-legacy")).click();

        //Clicando no canal
        browser.findElement(By.id("main-link")).click();
        
       //Clicando no sobre
       //
       
       //Tirando print
       //File sobreCanal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       //Salvando print na pasta no local
       
               
       //Fechando o browser
       browser.close();
    }
}
