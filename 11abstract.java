abstract class Shape{
  abstract void calculateArea();
  void disp(){
    System.out.println("disp in shape");
  }
}

class Circle extends Shape {
  void calculateArea(){
    System.out.println("pi*r*r");
  }
}

class Rectangle extends Shape {
  void calculateArea(){
    System.out.println("l*b");
  }
}

class Test{
  public static void main(String args[]){
    Rectangle p = new Rectangle();
    p.calculateArea();
  }
}
