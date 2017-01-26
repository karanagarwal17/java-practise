class Animal{
  int i;
  void f(int n){
    i = n;
      System.out.println("f in Animal");
  }
}

class Dog extends Animal{
void f1(){
  System.out.println("f1 in Dog");
}
}

class Test{
  public static void main(String args[])
  {
    Dog p = new Dog();
    p.f1();
    p.f(2);
  }
}
