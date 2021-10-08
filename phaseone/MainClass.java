package com.phaseone;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		System.out.println("=====WELCOME TO LOCKEDME.COM===== \n \n# Manoranjan parida \n* manoranjan722@gmail.com \n*+919051127141 \n................................. \n");
		
		Scanner sc = new Scanner(System.in);
		char choice = 'z';
		System.out.println("1. Save a file. \n2. Delete a file. \n3. Search for a file in current directory. \n4. List of files in ascending order from current directory. \n5. List of files in descending order from current directory. \nQ. Exit from program");
		FileOps obj1 = new FileOps();
		SearchOps obj2 = new SearchOps();
		SortOps obj3 = new SortOps();
		while(choice!='Q') {
			System.out.println("\nEnter your choice: ");
			choice = sc.next().charAt(0);	
			if (choice == '1'){
					System.out.println("Enter full file path: ");
					sc.nextLine();
					String path = sc.nextLine();
					obj1.saveFile(path, " ");
			}
			else if (choice == '2'){
				System.out.println("Enter full file path: ");
				sc.nextLine();
				String path = sc.nextLine();
				obj1.deleteFile(path);
		    }
			else if (choice == '3'){
				System.out.println("Enter directory path: ");
				sc.nextLine();
				String path = sc.nextLine();
				System.out.println("Enter file name to be searched: ");
				String fname = sc.nextLine();
				obj2.fileSearch(path, fname);
		    }
			else if (choice == '4'){
				System.out.println("Enter directory path: ");
				sc.nextLine();
				String path = sc.nextLine();
				System.out.println("The file names in ascending order are : ");
				obj3.ascendingSort(path);
		    }
			else if (choice == '5'){
				System.out.println("Enter directory path: ");
				sc.nextLine();
				String path = sc.nextLine();
				System.out.println("The file names in descending order are : ");
				obj3.descendingSort(path);
		    }
		}
	}
}

