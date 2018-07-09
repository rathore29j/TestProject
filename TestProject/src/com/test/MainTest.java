package com.test;

public class MainTest {

	public static void main(String[] args) {
	
		System.out.println("Ritesh Test ");
		Employee emp = new Employee();
		emp.setId("1");
		emp.setName("Ritesh");
		emp.setCity("Indore");
		
		System.out.println(emp.getId()+":"+emp.getName()+":"+emp.getCity());

	}

}
