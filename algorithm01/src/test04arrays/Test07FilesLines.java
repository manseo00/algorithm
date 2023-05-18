package test04arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test07FilesLines {

	public static void main(String[] args) throws IOException {

		String file_path ="C:\\Users\\JuHwa\\git\\algorithm\\algorithm01\\src\\test04arrays\\test.txt";
		FileReader reader = new FileReader(file_path);
		
		// 한 글자씩 출력
		int ch;
		while((ch = reader.read()) != -1) {
			System.out.print((char)ch);
		}
		
		System.out.println("\n====================");
		
		reader = new FileReader(file_path);
		// 한 줄씩 출력
		BufferedReader br = new BufferedReader(reader);
		
		String str = "";
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		reader.close();
		System.out.println("====================");
		
		Files.lines(Paths.get(file_path), Charset.forName("UTF-8")).forEach(System.out::println);;
		
	}

}
