package com.demo.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileInputOutput {
   
	 static void loadAccountsFromFile() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FileDemo.txt"))) {
	            TestMain.accounts = (ArrayList<Account>) ois.readObject();
	        } catch (FileNotFoundException e) {
	            // Initial run, no file found. Ignore this exception.
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    static void saveAccountsToFile() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FileDemo.txt"))) {
	            oos.writeObject(TestMain.accounts);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
