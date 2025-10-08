package ie.atu;

import java.util.Scanner;

public class


public class studentApp
{
  public static void main( String[] args )
  {
      int count = 0 ;
      Scanner sc = new Scanner(System.in);

       System.out.println("Enter number of students");
       count = sc.nextInt();

       while(count <=3) {

           // asking for details
           System.out.println("Enter name");
           String name = sc.nextLine();

           System.out.println("Enter email");
           String email = sc.nextLine();

           System.out.println("Enter student ID");
           String studentId = sc.nextLine();


           // creating a student that has no details

           Student student1 = new Student();
       }
  }
}
