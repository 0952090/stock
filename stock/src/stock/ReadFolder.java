package stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFolder {
	public static void readFolder(ArrayList<String> fileList) throws IOException {
		File f = new File("data");
		if (f.isDirectory()) {

			String[] s = f.list();

			for (int i = 0; i < s.length; i++) {

				fileList.add(s[i]);
			}
		}
	}
}
