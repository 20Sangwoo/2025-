package day12.question.q1;

//문제 설명
//동물원 관리 시스템을 설계하시오. 다음 요구 사항을 충족해야 합니다.
//
//1.Animal이라는 추상 클래스를 정의합니다.
//    - sound()라는 추상 메서드를 포함합니다.
//    - eat()라는 일반 메서드를 포함하여 "Animal is eating"을 출력합니다.
//2.Mammal이라는 추상 클래스를 정의합니다. Animal 클래스를 상속받습니다.
//  - giveBirth()라는 추상 메서드를 포함합니다.
//3.Bird라는 추상 클래스를 정의합니다. Animal 클래스를 상속받습니다.
//  - fly()라는 추상 메서드를 포함합니다.
//4.Swimmable라는 인터페이스를 정의합니다.
//  - swim()이라는 메서드를 포함합니다.
//5.Dog와 Cat 클래스를 정의합니다. Mammal 클래스를 상속받습니다.
//6.Eagle와 Sparrow 클래스를 정의합니다. Bird 클래스를 상속받습니다.
//7.Dolphin 클래스를 정의합니다. Mammal 클래스를 상속받고, Swimmable 인터페이스를 구현합니다.
//8. 메인 클래스에서 각 동물의 객체를 생성하고, sound(), eat(), giveBirth(), fly(), swim() 메서드를 호출하여 결과를 출력합니다.
public class Main {
  public static void main(String[] args) {
    Dog dog  = new Dog();
    Cat cat = new Cat();
    Eagle eagle = new Eagle();
    Sparrow sparrow = new Sparrow();
    Dolphin dolphin = new Dolphin();

    dog.giveBith();
    dog.sound();
    dog.eat();

    Mammal[] mammals = new Mammal[3];
    mammals[0] = new Dog();
    mammals[1] = new Cat();
    mammals[2] = new Dolphin();

    for (Mammal mammal : mammals) {
      mammal.sound();
    }

    Animal animal = new Dolphin();
    Mammal mammal = new Dolphin();
    Dolphin dolphin1 = new Dolphin();

    Swimmable swimmable = new Dolphin();
    Aquatic aquatic = new Dolphin();
    method(new Dolphin());
  }

  public static void method(Aquatic aquatic) {
    aquatic.dive();
    aquatic.swim();
  }
}