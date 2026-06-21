import java.util.*;
public class Student {
 
      private int  id;
      private int rollno;
      private int marks; 
  
      public Student(int id , int rollno, int marks ) {
           this.id = id;
           this.rollno= rollno;
           this.marks= marks;

      }
      public int getid(){
            return id ;

      }

      public void setid(int id){
         this.id= id;
      }
      public int getrollno(){
          return rollno;
      }
      public void setrollno(int rollno) {
      this.rollno = rollno;

      }
      public int  getmarks(){
        return marks;
      }
      public void setmarks (int marks){
          this.marks = marks;
      }
  
   public static void main (String [] args){
      Student s1 = new Student (23, 23,98);
      Student s2 = new Student (2,24,32);

      System.out.println("Student1 id: "+s1.getid());
      System.out.println("Student1 rollno : "+s1.getrollno());
      System.out.println("Student1 marks: "+s1.getmarks());
      System.out.println("Student2 id "+s1.getid());
      System.out.println("Student2 rollno"+s2.getrollno());
      System.out.println("Student2 marks"+s2.getmarks());

   }
}


    

