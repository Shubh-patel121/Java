package Java.core_Java;

/* 
 a class is a blueprint or template for creating objects.
 It defines the properties and behaviors (methods) that objects of that class will have.
 Each object created from a class is an instance of that class.
 */
public class Classes {
    // below is the instance variable and this will be stored in heap memory;
    int num = 10;

    // # Method overloading ;
    // methods in a class of same name but different type of return value
    // or different number of parameters are possible and this is known as method
    // overloading;

    public int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }

    public double add(int n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
}

class main {

    public static void main(String a[]) {

        // new classes() -> will give object of the class;
        // obj refer that object;
        /*
         * this objects are stored in heap memory so we can say
         * heap memory contains instance variables and the method declaration at some address,
         *  this address is passed to stack memory for referring this object.
         * Stack memory contains local variables i.e. parameters of the methods.
         *  Also the references variables i.e address of the object which are stored into heap are passed here into stack memory.
         */
        Classes obj = new Classes();

        int res = obj.add(5, 6);
        System.out.println(res);

        double addRes = obj.add(4, 4.5);
        System.out.println(addRes);

        int addThree = obj.add(1, 2, 3);
        System.out.println(addThree);
    }

}
