package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl implements DocumentService {

	@Override
	public void readDataFromDb() {
		// TODO Auto-generated method stub
		System.out.println("Read data from Db");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for Pdf");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print data for Pdf");
		return "Pdf";
	}

}
