package com.sdi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PO_crearTarea {

	public void rellenaFormulario(WebDriver driver, String titulo) {
		
		WebElement nombre = driver.findElement(By.id("form-principal:nombre"));
		nombre.click();
		nombre.clear();
		nombre.sendKeys(titulo);
		
		WebElement calendar = driver.findElement(By.linkText("26"));
		calendar.click();
		
		//Pulsar el boton de enviar.
		By boton = By.id("form-principal:botonEntrar");
		driver.findElement(boton).click();	   
	}

	public void rellenaFormulario(WebDriver driver, String titulo, int hoy) {
		
		WebElement nombre = driver.findElement(By.id("form-principal:nombre"));
		nombre.click();
		nombre.clear();
		nombre.sendKeys(titulo);
		
		WebElement calendar = driver.findElement(By.linkText(Integer.toString(hoy)));
		calendar.click();
		
		//Pulsar el boton de enviar.
		By boton = By.id("form-principal:botonEntrar");
		driver.findElement(boton).click();	   
		
	}

	public void rellenaFormulario(WebDriver driver, String titulo, int date,
			String cat) {
		
		WebElement nombre = driver.findElement(By.id("form-principal:nombre"));
		nombre.click();
		nombre.clear();
		nombre.sendKeys(titulo);
		
		WebElement calendar = driver.findElement(By.linkText(Integer.toString(date)));
		calendar.click();
		
		By id3 = By.id("form-principal:categoryId");
		
		Select dropdown = new Select(driver.findElement(id3));
		dropdown.selectByVisibleText("1");
		
		//Pulsar el boton de enviar.
		By boton = By.id("form-principal:botonEntrar");
		driver.findElement(boton).click();	
		
	}
	
}
