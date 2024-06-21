import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("entered name"+name);

        System.out.println("enter ur age:");
        int age = sc.nextInt();
        System.out.println("entered age"+age);

        System.out.println("enter ur exm marks:");
        int marks=sc.nextInt();
        System.out.println("Marks="+marks);
        String grade;
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("marks="+marks);

        if (marks>=90){
           grade="A"; 
        }
        else if (marks>=79){
            grade="B";
        }
        else if(marks>=69){
            grade="C";
        }
        else{
            grade="F";
        }
        System.out.println("your grade="+grade);

         if (age<=25 && grade=="A" || grade=="B"){
            System.out.println("elgible for scholarship");
         }
        else{
            System.out.println("not elgible for scholarship");
        }
            }
        }
    





        

    