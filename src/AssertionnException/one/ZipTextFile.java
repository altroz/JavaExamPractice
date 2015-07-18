package AssertionnException.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class ZipTextFile {
	public static final int CHUNCK = 1024;

	// TO HELP COPY CHUNK OF 1KB

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out
					.println("Pass the name of the file in the current directory to be zipped as an arguement");
			System.exit(-1);
		}
		String fileName = args[0];
		// name of the zipfile is the input file name with the suffix " . zip"
		String zipFileName = fileName + ".zip";
		byte[] buffer = new byte[CHUNCK];
		// these constructors can throw FileNotFoundException

		try (ZipOutputStream zipFile = new ZipOutputStream(
				new FileOutputStream(zipFileName));
				FileInputStream fileIn = new FileInputStream(fileName)) {
			int lenRead = 0;
			while ((lenRead = fileIn.read(buffer)) > 0) {
				zipFile.write(buffer, 0, lenRead);
			}
		} catch (Exception e) {
			System.out.println("The caught exception is " + e);
			System.out.println("The suppressed exception are: ");
			for (Throwable suppressed : e.getSuppressed())
				System.out.println(suppressed);
		}
	}
}
