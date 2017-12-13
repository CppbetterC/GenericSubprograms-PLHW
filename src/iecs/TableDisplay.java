package iecs;

import java.util.Scanner;

public class TableDisplay {
	
	static Scanner scanner = new Scanner(System.in);
	
	// Let user to choose which method do user want to use.
	public static void sortingAndShow(NNEntity list) {
		System.out.println("1. bubbleSorting : ");
		System.out.println("2. quickSorting : ");
		
		int searchType = scanner.nextInt();
		boolean flag;

		if (searchType == 1) {
			NNEntity xlist = list.bubbleSorting();
			xlist.showData();
		}
		else if (searchType == 2) {
			NNEntity xlist = list.quickSorting();
			xlist.showData();
		}
		else {
			
		}
	}
	public static void searchingAndShow(NNEntity list) {
		System.out.println("1. sequentialSearching : ");
		System.out.println("2. binarySearching : ");
		
		int searchType = scanner.nextInt();
		boolean flag;

		if (searchType == 1) {
			flag = list.sequentialSearching();
			if (flag) {
				System.out.println("Found");
			}
			else {
				System.out.print("Not Found");
			}
		}
		else if (searchType == 2) {
			flag = list.binarySearching();
			if (flag) {
				System.out.println("Found");
			}
			else {
				System.out.print("Not Found");
			}
		}
		else {
			
		}
	}
}
