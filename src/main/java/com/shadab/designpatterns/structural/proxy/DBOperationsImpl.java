package com.shadab.designpatterns.structural.proxy;

public class DBOperationsImpl implements DBOperations{

	public DBOperationsImpl() {
		// TODO Auto-generated constructor stub
	}

	public void doDBOpeartions(String oparationName) {
		// TODO Auto-generated method stub
		
		System.out.println("Opeartion "+oparationName+"  Done");
		
	}

}
