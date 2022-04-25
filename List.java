import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++)list.add(input.nextDouble());
		
		System.out.print("The sum of the 5 numbers = " + sum(list));
		
		
	}
	private static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (double i : list) {
			sum+=i;
			
		}
		return sum;
	}
	
            
           
           
     
	
             
		
		
	



	
		}