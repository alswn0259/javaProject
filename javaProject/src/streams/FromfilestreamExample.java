package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromfilestreamExample {
	public static void main(String[] args) {
		Path path = Paths.get("list.txt");
		try {
			Stream<String> stream = Files.lines(path); //소스쓰고 반납하는 것들은 예외처리 반드시! 라인별로 읽어와서 출력해주는 것!
			stream.forEach(file -> System.out.println(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Stream<Path> stream;
		try {
			stream = Files.list(Paths.get("c:/Program Files"));
			stream.forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
