package assignment1;

import java.util.Scanner;
/**
 * Write the class to solve the Hanoi of tower problem
 * @author Pengliang Zhang
 * @version Jan 22, 2018
 */
public class TestTowersofHanoi {
	/**
	 * 
	 * @param n number of disk the player wants use
	 * @param source the tower that initially put the disks
	 * @param destination the tower that finally put the disks
	 * @param spare another tower that put the disks
	 * @param instructionNumber the step number
	 * @return the number of step
	 */

	public static int solveTowers(int n, char source, char destination, char spare, int instructionNumber) {

		if ((n == 1)) {
			System.out.println(instructionNumber + ". Move disk 1 from " + source + " to " + destination);
			return ++instructionNumber;
		} else {
			instructionNumber = solveTowers(n - 1, source,spare , destination,instructionNumber );
			
			System.out.println(instructionNumber + ". Move disk " + n +  " from " + source + " to " + destination);
			
			return solveTowers(n - 1, spare, destination, source,++instructionNumber);
			
		}
		
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of disk: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the source post character: ");
		char origin = scanner.next().charAt(0);

		System.out.println("Enter the destination post character: ");
		char destination = scanner.next().charAt(0);

		System.out.println("Enter another post character: ");
		char another = scanner.next().charAt(0);
		
		scanner.close();
		solveTowers(n, origin, destination, another, 1);

	}

}
