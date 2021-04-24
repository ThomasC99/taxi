package main;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
class Testing {
	public static void main (String [] args) throws Exception {
		Random random = new Random (0);
		File file = new File ("testing.txt");
		file.delete();
		file.createNewFile();
		FileWriter writer = new FileWriter (file);
		for (byte i = 0; i < Byte.MAX_VALUE; i++) {
			writer.write((random.nextInt(4) + 1) + "\n");
		}
		writer.close();
	}
}