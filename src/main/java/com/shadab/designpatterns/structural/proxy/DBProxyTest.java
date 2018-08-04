package com.shadab.designpatterns.structural.proxy;

public class DBProxyTest {

	public DBProxyTest() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static void main(String[] args) {
		DBOperationsProxy dbOperationsProxyForAdmin = new DBOperationsProxy("testToken");
		DBOperationsProxy dbOperationsProxyForNonAdmin = new DBOperationsProxy("");
		dbOperationsProxyForAdmin.doDBOpeartions("delete table");
		dbOperationsProxyForNonAdmin.doDBOpeartions("delete table");
		dbOperationsProxyForNonAdmin.doDBOpeartions("select load of db");
	}

}
