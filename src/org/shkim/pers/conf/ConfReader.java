package org.shkim.pers.conf;

public class ConfReader {
	private static String root_dir = COMMON.ROOT_DIR;
	private static String conf_dir = root_dir + "/conf";
	
	public static void main(String[] args) {
		System.out.println(conf_dir);
	}
	
}
