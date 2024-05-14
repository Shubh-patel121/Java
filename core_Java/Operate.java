package Java.core_Java;

class Operate {

   public static void main(String a[]) {
      //## Arithmetic operator ;
      int num1 = 7;
      int num2 = 5;
      // 1. Addition
      int sum = num1 + num2;

      // 2. subtraction
      int difference = num1 - num2;

      // 3. multiplication
      int product = num1 * num2;

      // 4. division : this operation will give the quotient value only;
      int division = num1 / num2;

      // 5.reminder or modulus
      int reminder = num1 % num2;

      // 6. increment decrement multiplication and division 
      int num = 5 ;
          num +=2 ;
      // similarly for other three; 

      // 7. post increament or post decreament by 1;
      num++ ;
      num-- ;

       // 8. pre increament or pre decreament by 1;
       //IMP:- pre inc/dec first inc/dec the value and then fetch the value;
       // means - it assign the value and then return so we get updated value in place
       //but in case of post we get updated value in next statement;
       ++num ;
       --num ;

      /* 
       ## Comparison operators
        1. equality (==) ;
        2. less than (<) ;
        3. less than or equal (<=);
        4. greater than or equal (>=);
        5. greater than (>);
        6. Not equal (!=)
      */

      // ## assignment operator (=);

      //## logical operator 
      /* 
       1.logical And (&&);
       2.logical OR (||);
       3.logical Not (!);
       */
      System.out.println("sum:" + sum + ", diff:" + difference + ",product:" + product + ",division:" + division
            + ",remender:" + reminder);
   }
}