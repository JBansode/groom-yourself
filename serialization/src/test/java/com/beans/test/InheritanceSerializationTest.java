package com.beans.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.beans.Address;
import com.beans.Employee;
import com.beans.EmployeeAddress;
import com.beans.PermanantEmployee;

public class InheritanceSerializationTest {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream out = null;
		
		PermanantEmployee permanantEmployee = new PermanantEmployee("P");
		
		try {
			// serialize to a file
			FileOutputStream fileOutputStream = new FileOutputStream("Inheritance.txt");
			out = new ObjectOutputStream(fileOutputStream);
			
			out.writeObject(permanantEmployee);
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception....");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Other than IO exception encountered");
			e.printStackTrace();
		}
		finally{
			System.out.println("finally of outer try executes");
			try{
				if(out != null){
					System.out.println("connection closed... try inside finally");
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
