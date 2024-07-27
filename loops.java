
import java.util.Scanner;

public class loops {
                public static void main(String[] args){
                Scanner Sc= new Scanner (System.in);
                int a = Sc.nextInt();
             
//for loop                
                     for(int i=0;i<a||a<=10;i++){
                        System.out.println("i am batmen");
                    }
                               
              
//while loop  
            /*    int i=0;
               while (i<a) {
                System.out.println("i am vengvence");
                i++;
               }
            */
            
//do-while loop
            /* int i=0;
            do {
                System.out.println("yamato khudasai");
                i++;
            } while (i<a);
                */
                

//nested loop             
        /*    for (int i=1; i<a; i++) {
                for (int j=1; j<5; j++) {
                    System.out.println(i+" * "+j+" = "+i*j);
                }
                System.out.println();
            }
            */
        
            Sc.close();
        }
}
