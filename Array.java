

public class Array {
    public static void main(String[] args) {
     
        /* 
        //creating array objects
        String[][] objects = {{"Spoon", "Fork", "Bowl"}, {"Salt", "Pepper","sugar"}};

        //accessing array elements using indexing
        System.out.println(objects[0][0]);
        System.out.println(objects[1][2]);
        */
       
        //creating 2-array objects
          int[][] objects = {{1,2,3}, {4,5,6}}; 

        for (int i = 0; i < objects.length; i++) {
             for (int j = 0; j < objects[i].length; j++) {
                  System.out.print(objects[i][j]+"\t");
             }
            System.out.println();
        }    
    }
   
}


