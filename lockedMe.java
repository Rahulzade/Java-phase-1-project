package lockeMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lockedMe{
	
	private static boolean value;
	private static File f;

	void displayMenu() {
		
		System.out.println("choose the file operation you want to perform: ");
		System.out.println("1->list the file in directory:");
		System.out.println("2->add,delet or search:");
		System.out.println("3->Exit Program:");
	}
	
		public static void main(String[] args) {
			System.out.println("**&**lockedMe.com**&**");
			System.out.println("**&**Rahul Zade**&**");
			lockedMe a=new lockedMe();
			a.displayMenu();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter your choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			

			case 1:
				File filedir=new File("C:\\Users\\Rahul Zade\\OneDrive");
				if(filedir.isDirectory());{
					List<String> listFile = Arrays.asList(filedir.list());
					Collections.sort(listFile);
					for(String s: listFile) {
					System.out.println(s);
						
						
					}
				}
				
				break;
			case 2:
				System.out.println("1-> Add a File");
				System.out.println("2-> Delet a File");
				System.out.println("3-> Search a File");
				System.out.println("4-> Nevigate to Main Menu");
				System.out.println("Please Enter Your Choice");
				int ch1=sc.nextInt();
				
				
				switch(ch1) {
				
				case 1:
					System.out.println("Enter the file you want to add");
					String str =sc.next();
					File file =new File("C:\\Users\\Rahul Zade\\OneDrive");
					
					try {
						boolean valu=file.createNewFile();
						if (value) {
							System.out.println("new java file is created");
						}
							else {
								System.out.println("file is already exits");
							}
					}
							catch (Exception e) {
								e.getStackTrace();
							}
					break;
					
					
					
				case 2 : 
					System.out.println("  Enter The File Name You want to Delete ");
					String str2 = sc.next();
					
					File f =new File("C:\\Users\\Rahul Zade\\OneDrive");
					try {
						if(f.exists()) {
						
						if(f.delete()) {
							System.out.println("File Deleted : "+f.getName());
						}
						else {
							System.out.println("Failed");
						}
					}
						else {
							System.out.println("Incorrect File Name, File Doesn't Exists");
						}
					}
					catch(Exception e) {
						e.getMessage();
					}
					
					break;
					
					
				case 3 :
					System.out.println("  Enter The File Name You want to Search ");
					String str1 = sc.next();
					
					File f1=new File("C:\\Users\\Rahul Zade\\OneDrive");
					
					if (f1.exists()) {
						System.out.println("Found your file : "+f1);
					}
					else {
						System.out.println("file does not exists");
					}
					
					break;
					
				case 4 :
					a.displayMenu();
					break;
				}
				
				
			case 3: {    //exit program
                    System.out.println("Thank You for visting lockedme.com");
                    System.exit(0);
                }
                default: showPrimaryMenu();
            }
        }
	
		 static void showPrimaryMenu() {
			
		}
			
	}

						
			
					
				   