package day10.oop;

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.makeSound();

    Cat cat = new Cat();
    cat.makeSound();

    Animal animal = dog;
    animal.makeSound();

    animal = cat;
    animal.makeSound();

    Animal animal2 = new Animal();
    sound(animal2);
    sound(dog);
    sound(cat);
  }

  public static void sound(Animal animal) {
    animal.makeSound();
  }

  public static void method(double num) {

  }
}

