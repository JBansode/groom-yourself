package com.beans.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.beans.Address;
import com.beans.Employee;
import com.beans.EmployeeAddress;

public class EmployeeAddrSerializationTest {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream out = null;
		
		Address adr = new Address("Pune");
		EmployeeAddress emp = new EmployeeAddress("Jyoti", 10341,adr);
		try {
			// serialize to a file
			FileOutputStream fileOutputStream = new FileOutputStream("EmpAddr.txt");
			out = new ObjectOutputStream(fileOutputStream);
			
			out.writeObject(emp);
			

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
