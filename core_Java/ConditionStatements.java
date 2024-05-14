package Java.core_Java;

public class ConditionStatements {

    /*
     * if(condition){
     * //condition == true then this code block will execute;
     * }else if(another condition){
     * //another condition == true then this code block will execute;
     * }else{
     * otherwise this code will execute;
     * }
     * 
     * Note:- if there is only single statement or expression
     * we can keep this out of code block that is also fine;
     * 
     * shortcut of above if else conditional statement
     * ==> Ternary operator : mainly used for simple and inline expression;
     * e.g (condition) ? "True" : "False" ;
     */

    public static void main(String a[]) {
        int firstNumber = 10;
        int secondNumber = 20;
        boolean result = false;

        if (firstNumber > secondNumber) {
            result = true;
        } else {
            result = false;
        }

        String ternaryOutput = result ? "this will execute if the result is true"
                : "This will return if result is false";

        System.out.println(ternaryOutput);

        /*
         * ## Switch case
         * Switch(conditionValue){
         * case 1:
         * // execute this;
         * // if conditionValue match with case 1 break from here;
         * //break ;
         * case 2 :
         * // execute this;
         * // if conditionValue match with case 2 break from here;
         * //break ;
         * default :
         * if not match with any above condition execute this;
         * 
         * }
         * 
         */

        int dayNumber = 8;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of the week range");
        }
    }

}
