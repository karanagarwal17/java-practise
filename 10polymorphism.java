import java.util.*;

class Animal{
  int i;
  void f(int n){
    i = n;
      System.out.println("f in Animal");
  }
}

class Cat extends Animal{
  void drink(){
    System.out.println("drink in Cat");
  }
}

class Dog extends Animal{
  void drink(){
    System.out.println("drink in Dog");
  }
}

class Test{
  public static void main(String args[])
  {
    Cat c = new Cat();
    Dog d = new Dog();
    c.drink();
    d.drink();
  }
}
