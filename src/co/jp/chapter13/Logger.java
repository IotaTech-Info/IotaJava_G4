package co.jp.chapter13;

import java.util.logging.Logger;

public class Logger {


		public class text1 {
		    public static void main(String []args){
		        Logger logger = Logger.getLogger("text1");
		 
		        logger.severe("严重信息");
		        logger.warning("警示信息");
		        logger.info("info信息");
		 
		        logger.config("设定配置信息");
		        logger.fine("级别小的信息");
		        logger.finer("级别更小的信息");
		        logger.finest("级别最小的信息");
		    }
	}


