package com.sdi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_AutoLogin {

	public void rellenaFormulario(WebDriver driver, String user, String password)
	   {
			WebElement nombre = driver.findElement(By.id("form-principal:login"));
			nombre.click();
			nombre.clear();
			nombre.sendKeys(user);
			WebElement apellidos = driver.findElement(By.id("form-principal:password"));
			apellidos.click();
			apellidos.clear();
			apellidos.sendKeys(password);
			//Pulsar el boton de enviar.
			By boton = By.id("form-principal:botonEntrar");
			driver.findElement(boton).click();	   
	   }
	
}
