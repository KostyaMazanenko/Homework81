package com.gmail.kostamazanenko;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Database {
	private File file = new File("Database");

	public Database() {
		super();
		file.mkdir();
	}
	
	public void writeObject(Object obj, String fileName) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Database/" + fileName + ".dat"))){
			oos.writeObject(obj);
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
	
	public Object readObject(String fileName) {
		Object obj = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Database/" + fileName + ".dat"))){
			obj = ois.readObject();
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
