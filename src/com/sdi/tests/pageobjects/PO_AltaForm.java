package com.sdi.tests.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PO_AltaForm {

   public void rellenaFormulario(WebDriver driver, String pnombre, String pcorreo, String pcontraseña, String pcontraseña2)
   {
		WebElement nombre = driver.findElement(By.id("form-principal:login"));
		nombre.click();
		nombre.clear();
		nombre.sendKeys(pnombre);
		WebElement apellidos = driver.findElement(By.id("form-principal:email"));
		apellidos.click();
		apellidos.clear();
		apellidos.sendKeys(pcorreo);
		WebElement iduser = driver.findElement(By.id("form-principal:password"));
		iduser.click();
		iduser.clear();
		iduser.sendKeys(pcontraseña);
		WebElement idcorreo = driver.findElement(By.id("form-principal:password2"));
		idcorreo.click();
		idcorreo.clear();
		idcorreo.sendKeys(pcontraseña2);
		//Pulsar el boton de Alta.
		By boton = By.id("form-principal:boton");
		driver.findElement(boton).click();	   
   }
	
	
	
}
