package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

@RestController
public class DocumentController {

	@Autowired
	ApplicationContext springFactory;

	DocumentService ds;

	@GetMapping("print/{type}")
	String printInvoice(@PathVariable String type) {
		
		if(type.equalsIgnoreCase("pdf"))
		
         		     //Object o=new PdfServiceImpl
	ds =(PdfServiceImpl) springFactory.getBean("pdfServiceImpl");
//		DocumentService ds = (PdfServiceImpl) Factory.getObject(type);
		
		if(type.equalsIgnoreCase("excel"))
				ds=(ExcelServiceImpl) springFactory.getBean("excelServiceImpl");

		 return   ds.printData();
				
	}

}

class Factory {

	public static Object getObject(String type) {
		if (type.equals("pdf"))
			return new PdfServiceImpl();

		if (type.equals("excel"))
			return new ExcelServiceImpl();

		return null;
	}

}
