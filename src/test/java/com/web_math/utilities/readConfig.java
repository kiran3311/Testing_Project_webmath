package com.web_math.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	Properties propreties;
	String path = "C:\\Users\\Lenovo\\eclipse-workspace\\Excelr project\\web_math\\configuration\\config.properties";

	public readConfig() {
		try {
			propreties = new Properties();

			FileInputStream fis = new FileInputStream(path);
			propreties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getUrl() {
		String url = propreties.getProperty("url");
		return url;
	}

// Numbers------>

	// Factor

	public String getFactor() {

		String factor = propreties.getProperty("factor");
		return factor;
	}

	public String getFactorInput() {

		String factorInput = propreties.getProperty("factorInput");
		return factorInput;
	}

	public String getFactorBtn() {

		String factorBtn = propreties.getProperty("factorBtn");
		return factorBtn;
	}

	// GCF

	public String getGcf() {

		String gcf = propreties.getProperty("gcf");
		return gcf;
	}

	public String getGcfInput() {

		String gcfInput = propreties.getProperty("gcfInput");
		return gcfInput;
	}

	public String getGcfBtn() {

		String gcfBtn = propreties.getProperty("gcfBtn");
		return gcfBtn;
	}

	// LCM

	public String getLcm() {

		String lcm = propreties.getProperty("lcm");
		return lcm;
	}

	public String getLcmInput() {

		String lcmInput = propreties.getProperty("lcmInput");
		return lcmInput;
	}

	public String getLcmBtn() {

		String lcmBtn = propreties.getProperty("lcmBtn");
		return lcmBtn;
	}

	// Pronounce

	public String getPronounce() {

		String pronounce = propreties.getProperty("pronounce");
		return pronounce;
	}

	public String getPronounInput() {

		String pronounInput = propreties.getProperty("pronounInput");
		return pronounInput;
	}

	public String getPronounBtn() {

		String pronounBtn = propreties.getProperty("pronounBtn");
		return pronounBtn;
	}

// Decimals-------->

	// fractionToDecimal
	public String getFractionToDecimal() {

		String fractionToDecimal = propreties.getProperty("fractionToDecimal");
		return fractionToDecimal;
	}

	public String getFtdTop() {

		String ftdTop = propreties.getProperty("ftdTop");
		return ftdTop;
	}

	public String getFtdBottom() {

		String ftdBottom = propreties.getProperty("ftdBottom");
		return ftdBottom;
	}

	public String getFtdBtn() {

		String ftdBtn = propreties.getProperty("ftdBtn");
		return ftdBtn;
	}

	// decimalToFraction

	public String getDecimalToFraction() {

		String decimalToFraction = propreties.getProperty("decimalToFraction");
		return decimalToFraction;
	}

	public String getDtfInput() {

		String dtfInput = propreties.getProperty("dtfInput");
		return dtfInput;
	}

	public String getDtfBtn() {

		String dtfBtn = propreties.getProperty("dtfBtn");
		return dtfBtn;
	}

// Number Crunching -------->

	// numbersonly
	public String getNumbersonly() {

		String numbersonly = propreties.getProperty("numbersonly");
		return numbersonly;
	}

	public String getNumbersonlyinput() {

		String numbersonlyinput = propreties.getProperty("numbersonlyinput");
		return numbersonlyinput;
	}

	public String getNumbersonlyBtn() {

		String numbersonlyBtn = propreties.getProperty("numbersonlyBtn");
		return numbersonlyBtn;
	}

	public String getNumbersonlyData() {

		String numbersonlyData = propreties.getProperty("numbersonlyData");
		return numbersonlyData;
	}

	// withVariablesToo

	public String getWithVariablesToo() {

		String withVariablesToo = propreties.getProperty("withVariablesToo");
		return withVariablesToo;
	}

	public String getWithVariablesTooInput() {

		String withVariablesTooInput = propreties.getProperty("withVariablesTooInput");
		return withVariablesTooInput;
	}

	public String getInputOfa() {

		String inputOfa = propreties.getProperty("inputOfa");
		return inputOfa;
	}

	public String getA() {

		String a = propreties.getProperty("a");
		return a;
	}

	public String getVariableExpression() {

		String variableExpression = propreties.getProperty("variableExpression");
		return variableExpression;
	}

	public String getWithVariablesTooBtn() {

		String withVariablesTooBtn = propreties.getProperty("withVariablesTooBtn");
		return withVariablesTooBtn;
	}

// Fraction ---------->

	// reduce
	public String getReduce() {

		String reduce = propreties.getProperty("reduce");
		return reduce;
	}

	public String getReduceTop() {

		String reduceTop = propreties.getProperty("reduceTop");
		return reduceTop;
	}

	public String getReduceBottom() {

		String reduceBottom = propreties.getProperty("reduceBottom");
		return reduceBottom;
	}

	public String getReduceBtn() {

		String reduceBtn = propreties.getProperty("reduceBtn");
		return reduceBtn;
	}

	// Add

	public String getAdd() {

		String add = propreties.getProperty("add");
		return add;
	}

	public String getAddTop1() {

		String addTop1 = propreties.getProperty("addTop1");
		return addTop1;
	}

	public String getAddBottom1() {

		String addBottom1 = propreties.getProperty("addBottom1");
		return addBottom1;
	}

	public String getAddTop2() {

		String addTop2 = propreties.getProperty("addTop2");
		return addTop2;
	}

	public String getAddBottom2() {

		String addBottom2 = propreties.getProperty("addBottom2");
		return addBottom2;
	}

	public String getAddBtn() {

		String addBtn = propreties.getProperty("addBtn");
		return addBtn;
	}

	public String getAddClearBtn() {

		String addClearBtn = propreties.getProperty("addClearBtn");
		return addClearBtn;
	}

	// Subtract

	public String getSubtract() {

		String subtract = propreties.getProperty("subtract");
		return subtract;
	}

	public String getSubtractTop1() {

		String subtractTop1 = propreties.getProperty("subtractTop1");
		return subtractTop1;
	}

	public String getSubtractBottom1() {

		String subtractBottom1 = propreties.getProperty("subtractBottom1");
		return subtractBottom1;
	}

	public String getSubtractTop2() {

		String subtractTop2 = propreties.getProperty("subtractTop2");
		return subtractTop2;
	}

	public String getSubtractBottom2() {

		String subtractBottom2 = propreties.getProperty("subtractBottom2");
		return subtractBottom2;
	}

	public String getSubtractBtn() {

		String subtractBtn = propreties.getProperty("subtractBtn");
		return subtractBtn;
	}

	public String getSubtractClearBtn() {

		String subtractClearBtn = propreties.getProperty("subtractClearBtn");
		return subtractClearBtn;
	}

	// multiply

	public String getMultiply() {

		String multiply = propreties.getProperty("multiply");
		return multiply;
	}

	public String getMultiplyTop1() {

		String multiplyTop1 = propreties.getProperty("multiplyTop1");
		return multiplyTop1;
	}

	public String getMultiplyTop2() {

		String multiplyTop2 = propreties.getProperty("multiplyTop2");
		return multiplyTop2;
	}

	public String getMultiplyBottom1() {

		String multiplyBottom1 = propreties.getProperty("multiplyBottom1");
		return multiplyBottom1;
	}

	public String getMultiplyBottom2() {

		String multiplyBottom2 = propreties.getProperty("multiplyBottom2");
		return multiplyBottom2;
	}

	public String getMultiplyBtn() {

		String multiplyBtn = propreties.getProperty("multiplyBtn");
		return multiplyBtn;
	}

	// Devide

	public String getDevide() {

		String devide = propreties.getProperty("devide");
		return devide;
	}

	public String getDevideTop1() {

		String devideTop1 = propreties.getProperty("devideTop1");
		return devideTop1;
	}

	public String getDevideTop2() {

		String devideTop2 = propreties.getProperty("devideTop2");
		return devideTop2;
	}

	public String getDevideBottom1() {

		String devideBottom1 = propreties.getProperty("devideBottom1");
		return devideBottom1;
	}

	public String getDevideBottom2() {

		String devideBottom2 = propreties.getProperty("devideBottom2");
		return devideBottom2;
	}

	public String getDevideBtn() {

		String devideBtn = propreties.getProperty("devideBtn");
		return devideBtn;
	}

	// Converting

	public String getConverting() {

		String converting = propreties.getProperty("converting");
		return converting;
	}

	public String getConvertingTop() {

		String convertingTop = propreties.getProperty("convertingTop");
		return convertingTop;
	}

	public String getConvertingBottom() {

		String convertingBottom = propreties.getProperty("convertingBottom");
		return convertingBottom;
	}

	public String getConvertingBtn() {

		String convertingBtn = propreties.getProperty("convertingBtn");
		return convertingBtn;
	}

// Inputs	

	public String getNos() {

		String nos = propreties.getProperty("nos");
		return nos;
	}

	public String getDecimalNo() {

		String decimalNo = propreties.getProperty("decimalNo");
		return decimalNo;
	}

	public String getN1() {

		String n1 = propreties.getProperty("n1");
		return n1;
	}

	public String getN2() {

		String n2 = propreties.getProperty("n2");
		return n2;
	}

	public String getN3() {

		String n3 = propreties.getProperty("n3");
		return n3;
	}

	public String getN4() {

		String n4 = propreties.getProperty("n4");
		return n4;
	}

	public String getPower() {

		String power = propreties.getProperty("power");
		return power;
	}

	public String getDropdown() {

		String dropdown = propreties.getProperty("dropdown");
		return dropdown;
	}

	public String getOption() {

		String option = propreties.getProperty("option");
		return option;
	}

	public String getGoBtn() {

		String goBtn = propreties.getProperty("goBtn");
		return goBtn;
	}

}
