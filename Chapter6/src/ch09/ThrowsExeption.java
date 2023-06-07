package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExeption test = new ThrowsExeption();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch( Exception e) {	// 최상위(default) Exception. 최상위 이지만, 마지막에 사용해야 한다. 이러한 이유는 최상위이기 때문에 이후 exception에 넘어가지 않는다.
			
		}
		
		System.out.println("end");
		
	}

}
