public class Human {
  int age = 20;
  public static void main(String[] args) {

    Human human = new Human();
    System.out.println(human.getAge(4 ,23.3,true));


  }
  double getAge(int i,double d,boolean boo){
    return  i+d;
  }
}
