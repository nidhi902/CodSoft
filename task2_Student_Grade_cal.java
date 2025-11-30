import java.util.Scanner;

public class task2_Student_Grade_cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        double total_marks=0;
        for(int i=0;i<5;i++){
            System.out.println("subject"+(i+1)+":");
            int marks=sc.nextInt();
            total_marks += marks;


        }
        System.out.print("total marks obtained:");
        System.out.println(total_marks);
        double percentage=(total_marks/5);
        System.out.println("average percentage :"+percentage+"%");
        if(percentage>90){
            System.out.println("grade: A+");
        }
        else if(percentage>80){
            System.out.println("grade: A");
        }
        else if(percentage>70){
            System.out.println("grade: B+");
        }
        else if(percentage>60){
            System.out.println("grade: B");
    
        }
        else if(percentage>50){
            System.out.println("grade: C");
        }
    }
}
