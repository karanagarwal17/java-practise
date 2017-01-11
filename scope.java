class scope {
  public static void main (String args[]){
    int x = 10;
    if( x == 10 ){
      int y = 20;
      System.out.println("x and y are " + x + " " + y);
    }
    //System.out.println("x and y are" + x + " " + y); *This won't work *
    System.out.println("x and y are " + x + " ");
    ma();
  }
  public static void ma(){
    System.out.println("Second x and y are " + x + " " + y);
  }
}
