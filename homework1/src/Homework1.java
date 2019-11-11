public class Homework1 {
    public static void main(String[] args) {

        //a) In the main method, create 4 objects in which Car is the parent class.
        //b) Assign 2 objects of the class to the variable of the parent class, the other two to the class of the object itself.
        //c) Give each of the objects the required characteristics.
        Man audiDriver1 = new Man("Alice", 22);
        Man audiDriver2 = new Man("Max", 27);
        Man dodgeDriver1 = new Man("Dom", 43);
        Man dodgeDriver2 = new Man("Nina", 33);

        Car audi1 = new Audi(Color.BURGUNDY, 4, audiDriver1);
        Audi audi2 = new Audi(Color.YELLOW, 7, null);
        Car dodge1 = new Dodge(Color.BLACK, 5, dodgeDriver1);
        Dodge dodge2 = new Dodge(Color.RED, 4, dodgeDriver2);

        //d) Try to put in one of the Cars, more people than its capacity. If an Exception is thrown, handle it (try / catch).

        try {
            audi1.loadPassengers(2);
            audi1.loadPassengers(1);
        } catch (CapacityException capacityException) {
            capacityException.printStackTrace();
        }

        System.out.println(audi1);

        //e) Create an object of class Car and derive its value as a variable for which Car is the parent class.
        Car car1  = new Car();
        car1 = dodge1;
        System.out.println(car1);

        //f) When assigning age for Man, use both primitive data types and wrapping ones.

        Integer ageInt = new Integer(48);
        int age = 18;
        audiDriver2.setAge(ageInt);
        System.out.println(audiDriver2);
        audiDriver2.setAge(age);
        System.out.println(audiDriver2);



        // g) Create two people with the same characteristics. Compare if they are equal with == and with equals.
        Man audiDriver1Same = new Man("Alice", 22);
        System.out.println("The result of comparing audiDriver1 and audiDriver1Same with equals(): "
                + audiDriver1.equals(audiDriver1Same));
        System.out.println("The result of comparing audiDriver1 and audiDriver1Same with == : "
                + (audiDriver1 == audiDriver1Same));

        // Compare if two different machines are equal using == and using equals.
        System.out.println("The result of comparing dodge1 and dodge2 with == : " + (dodge1 == dodge2));
        System.out.println("The result of comparing dodge1 and dodge2 with equals(): " + (dodge1.equals(dodge2)));

    }
}
