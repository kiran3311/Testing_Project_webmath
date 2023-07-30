package com.web_math.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_genaralMath extends baseClass {

	@Test
	public void tc_factor() {
		driver.get(url);
		driver.findElement(By.xpath(config.getFactor())).click();
		driver.findElement(By.xpath(config.getFactorInput())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getFactorBtn())).click();

	}

	@Test
	public void tc_gcf() {
		driver.get(url);
		driver.findElement(By.xpath(config.getGcf())).click();
		driver.findElement(By.xpath(config.getGcfInput())).sendKeys(config.getNos());
		driver.findElement(By.xpath(config.getGcfBtn())).click();
	}

	@Test
	public void tc_lcm() {
		driver.get(url);
		driver.findElement(By.xpath(config.getLcm())).click();
		driver.findElement(By.xpath(config.getLcmInput())).sendKeys(config.getNos());
		driver.findElement(By.xpath(config.getLcmBtn())).click();

	}

	@Test
	public void tc_pronounce() {
		driver.get(url);
		driver.findElement(By.xpath(config.getPronounce())).click();
		driver.findElement(By.xpath(config.getPronounInput())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getPronounBtn())).click();
	}

	@Test
	public void tc_fractionToDecimal() {
		driver.get(url);
		driver.findElement(By.xpath(config.getFractionToDecimal())).click();
		driver.findElement(By.xpath(config.getFtdTop())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getFtdBottom())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getFtdBtn()));
	}

	@Test
	public void tc_decimalToFraction() {
		driver.get(url);
		driver.findElement(By.xpath(config.getDecimalToFraction())).click();
		driver.findElement(By.xpath(config.getDtfInput())).sendKeys(config.getDecimalNo());
		driver.findElement(By.xpath(config.getDtfBtn())).click();
	}

	@Test
	public void tc_NumbersOnly() {
		driver.get(url);
		driver.findElement(By.xpath(config.getNumbersonly())).click();
		driver.findElement(By.xpath(config.getNumbersonlyinput())).sendKeys(config.getNumbersonlyData());
		driver.findElement(By.xpath(config.getNumbersonlyBtn())).click();
	}

	@Test
	public void tc_withVariablesToo() {
		driver.get(url);
		driver.findElement(By.xpath(config.getWithVariablesToo())).click();
		driver.findElement(By.xpath(config.getWithVariablesTooInput())).sendKeys(config.getVariableExpression());
		driver.findElement(By.xpath(config.getInputOfa())).sendKeys(config.getA());
		driver.findElement(By.xpath(config.getWithVariablesTooBtn())).click();
	}

	@Test
	public void tc_reduce() {
		driver.get(url);
		driver.findElement(By.xpath(config.getReduce())).click();
		driver.findElement(By.xpath(config.getReduceTop())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getReduceBottom())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getReduceBtn())).click();
	}

	@Test
	public void tc_add() {
		driver.get(url);
		driver.findElement(By.xpath(config.getAdd())).click();
		driver.findElement(By.xpath(config.getAddTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getAddTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getAddBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getAddBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getAddBtn())).click();
	}

	@Test
	public void tc_addClear() {
		driver.get(url);
		driver.findElement(By.xpath(config.getAdd())).click();
		driver.findElement(By.xpath(config.getAddTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getAddTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getAddBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getAddBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getAddClearBtn())).click();
	}

	@Test
	public void tc_subtract() {
		driver.get(url);
		driver.findElement(By.xpath(config.getSubtract())).click();
		driver.findElement(By.xpath(config.getSubtractTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getSubtractTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getSubtractBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getSubtractBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getSubtractBtn())).click();
	}

	@Test
	public void tc_subtractClear() {
		driver.get(url);
		driver.findElement(By.xpath(config.getSubtract())).click();
		driver.findElement(By.xpath(config.getSubtractTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getSubtractTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getSubtractBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getSubtractBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getSubtractClearBtn())).click();

	}

	@Test
	public void tc_multiply() {
		driver.get(url);
		driver.findElement(By.xpath(config.getMultiply())).click();
		driver.findElement(By.xpath(config.getMultiplyTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getMultiplyTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getMultiplyBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getMultiplyBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getMultiplyBtn())).click();
	}

	@Test
	public void tc_devide() {
		driver.get(url);
		driver.findElement(By.xpath(config.getDevide())).click();
		driver.findElement(By.xpath(config.getDevideTop1())).sendKeys(config.getN1());
		driver.findElement(By.xpath(config.getDevideTop2())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getDevideBottom1())).sendKeys(config.getN3());
		driver.findElement(By.xpath(config.getDevideBottom2())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getDevideBtn())).click();
	}

	@Test
	public void tc_converting() {
		driver.get(url);
		driver.findElement(By.xpath(config.getConverting())).click();
		driver.findElement(By.xpath(config.getConvertingTop())).sendKeys(config.getN2());
		driver.findElement(By.xpath(config.getConvertingBottom())).sendKeys(config.getN4());
		driver.findElement(By.xpath(config.getConvertingBtn())).click();
	}

	@Test
	public void tc_dropdown() {
		driver.get(url);
		WebElement element = driver.findElement(By.xpath(config.getDropdown()));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(config.getOption());
	}

	@Test
	public void tc_goBtn() {
		driver.get(url);
		driver.findElement(By.xpath(config.getGoBtn())).click();
	}

}
