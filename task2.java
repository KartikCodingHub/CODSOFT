import java.util.Scanner;

public class task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of student ");
    String name = sc.next();
    System.out.println("Enter marks of " + name + " out of 100");
    System.out.println("\nEnter the marks for first subject");
    int sub1 = sc.nextInt();
    System.out.println("Marks in first subject - " + sub1);
    System.out.println("Enter the marks for second subject");
    int sub2 = sc.nextInt();
    System.out.println("Marks in second subject - " + sub2);
    System.out.println("Enter the marks for third subject");
    int sub3 = sc.nextInt();
    System.out.println("Marks in third subject - " + sub3);
    System.out.println("Enter the marks for fourth subject");
    int sub4 = sc.nextInt();
    System.out.println("Marks in fourth subject - " + sub4);
    System.out.println("Enter the marks for fifth subject");
    int sub5 = sc.nextInt();
    System.out.println("Marks in fifth subject - " + sub5);
    int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
    float percentage = (float) totalmarks / 5;
    System.out.println("\nDISPLAYING RESULT OF STUDENT\n");
    System.out.println("Name of student is " + name);
    System.out.println("Total marks of " + name + " is " + totalmarks);
    System.out.println("Percentage of " + name + " is " + percentage);
    if (sub1 > 33 && sub2 > 33 && sub3 > 33 && sub4 > 33 && sub5 > 33) {
      if (percentage > 70) {
        System.out.println("Grade is A");
      } else if (percentage > 45) {
        System.out.println("Grade is B");
      } else {
        System.out.println("Grade is C");
      }
    }else{
      System.out.println("Fail");
    }

  }
}