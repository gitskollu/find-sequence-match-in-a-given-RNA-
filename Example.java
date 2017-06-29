/* Program to find the count of hairpin loop structures in a given RNA structure
  Author : Shanthi KOllu
*/
import java.util.*;
public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// read the input from the keyboard
		Scanner input = new Scanner(System.in);
		int length;
		 System.out.println("Enter the range of the sequence");
		 
		 length = input.nextInt();
		 
		 int []myValues = new int[length];
		 
		 int count =0;
		 
		 System.out.println("Enter the RNA sequence");
		 
		 //reading the input values to the array
		 for(int i=0; i<length; i++)
		 {
			 myValues[i] = input.nextInt();
			// System.out.println(myValues[i]);
				 
		 }
		 
		 input.close();
		 int value, q, j;
		 
		 System.out.println("Beg, End");
		 System.out.println("---------------");
		 
		 //check the hairpin loop sequence i.e +X consecutive zeros -X (+X0000...-X)
		 for(int i=0; i<length; i++)
		 {
	
			 if(myValues[i]>0){
				 {
					 if(i<length)
					 {
						 if(myValues[i+1]==0){
								
				  value = myValues[i];
				   j =i;
				 //System.out.print(i);
				 i++;
				 
			 while(i<length && myValues[i]==0){
				 i++;
				 
			 }
			 q = myValues[i];
			 
			 
			 if(value==-q){
				 count++;
				 
				 System.out.println(j + " "+ i);
				 
			 }
				
				 }
			 } 
			 }
		 }
		 } 
		 
		 System.out.print("Sequence match count: ");
		 System.out.println(count);
	
		 }
	
	
	}
	


