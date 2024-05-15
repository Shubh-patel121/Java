package Java.core_Java;

public class Loops {

    public static void main(String a[]) {
        // Loops :- are used to using code repeatedly;
        // 1. while loop :- this will repeat the code until the while condition is true
        // ;
        int counter = 0;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }

        /*
         * 2. Do while loop:- it will run at least one time no matter while condition it
         * true or false and then after first iteration it will depends on the while
         * condition.
         */

        int i = 1;
        do {
            System.out.println("Do while loop: " + i);
            i++;
        } while (i < 4);

        /* 
         3. For loop :-  this will take three parameters first start point of the loop,
          second end point of the loop and the last one parameter which decides how to
          propagate in loop from start to end i.e increment or decrement ;

          imp:- we can also use for loop for other types of loops using handling the start ,end and the inc/dec values;
         */

         for(int j = 0 ; j < 5 ; j++){
              System.out.println("j th" + j);
         }
    }
}
