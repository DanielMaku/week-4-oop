package ie.atu.wwek4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp
{
  public static void main( String[] args )
  {
      int count = 0 ;
      Scanner sc = new Scanner(System.in);
      ArrayList<Student> studentsList = new ArrayList<Student>();

       System.out.println("Enter number of students");
       int Totals = sc.nextInt();
       count = sc.nextInt();


       // makes it count up to the amount of students put in
       while(count < Totals)
       {

           // asking for details
           System.out.println("Enter name");
           String name = sc.nextLine();

           System.out.println("Enter email");
           String email = sc.nextLine();

           String email = sc.next();
           boolean containsEmail = false;

           for(Student student : studentsList){
           if(student.getEmail().equals(email)){
               containsEmail = true;
               break;
           }
       }

           if(containsEmail){
               System.out.println("There is already a student with that email");
           }
           else{
           System.out.println("Enter student ID");
           String studentId = sc.nextLine();

           Student student1 = new Student();

           student1.setName(name);
           student1.setEmail(email);
           student1.setStudentId(studentId);
               studentsList.add(student1);
               count++;
           }
       }

      for(Student student : studentsList) {
          System.out.println(student);
      }

       }
  }
