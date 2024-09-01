import java.util.Scanner;

public class task2 {
  public static void main(String[] args) {
    System.out.println("\n------REPRESENTING STUDENT GRADE CALCULATOR--------\n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of student : ");
    String name = sc.next();
    System.out.println("Enter the no of subjects :  ");
    int numsub = sc.nextInt();
    int[] marks = new int[numsub];
    int totalmarks = 0;
    boolean hasFailed = false;
    for (int i = 0; i < numsub; i++) {
      System.out.println("Enter marks of " + (i + 1) + " subject : ");
      marks[i] = sc.nextInt();
      if (marks[i]<33){
        hasFailed=true;
      }
      totalmarks = totalmarks + marks[i];
    }
    float percentage = (float) totalmarks / numsub;
    System.out.println("\n-------DISPLAYING RESULT OF " + name + " --------\n ");
    System.out.println("Name of student is " + name);
    System.out.println("Total marks of " + name + " is " + totalmarks);
    System.out.println("Percentage of " + name + " is " + percentage);
    if (hasFailed){
    System.out.println("Fail");
    }
    else{
      if (percentage >= 90) {
        System.out.println("Grade is A");
      } else if (percentage >= 80) {
        System.out.println("Grade is B");
      } else if (percentage >=70) {
        System.out.println("Grade is C");
      } else if (percentage >=60) {
        System.out.println("Grade is D");
      } else if (percentage >=50) {
        System.out.println("Grade is E");
      } else {
        System.out.println("Grade is F");
      }
    }

  }
}