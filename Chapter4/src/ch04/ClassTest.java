package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, 
	NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		
		/* TODO Exception in thread "main" java.lang.NoSuchMethodException: ch04.Person.<init>(java.lang.String)
		at java.base/java.lang.Class.getConstructor0(Class.java:3585)
		at java.base/java.lang.Class.getConstructor(Class.java:2271)
		at ch04.ClassTest.main(ClassTest.java:23) 
		에러 내용 확인 후 수정할것 	*/		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
//		Person kim2 = new Person("kim");
	}

}
