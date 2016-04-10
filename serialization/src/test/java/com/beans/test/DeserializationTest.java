package com.beans.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.beans.Employee;

public class DeserializationTest {

	public static void main(String[] args) {

		ObjectInputStream objectInputStream = null;
		// read from Emp.txt
		try {
			FileInputStream fileInputStream = new FileInputStream("Emp.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			Employee emp = (Employee) objectInputStream.readObject();

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
