import com.example.polymorphism.*;

public class TestMain {
    public static void main(String[] args) {
        String name = "sve00";
        //Compile time/static/Method overloading/without Inheritance
        AreaCalculator area = new AreaCalculator();
        System.out.println(area.getArea(5));
        System.out.println(area.getArea(5.25));
        System.out.println(area.getArea(2.5, 3.5));

        //problem statement: What if hundred of animals are there.

        /*Dog dog = new Dog();
        Cat cat = new Cat();
        test(dog);
        test(cat);
        */

        Cat c = new Cat();
        test(c);

        Horse h = new Horse();
        test(h);

        Dog d = new Dog();
        test(d);

    }

    public static void test(Animal d){
        d.makeSound();
        d.walk();
    }
    /*
    public static void test(Cat c){
        c.makeSound();
        c.walk();
    }

     */



}
