package methods;

public class VarArgs {
	
	
	
	//Java also allows you to pass variable number of values to an argument of a method. This is useful when you do not know the exact number of values to be passed to an argument.

		
		//This method will calculate percentage
		// method will calculate total marks and will display the information
		static void display(int rollNumber,String name, double ...marks) {
		 System.out.println("Student Information");
		 System.out.println("Name : "+name);
		 System.out.println("Roll Number : "+rollNumber);
		 double totalMarks=0.0;
		
		 for (double num : marks) {
			totalMarks =totalMarks+num;
			
		}
		
		 //percentage calculation
		 double percentage = (totalMarks/marks.length);
		 System.out.println("Percentage : "+percentage);
	}

		public static void main(String[] args) {
			//method will call display
			display(24,"Jack",56,80,75);
			System.out.println();
			display(45, "Ron", 78,90,45);
		}
	}



