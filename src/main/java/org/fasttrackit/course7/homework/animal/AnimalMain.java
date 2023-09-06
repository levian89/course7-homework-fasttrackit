package org.fasttrackit.course7.homework.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.eat());
        System.out.println(cat.talk());
        System.out.println(cat.walk());
        System.out.println("************************");
        Animal chicken = new Chicken();
        System.out.println(chicken.eat());
        System.out.println(chicken.talk());
        System.out.println(chicken.walk());
        System.out.println("************************");
        Animal dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.talk());
        System.out.println(dog.walk());
        System.out.println("************************");
        Animal duck = new Duck();
        System.out.println(duck.eat());
        System.out.println(duck.talk());
        System.out.println(duck.walk());
        System.out.println("************************");
        Animal mouse = new Mouse();
        System.out.println(mouse.eat());
        System.out.println(mouse.talk());
        System.out.println(mouse.walk());
        System.out.println("************************");
    }
}
