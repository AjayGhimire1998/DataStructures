package cognizantTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GifName {

	public static void main(String[] args) {

		String filename;
//		filename = scan.nextLine();
		Path filePath = Paths.get("record_logs.txt");

		try {
			List<String> lines = Files.readAllLines(filePath);
			String[] logs = lines.toArray(new String[0]);

			for (int i = 0; i < logs.length; i++) {
				String log = logs[i];
				String[] parts = log.split(" ");

				if (Arrays.asList(parts).contains("200")) {
					if (parts[6].contains("/")) {
						String[] ignoreSlash = parts[6].split("/");
						System.out.println(ignoreSlash[ignoreSlash.length - 1]);
					} else {
						System.out.println(parts[6]);
					}
				}
			}
			// Print the logs array
			System.out.println(Arrays.toString(logs));
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
		}

	}

}
