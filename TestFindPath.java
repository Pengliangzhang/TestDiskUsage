import java.io.File;
import java.util.Scanner;
/**
 * Write the class to find the file that in a certain folder
 * 
 * @author Pengliang Zhang
 * @version Jan 22
 */
public class TestFindPath {
	/**
	 * 
	 * @param root the root that the user wants to search
	 * @param filename the file name that user wants to search
	 * @return the path of the file
	 */
	public static File find(File root, String filename) {
		File[] files = root.listFiles();
		for (File file : files) {
			if (file.getName().equals(filename)) {
				System.out.println(file.getAbsoluteFile());
				return file.getAbsoluteFile();
			}
			if (file.listFiles() != null) {
				find(file.getAbsoluteFile(), filename);
			}
		}
		return root.getAbsoluteFile();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the root of the path folder"); // C:\\Users\\Owner\\Desktop\\Winter 2018\\SYSC2100\\Assignments\\Assignment-1\\SYSC2100
		String input1 = scanner.nextLine();
		System.out.println("Enter the file name to be found"); // ReferenceBasedQueue.txt Trees.txt
		String input2 = scanner.nextLine();
		scanner.close();
		find(new File(input1), input2);

	}

}
