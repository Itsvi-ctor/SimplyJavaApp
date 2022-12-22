//Simple program shows how to access instant variables from methods

public class Puppy {
  int pupppyAge;

  public Puppy(String name) {
    System.out.println("Passed name is: " + name);
  }

  public void setAge(int age) {
    pupppyAge = age;
  }

  public int getAge() {
    System.out.println("Puppy's age is: " + pupppyAge);
    return pupppyAge;
  }

  public static void main(String[] args) {
    Puppy myPuppy = new Puppy("Fola");
    myPuppy.setAge(2);
    myPuppy.getAge();
    System.out.println("variable Value:" + myPuppy.pupppyAge);
    ;
  }
}
