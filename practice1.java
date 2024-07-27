
import java.util.Scanner;

public class practice1 {
                        public static void main(String[] args){

// 1.find sum of three num
// 2.multipication,division,substraction and addition of three sum
// 3.perform q2 using switch case
// 4.table of n number using loop

//1,2            
        /*  Scanner Sc = new Scanner(System.in);
            System.out.println("enter first num");
            int a=Sc.nextInt();
            System.out.println("enter second num");  
            int b=Sc.nextInt();
            System.out.println("enter third num"); 
            int c=Sc.nextInt();               
            int add =a+b+c;
            System.out.println(add); 
            int sub =a-b-c;
            System.out.println(sub); 
            int mul =a*b*c;
            System.out.println(mul); 
            int div =a/b/c;
            System.out.println(div);
        */ 



//3
        /*  Scanner Sc = new Scanner(System.in); 
            
            System.out.println("enter starting three letters of your task :");  //for take input from case as string
            String button=Sc.nextLine();
            
            System.out.println("enter first num :");     //for take first number
            int a1=Sc.nextInt();
            System.out.println("enter second num :");    //for take second number
            int b2=Sc.nextInt();
            System.out.println("enter third num :");     //for take third number
            int c3=Sc.nextInt();            
            
            switch (button) {
                case "add":
                int a= a1+b2+c3;
                System.out.println(a);
                break;

                case "sub":
                int s= a1-b2-c3;
                System.out.println(s);
                break;

                case "mul":
                int m= a1*b2*c3;
                System.out.println(m);
                break;

                case "div":
                int d= a1/b2/c3;
                System.out.println(d);
                break;

                default:
                System.out.println("invalid");
                    break;
            }
        */   



//4
            Scanner Sc= new Scanner(System.in);
            System.out.println("enter a num:");
            int a=Sc.nextInt();
        

            for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
            }
            
                       
             Sc.close();         
                        }
}
