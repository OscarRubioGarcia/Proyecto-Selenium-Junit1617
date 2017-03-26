package com.sdi.tests.Tests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import com.sdi.tests.pageobjects.PO_AutoLogin;
import com.sdi.tests.pageobjects.PO_crearTarea;
import com.sdi.tests.utils.SeleniumUtils;

//Ordenamos las pruebas por el nombre del método
@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class PlantillaSDI2_Tests1617 {

	WebDriver driver; 
	List<WebElement> elementos = null;
	
	public PlantillaSDI2_Tests1617()
	{
	}

	@Before
	public void run()
	{
		//Este código es para ejecutar con la versión portale de Firefox 46.0
		File pathToBinary = new File("S:\\firefox\\FirefoxPortable.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.get("http://localhost:8180/sdi2-13");
		//Este código es para ejecutar con una versión instalada de Firex 46.0 
		//driver = new FirefoxDriver();
		//driver.get("http://localhost:8180/sdi2-n");			
	}
	@After
	public void end()
	{
		//Cerramos el navegador
		driver.quit();
	}

	//PRUEBAS
	//ADMINISTRADOR
	//PR01: Autentificar correctamente al administrador.
	@Test
    public void prueba01() {
		assertTrue(false);	
    }
	//PR02: Fallo en la autenticación del administrador por introducir mal el login.
	@Test
    public void prueba02() {
		assertTrue(false);
    }
	//PR03: Fallo en la autenticación del administrador por introducir mal la password.
	@Test
    public void prueba03() {
		assertTrue(false);
    }
	//PR04: Probar que la base de datos contiene los datos insertados con conexión correcta a la base de datos.
	@Test
    public void prueba04() {
		assertTrue(false);
    }
	//PR05: Visualizar correctamente la lista de usuarios normales. 
	@Test
    public void prueba05() {
		assertTrue(false);
    }
	//PR06: Cambiar el estado de un usuario de ENABLED a DISABLED. Y tratar de entrar con el usuario que se desactivado.
	@Test
    public void prueba06() {
		assertTrue(false);
    }
	//PR07: Cambiar el estado de un usuario a DISABLED a ENABLED. Y Y tratar de entrar con el usuario que se ha activado.
	@Test
    public void prueba07() {
		assertTrue(false);
    }
	//PR08: Ordenar por Login
	@Test
    public void prueba08() {
		assertTrue(false);
    }
	//PR09: Ordenar por Email
	@Test
    public void prueba09() {
		assertTrue(false);
    }
	//PR10: Ordenar por Status
	@Test
    public void prueba10() {
		assertTrue(false);
    }
	//PR11: Borrar  una cuenta de usuario normal y datos relacionados.
	@Test
    public void prueba11() {
		assertTrue(false);
    }
	//PR12: Crear una cuenta de usuario normal con datos válidos.
	@Test
    public void prueba12() {
		assertTrue(false);
    }
	//PR13: Crear una cuenta de usuario normal con login repetido.
	@Test
    public void prueba13() {
		assertTrue(false);
    }
	//PR14: Crear una cuenta de usuario normal con Email incorrecto.
	@Test
    public void prueba14() {
		assertTrue(false);
    }
	//PR15: Crear una cuenta de usuario normal con Password incorrecta.
	@Test
    public void prueba15() {
		assertTrue(false);
    }
	//USUARIO
	//PR16: Comprobar que en Inbox sólo aparecen listadas las tareas sin categoría y que son las que tienen que. Usar paginación navegando por las tres páginas.
	@Test
    public void prueba16() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 10); 
		
		//Llega al listados con exito ahora necesito q pagine
		By id = By.xpath("//div[@id='form:tablalistadoMain_paginator_top']/span[4]/span[2]");
		
		WebElement page2 = driver.findElement(id);
		page2.click();
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 9", 10); 
    }
	//PR17: Funcionamiento correcto de la ordenación por fecha planeada.
	@Test
    public void prueba17() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.xpath("//*[contains(@id,'sortPlanned')]");
		
		driver.findElement(id).click();
		
		//llega a clicar el filtrado
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 1", 10); 
    }
	//PR18: Funcionamiento correcto del filtrado.
	@Test
    public void prueba18() {
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:filterTitle:filter");
		
		WebElement title = driver.findElement(id);
		title.click();
		title.clear();
		title.sendKeys("Tarea 1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 1", 20); 
		
    }
	//PR19: Funcionamiento correcto de la ordenación por categoría.
	@Test
    public void prueba19() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:j_idt26");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "1", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 11", 20); 
    }
	//PR20: Funcionamiento correcto de la ordenación por fecha planeada.
	@Test
    public void prueba20() {
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:j_idt17");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "1", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 11", 20); 
    }
	//PR21: Comprobar que las tareas que no están en rojo son las de hoy y además las que deben ser.
	@Test
    public void prueba21() {
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 1", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 2", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 3", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 4", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 5", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 6", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 7", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 8", 20); 
		
    }
	//PR22: Comprobar que las tareas retrasadas están en rojo y son las que deben ser.
	@Test
    public void prueba22() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		String text = driver.findElement(By.cssSelector("span.red")).getText();
		
		text.contains(""+new Date());
    }
	//PR23: Comprobar que las tareas de hoy y futuras no están en rojo y que son las que deben ser.
	@Test
    public void prueba23() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoSemana");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:j_idt17");
		
		WebElement title = driver.findElement(id);
		//Click 2 veces
		title.click();
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 11", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 12", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 13", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 14", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 15", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 16", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 17", 20);
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 18", 20);
    }
	//PR24: Funcionamiento correcto de la ordenación por día.
	@Test
    public void prueba24() {
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 10); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoSemana");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:j_idt17");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 11", 20);
		
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 21", 20);
    }
	//PR25: Funcionamiento correcto de la ordenación por nombre.
	@Test
    public void prueba25() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 50); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoSemana");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:j_idt20:filter");
		
		WebElement title = driver.findElement(id);
		title.click();
		title.sendKeys("Tarea 4");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 4", 20); 
		SeleniumUtils.EsperaCargaPaginaNoTexto(driver, "Tarea 1", 20);
    }
	//PR26: Confirmar una tarea, inhabilitar el filtro de tareas terminadas, ir a la pagina donde está la tarea terminada y comprobar que se muestra. 
	@Test
    public void prueba26() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 50); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:0:j_idt35");
		
		WebElement accept = driver.findElement(id);
		accept.click();
		
		SeleniumUtils.EsperaCargaPaginaNoTexto(driver, "Tarea 1", 20); 
				
		By id2 = By.cssSelector("span.ui-button-text.ui-c");
		
		WebElement filter = driver.findElement(id2);
		filter.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea 1", 20); 
		
		prueba04();
    }
	//PR27: Crear una tarea sin categoría y comprobar que se muestra en la lista Inbox.
	@Test
    public void prueba27() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 50); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:crearTarea");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "nombre", 20);
		
		new PO_crearTarea().rellenaFormulario(driver, "Tarea Nueva");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20);
		
		By id = By.id("form:tablalistadoMain:filterTitle:filter");
		
		WebElement title = driver.findElement(id);
		title.click();
		title.sendKeys("Tarea Nueva");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea Nueva", 20); 
		
		prueba04();
    }
	//PR28: Crear una tarea con categoría categoria1 y fecha planeada Hoy y comprobar que se muestra en la lista Hoy.
	@Test
    public void prueba28() {
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 50); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:crearTarea");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "nombre", 20);
		
		Calendar cal = Calendar.getInstance();
	    int day = cal.get(Calendar.DAY_OF_MONTH);
		
		new PO_crearTarea().rellenaFormulario(driver, "Tarea Nueva Cat1", day, "1");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20);
		
		By id = By.id("form:tablalistadoMain:j_idt20:filter");
		
		WebElement title = driver.findElement(id);
		title.click();
		title.sendKeys("Tarea Nueva Cat1");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea Nueva Cat1", 20); 
		
		prueba04();
    }
	//PR29: Crear una tarea con categoría categoria1 y fecha planeada posterior a Hoy y comprobar que se muestra en la lista Semana.
	@Test
    public void prueba29() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 50); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:crearTarea");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "nombre", 20);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +1);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
		
		new PO_crearTarea().rellenaFormulario(driver, "Tarea Nueva Futura", day, "1");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20);
		
		By id = By.id("form:tablalistadoMain:j_idt20:filter");
		
		WebElement title = driver.findElement(id);
		title.click();
		title.sendKeys("Tarea Nueva Futura");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Tarea Nueva Futura", 20); 
		
		prueba04();
		
    }
	//PR30: Editar el nombre, y categoría de una tarea (se le cambia a categoría1) de la lista Inbox y comprobar que las tres pseudolista se refresca correctamente.
	@Test
    public void prueba30() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 15); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 

		By id = By.cssSelector("span.ui-icon.ui-icon-pencil");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id2 = By.id("form:tablalistadoMain:0:tittleInput");
		
		WebElement input = driver.findElement(id2);
		input.clear();
		input.sendKeys("Editada");
		
		By id3 = By.name("form:tablalistadoMain:0:j_idt30");
		
		Select dropdown = new Select(driver.findElement(id3));
		dropdown.selectByVisibleText("1");
		
		By id4 = By.xpath("//div[@id='form:tablalistadoMain:0:editColumn']/span[2]");
		WebElement input3 = driver.findElement(id4);
		input3.click();
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Editada", 20); 
		
		prueba04();
    }
	//PR31: Editar el nombre, y categoría (Se cambia a sin categoría) de una tarea de la lista Hoy y comprobar que las tres pseudolistas se refrescan correctamente.
	@Test
    public void prueba31() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 15); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 

		By catFil = By.id("form:tablalistadoMain:j_idt26");
		WebElement catFiltr = driver.findElement(catFil);
		catFiltr.click();
		
		By id = By.cssSelector("span.ui-icon.ui-icon-pencil");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 25); 
		
		By id2 = By.id("form:tablalistadoMain:0:tittleInput");
		
		WebElement input = driver.findElement(id2);
		input.click();
		input.clear();
		input.sendKeys("Editada2");
		
		By id3 = By.name("form:tablalistadoMain:0:j_idt29");
		
		Select dropdown = new Select(driver.findElement(id3));
		dropdown.selectByVisibleText("none");
		
		By id4 = By.xpath("//div[@id='form:tablalistadoMain:0:editColumn']/span[2]");
		WebElement input3 = driver.findElement(id4);
		input3.click();
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By filtroF = By.id("form:tablalistadoMain:filterTitle:filter");
		
		WebElement solucion = driver.findElement(filtroF);
		solucion.click();
		solucion.sendKeys("Editada2");
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Editada2", 20); 
		
		prueba04();
    }
	//PR32: Marcar una tarea como finalizada. Comprobar que desaparece de las tres pseudolistas.
	@Test
    public void prueba32() {
		
		//Pinchamos la opción de menu
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:iniciarSession");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 15); 
		
		//Pinchamos la opción de menu Alta Alumno
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoInbox");

		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		
		By id = By.id("form:tablalistadoMain:0:j_idt35");
		
		WebElement title = driver.findElement(id);
		title.click();
		
		SeleniumUtils.EsperaCargaPagina(driver, "id", "tablalistadoMain", 20); 
		SeleniumUtils.EsperaCargaPaginaNoTexto(driver, "Tarea 1", 20); 
		
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoHoy");
		SeleniumUtils.EsperaCargaPaginaNoTexto(driver, "Tarea 1", 20); 
		
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu1", "form-cabecera:listadoSemana");
		SeleniumUtils.EsperaCargaPaginaNoTexto(driver, "Tarea 1", 20); 
		
		prueba04();
    }
	//PR33: Salir de sesión desde cuenta de administrador.
	@Test
    public void prueba33() {
		assertTrue(false);
    }
	//PR34: Salir de sesión desde cuenta de usuario normal.
	@Test
    public void prueba34() {
		assertTrue(false);
    }
	//PR35: Cambio del idioma por defecto a un segundo idioma. (Probar algunas vistas)
	@Test
    public void prueba35() {
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Aplicación de gestión de tareas", 10);
		
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu2", "form-cabecera:eng");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Task management website", 10);
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 15); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Task management website", 15); 
		
    }
	//PR36: Cambio del idioma por defecto a un segundo idioma y vuelta al idioma por defecto. (Probar algunas vistas)
	@Test
    public void prueba36() {
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Aplicación de gestión de tareas", 10);
		
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu2", "form-cabecera:eng");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Task management website", 10);
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "login", 10); 

		//Vamos a rellenar el formulario
		new PO_AutoLogin().rellenaFormulario(driver, "user1", "user1");
		
		//Esperamos a que se cargue la pagina 
		SeleniumUtils.EsperaCargaPagina(driver, "id", "form-cabecera:misubmenu1", 15); 
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Task management website", 15); 
		
		SeleniumUtils.ClickSubopcionMenuHover(driver, "form-cabecera:misubmenu2", "form-cabecera:esp");
		
		SeleniumUtils.EsperaCargaPagina(driver, "text", "Aplicación de gestión de tareas", 10);
    }
	//PR37: Intento de acceso a un  URL privado de administrador con un usuario autenticado como usuario normal.
	@Test
    public void prueba37() {
		assertTrue(false);
    }
	//PR38: Intento de acceso a un  URL privado de usuario normal con un usuario no autenticado.
	@Test
    public void prueba38() {
		assertTrue(false);
    }

	



	
	


    
}