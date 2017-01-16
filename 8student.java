class Student {
  String name;
  int roll_no;

  void display() {
    System.out.println("name: "+ name +" Roll No:" + roll_no);
  }
  public static void main(String args[]) {
    Student s = new Student();
    s.initialize("karan",58);
    s.display();
  }
  void initialize(String s, int i){
    name = s;
    roll_no = i;
  }
}
