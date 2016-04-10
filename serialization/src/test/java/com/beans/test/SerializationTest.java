package com.beans.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.beans.Employee;

public class SerializationTest {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream out = null;
		Employee emp = new Employee("Jyoti", 10341);
		try {
			// serialize to a file
			FileOutputStream fileOutputStream = new FileOutputStream("Emp.txt");
			out = new ObjectOutputStream(fileOutputStream);
			
			out.writeObject(emp);
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception....");
		} catch (Exception e) {
			System.out.println("Other than IO exception encountered");
		}
		finally{
			System.out.println("finally of outer try executes");
			try{
				if(out != null){
					out.close();
				}
			}
			catch(Exception e){
				System.out.println("catch inside finally executes");
			}
			finally{
				System.out.println("finally inside finally executes");
				out.close();
			}
		}
	}

}
