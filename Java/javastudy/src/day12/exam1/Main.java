package day12.exam1;

public class Main {
  public static void main(String[] args) {
//    Animal animal = new Animal(); 추상클래스는 객체 생성 불가
    Dog dog = new Dog();
    dog.makeSound();

    Animal animal = dog;
    animal.makeSound();

    Animal animal2 = new Cat();
    animal2.makeSound();

    method(new Dog());
    method(new Cat());

  }

  public static void method(Animal animal){
    animal.makeSound();
  }
}