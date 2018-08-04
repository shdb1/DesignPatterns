package com.shadab.designpatterns.structural.proxy;

public class DBOperationsProxy implements DBOperations{

	boolean isServerAdmin=false;
	DBOperations dbOperations=null;
	public DBOperationsProxy(String authenticationToken) {
		// TODO Auto-generated constructor stub
		if("testToken".equals(authenticationToken))
			isServerAdmin=true;
		dbOperations = new DBOperationsImpl();
			
	}

	public void doDBOpeartions(String operationName) {
		// TODO Auto-generated method stub
		if(isServerAdmin)
			dbOperations.doDBOpeartions(operationName);
		else {
			if(operationName.contains("delete"))
				System.out.println("Since you are not admin , You cant perform delet operation");
			else
				dbOperations.doDBOpeartions(operationName);
				
		}
		
	}

}
