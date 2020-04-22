package com.examen.tecnicos.pageobjects;

import  net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.Random;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class OpenSourceCmsMenuPage  extends PageObject{
	Random ran = new Random();
	int aleatorio = ran.nextInt(6) + 5;
	String elemento="prueba"+aleatorio;
	
	//menu Forms
	@FindBy(xpath="//DIV[@class='wp-menu-name'][text()='Posts']")
	public WebElement OptionMenuPost;
	@FindBy(xpath="//DIV[@class='wp-menu-name'][text()='Pages']")
	public WebElement OptionMenuPages;
	
	//Mantenimiento
	@FindBy(xpath = "(//TD[@class='title column-title has-row-actions column-primary page-title'])[1]")
	public WebElement actions;
	
	//Create Post
	@FindBy(xpath = "//A[@href='https://s1.demo.opensourcecms.com/wordpress/wp-admin/post-new.php'][text()='Add New']")
	public WebElement nuevoPost;
	@FindBy(xpath = "//A[@href='https://s1.demo.opensourcecms.com/wordpress/wp-admin/post-new.php?post_type=page'][text()='Add New']")
	public WebElement nuevoPages;
	
	//contentedit
	@FindBy(xpath = "//DIV[@class='edit-post-layout__content']")
	public WebElement contentedit;
	
	//Contenteditbody
	@FindBy(xpath = "//P[@role='textbox']")
	public WebElement txtnuevocontent;
	//title nuevo
	@FindBy(id = "post-title-0")
	public WebElement txtnuevo;
	
	//boton edit
	@FindBy(xpath = "(//SPAN[@class='edit'])[1]//a")
	public WebElement btnFormedit;
	
	//button publish
	@FindBy(xpath ="//BUTTON[@type='button'][text()='Publish…']")
	public  WebElement btnpublish;
	
	//button publish2
	@FindBy(xpath ="//BUTTON[@type='button'][text()='Publish']")
	public  WebElement btnpublish2;
	
	//caja de texto buscar
	@FindBy(xpath = "//INPUT[@id='post-search-input']")
	public WebElement txtsearch;
		
	//boton editar
	@FindBy(xpath = "//INPUT[@id='search-submit']")
	public WebElement btnsearch;
	
	
	public void menuFormValidation(String strlink) throws InterruptedException
	{
		if(strlink.contentEquals("Pages"))
		{
			OptionMenuPages.click();
		}
		else
		{
			OptionMenuPost.click();
		}
		//Crear
		if(strlink.contentEquals("Pages"))
		{
			nuevoPages.click();
		}
		else
		{
			nuevoPost.click();
		}
		Thread.sleep(10000);
		contentedit.click();
		txtnuevo.click();
		txtnuevo.sendKeys(elemento);
		btnpublish.click();
		btnpublish2.click();
		Thread.sleep(10000);
		if(strlink.contentEquals("Pages"))
		{
			OptionMenuPages.click();
		}
		else
		{
			OptionMenuPost.click();
		}
		txtsearch.click();
		txtsearch.sendKeys(elemento);
		btnsearch.click();
		//editar
		actions.click();
		btnFormedit.click();
	}
	
	
}
