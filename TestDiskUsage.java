package assignment1;

import java.io.File;
/**
 *Write the class to calculate the usage a the disk that in a certain path
 *
 *@author Pengliang Zhang
 *@version Jan 22, 2018
 */

public class TestDiskUsage {
	/**
	 * 
	 * @param root the root path that the user wants to calculate
	 * @return usage of the disk
	 */
	public static long diskUsage(File root) {
		long rootLength = root.length();

		if (root.isDirectory()) {
			File[] files = root.listFiles();
			for (File file : files) {
				rootLength = rootLength + diskUsage(file);
			}
		}
		System.out.println(rootLength + "\t" + root.getPath());
		return rootLength;
	}

	public static void main(String[] args) {
		String start = "C:\\Users\\Owner\\Desktop\\Winter 2018\\SYSC 2100\\Assignments\\Assignment-1\\SYSC2100";
		diskUsage(new File(start));
	}

}
