package com.beans.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.beans.Employee;
import com.beans.PermanantEmployee;

public class InheritanceDeserializationTest {

	public static void main(String[] args) {

		ObjectInputStream objectInputStream = null;
		// read from Emp.txt
		try {
			FileInputStream fileInputStream = new FileInputStream("Inheritance.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			PermanantEmployee emp = (PermanantEmployee) objectInputStream.readObject();

			System.out.println("type : "+emp.getType());
			System.out.println("Emp name : " + emp.getEmpNo());
			System.out.println("Emp id : " + emp.getEmpId());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
