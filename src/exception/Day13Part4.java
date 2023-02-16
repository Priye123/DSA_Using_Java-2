package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {

	void readFile() throws Exception {
		FileInputStream fis = new FileInputStream("d.txt");
		System.out.println(3 / 0);
	}

	void saveFile() throws FileNotFoundException {
		FileOutputStream f = new FileOutputStream("d.txt");
	}

}

public class Day13Part4 {

	public static void main(String[] args) {
		ReadAndWrite r = new ReadAndWrite();

		try {
			r.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			r.saveFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

//void readFile() {
//	try {
//		FileInputStream fis = new FileInputStream("d.txt");
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
//void saveFile() {
//	try {
//		FileOutputStream f = new FileOutputStream("d.txt");
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}
//}
