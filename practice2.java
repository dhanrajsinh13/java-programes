
public class practice2 {
                        public static void main(String[] args){
                        
                            /*Q1
                            print :- *****
                                     *****
                                     *****
                                     *****
                            */                          
                            
                            /*    
                            //ans
                            for(int i=1;i<=4;i++){                              
                                for(int j=1;j<=5;j++){                          
                                    System.out.print("*");               
                                }
                                System.out.println("");
                            }
                            */

                            /*Q2
                            print :- *****
                                     *   *
                                     *   *
                                     *****
                            */        
            
                            /* 
                            //ans
                            int n=4;
                            int m=5;
                            for(int i=1;i<=n;i++){                              
                                for(int j=1;j<=m;j++){  
                                    if( i==1 || j==1 || i==n || j==m){                        
                                    System.out.print("*");  
                                    } 
                                    else{
                                        System.out.print(" ");
                                    }           
                                }
                                System.out.println();
                            }
                            */

                            
                            /*Q3
                            print :- *
                                     **
                                     ***
                                     ****
                            */

                            /* 
                            //ans     
                            int n=4;
                            for(int i=1;i<=n;i++){                              
                                for(int j=1;j<=i;j++){  
                                    System.out.print("*");  
                                }
                                System.out.println();
                            }
                            */

                            
                            /*Q3
                            print :-****
                                    ***
                                    **
                                    *
                            */

                            /*
                            //ans     
                            int n=4;
                            for(int i=n;i>=1;i--){                              
                                for(int j=1;j<=i;j++){  
                                    System.out.print("*");  
                                }
                                System.out.println();
                            }
                             */

                              
                            /*Q4
                            print :-   *
                                      **
                                     ***
                                    ****
                            */

                            /*
                            //ans     
                            int n=4;
                            for(int i=1;i<=n;i++){                              
                                for(int j=1;j<=n-i;j++){  
                                    System.out.print(" ");  
                                }
                                for(int j=1;j<=i;j++){  
                                    System.out.print("*");  
                                }
                                System.out.println();
                            } 
                            */

                            /*Q5
                            print :-****
                                     ***
                                      **
                                       *
                            */

                            /* 
                            //ans
                            int n=4;
                            for(int i=n;i>=1;i--){ 
                                for(int j=1;j<=n-i;j++){  
                                    System.out.print(" ");  
                                }                              
                                for(int j=1;j<=i;j++){  
                                    System.out.print("*");  
                                }
                                System.out.println();
                            }
                            */
                           
                             


    }
}
