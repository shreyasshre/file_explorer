package full_stack_assessment;
import java.util.*;

public class file_tracer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int main_option;
		char sub_option;
		String file_path;
		
		
		System.out.println("A MENU BASED FILE EXPLORER BY SHREYAS");
		
		for(;;) 
		{
			
			System.out.println("Please select below options for the corresponding operations \n");
			System.out.println("Option 1 : Retrieve all the files from a directory");
			System.out.println("Option 2 : Display additional file operations");
			System.out.println("Option 3 : Close the application \n");
			
			main_option=s.nextInt();
			
			switch (main_option) {
			case 1: {
			System.out.println("Enter the folder path u wish to retrieve all the files");
			
			}break;
			case 2:{
				System.out.println("Below are the additional file operations, please select the option to proceed");
				System.out.println("Option A : Add a file the the current directory");
				System.out.println("Option B : Delete a specified file (case sensitive)");
				System.out.println("Option C : Search a specified file from current directory");
				System.out.println("Option D : Switch to main menu");
				
				sub_option = s.next().charAt(0);
				
				switch (sub_option) {
				case 'A': {
				System.out.println("adding a file to directory");
				}break;
				case 'B': {
					System.out.println("deleting a file");
				}break;
				case 'C': {
					System.out.println("searching for a file");
				}break;
				case 'D': {
					System.out.println("navigating to main menu");
					
				}break;
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + sub_option);
				}
			}break;
			case 3:{
				System.out.println("Your application is closed");
				
			}break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + main_option);
			}
			
		}
		
		
		
		

	}

}
