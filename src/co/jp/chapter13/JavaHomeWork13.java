package co.jp.chapter13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class JavaHomeWork13 {


	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("text");
        logger.severe("severe");
		logger.warning("warning");
        logger.info("info");
		logger.config("CONFIG");
		logger.fine("ignored.");

		try {
			File csv = new File("");
			BufferedWriter br = new BufferedWriter(new FileWriter(csv));
			br.newLine();
			br.write("data");
			br.flush();
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
