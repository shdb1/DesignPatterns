/**
 * 
 */
package com.shadab.designpatterns.structural.adapter;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author mshadab
 * 
 *The adapter pattern converts the interface of a class into another interface the clients expects.
 * This pattern mainly adapts one object to another one.
 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
 * 
 * If we look in JDK there are following implementations of Adapter design pattern
 *  1. java.util.Arrays#asList()
    2. java.io.InputStreamReader(InputStream) (returns a Reader)
    3. java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 *
 */
public class AdapterPatternTest {

	/**
	 * 
	 */
	public AdapterPatternTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Goind to start college task");
		College college = new College();
		Pen pen = new PenImpl();
		college.writeExams(pen);
		
	}
	
	

}


class College {
	
	public void writeExams(Pen pen) {
		
 		pen.write();
		System.out.println("Exam has written !!!");
	}
	
}

interface Pen{
	
	public void write();
}

class MarkerPen {
	
	public void write() {
		
		System.out.println("Writing with Marker pen");
	}
	
}

class PenImpl implements Pen{

	public void write() {
		// TODO Auto-generated method stub
		// exact Adapter Task
		MarkerPen markerPen = new MarkerPen();
		markerPen.write();
		
	}
	
	
}
