
import java.util.*;

public class coditionst {
                        public static void main(String[] args){
                            Scanner Sc= new Scanner(System.in);
                            System.out.print("enter your button :");
                            int button =Sc.nextInt();

                        //if-else
                             /*int age =Sc.nextInt();

                           if (age>18 && age<25) {
                             System.out.println("adult");
                          }
                          else{
                             System.out.println("you are not eligible");
                          } */
                         
                            
                        //switch case
                            switch (button) {
                                case 1:
                                    System.out.println("hello");
                                    break;
                                case 2:
                                    System.out.println("namaste");
                                    break;
                                case 3:
                                    System.out.println("konichiwa");
                                    break;
                                default:
                                    System.out.println("invalid button");

                                    break;
                            }
                          Sc.close();
                 }
}

