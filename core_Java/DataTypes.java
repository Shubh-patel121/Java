package Java.core_Java;

/* 
 java primitive Data Types:-
  1. Data types are used to represent type of the variable & expressions.
  2. Representing how much memory is allocated for variable.
  3. Specifies range value of the variable
 
 Data Types:-
   1. Primitive :- Number , character, boolean ;
   2. Reference :- Strings 

   Primitive consist of three data types:-
   1.Number
   2.Character :- holds only single character and is in single quote e.g char c = 'k' ;
   3.Boolean :- only true and false (imp this is not like 1 & 0 in js, its just only T & F);

   Number consist of 6 types based on the range:-
   1.Byte :- 1 byte
   2.Short :- 2 byte
   3.Integer :- 4 byte
   4.Long :- 8 byte :- put l at the end of the value;
   5.Float :- by default type is double in case of floating point number so to define floating
             point number we need to explicitly mention f at the end eg. float f = 5.6f ;
   6.Double

   ## Type conversion and casting;
    Type-casting:-
    The process of converting data one type to another type is called type casting.
    There are two types of type casting
    1. Implicit typecasting /widening/up casting 
    2. Explicit type-casting (narrowing)/do

    Implicit-typecasting:- (widening) or (up casting)
     1. When we assign lower data type value to higher data type that typecasting is called up- casting.
     2. When we perform up casting data no data loss.
     3. It is also known as up-casting or widening.
     4. Compiler is responsible to perform implicit typecasting.

     Explicit type-casting:- (Narrowing) or (down casting)
      1. When we assign a higher data type value to lower data type that type-casting is called down 
         casting.
      2. When we perform down casting data will be loss.
      3. It is also known as narrowing or down casting.
      4. User is responsible to perform explicit typecasting.

      # Type Promotion - 
        When a byte value is operated with another byte value and if the result 
        go beyond range and now if we assign this large value inside a new int variable,
        in this java allows this and this functionality is known as type promotion;
 
 */

class DataTypes {

    public static void main(String a[]) {
        int num = 5;
        float marks = 5.6f;
        byte by = 127;
        short sh = 556;
        double newMarks = 5.6;
        long l = 5678l;
        char newChar = 'O';
        boolean boolValue = true;

        System.out.println("num: " + num + ", marks: " + marks + ",newMarks: " + newMarks + ",newChar: " + newChar
                + ",BoolValue: " + boolValue);
    }
}