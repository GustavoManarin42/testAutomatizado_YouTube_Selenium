/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetecnico_selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Gustavo Manarin
 */
public class TesteTecnico_Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Configurando o driver que permite o acesso ao Chrome
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        
        //Instanciando a classe para acessar o Selenium
        WebDriver browser = new ChromeDriver();
        
        //Abrindo no navegador o site do YouTube
        browser.get("https://www.youtube.com");
        
        //Buscando pelo elento de busca do site
        browser.findElement(By.name("search_query")).sendKeys("D1 - Jornadas Digitais");
        
        //Clicando no botão de busca
        browser.findElement(By.id("search-form")).submit();

        //Clicando no canal
        browser.findElement(By.id("main-link")).click();
        
       //Clicando no sobre, pegar a lista do tabContaneir e selecionaria a ultima opção que no caso seria a haba SOBRE 
       //List<WebElement> list = browser.findElements(By.id("tabs-inner-container"));
       //list.get(5).click();
       
       browser.get(browser.getCurrentUrl());
       
       //Lendo a quantidade de incrirtos
       System.out.println(browser.findElement(By.id("subscriber-count")).getText());
       
       //Tirando print
       File print = browser.findElement(By.id("channel-header-container")).getScreenshotAs(OutputType.FILE);
       
       //Salvando print na pasta no local
       FileUtils.copyFile(print, new File("./image.png"));
               
       //Fechando o browser
       browser.close();
    }
    
}
