package com.Interface;
//java 8 allows you create a method with the body
//we can have default and static method
interface MyInterface{
	void m1();
	default void m2() {
		System.out.println("m2 method implementation");
	}
	static void m3() {
		System.out.println("m3 static method");
	}
}
class MyClass1 implements MyInterface{
	public void m1() {
		System.out.println("m1 interface abstract method");
	}
		
	
}
public class InterfaceNewFeaturesJava8 {

	public static void main(String[] args) {
		MyClass1 ob=new MyClass1();
		ob.m1();
		ob.m2();
		MyInterface.m3();
		

	}

}



