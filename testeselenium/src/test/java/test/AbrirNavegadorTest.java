package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadorTest {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//informando onde esta o chrome driver no computador
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//adicionando o chrome para o parametro driver
		driver = new ChromeDriver();
		//adicionando a url para o driver poder acessar
		driver.get("http://www2.ifam.edu.br/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebElement menu = driver.findElement(By.id("portalservicos-manaus-centro")); 
		assertTrue(menu.getText().contains("Manaus Centro")); 

	}
	
	@After
	public void fecharPagina()
	{
		driver.quit();
	}

}
