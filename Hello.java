package Java;

// jshell is introduced in java 9 and it is the env where we can run java code
// directly without having classes and complete proper structure.

// Notes:-
/*
 * As a user or human we write java code which is human readable code but machine
 * does not understand that.
 * 1.So first java code is compiled using compiler javac i.e java c. It converts
 * this java code into byte code (extension of byte code is .class).
 * 2.Now this byte code is run by the jvm.
 * IMP:- java application is plateform independent but jvm is plateform
 * dependent;
 * bec this jvm helps us to write plateform independent java application.
 * 
 * 3. JVM needs the start point of the application and its just a single file
 * out of n number of files and the single method which is the main method which
 * follows the java signature.
 * 4. JVM runs the application into our OS ;
 * 5. JVM is the part of JRE (Java Runtime Envirenment);
 * 6. JRE is the part of JDK (Java development kit);
 
 flow:- JDK -> JRE -> JVM -> JAVAC -> javacode;

 Note:- JDK is the part of development env only else to run a java application we need JRE;
 */

/**

 */
class Hello {
// println print from new line and only print method prints into same line;
        public static void main(String a[]) {
                System.out.println("Hello world");
        }

}