public class q12 { // Pet class
  // TODO: Declare private fields
  private String name;
  private String type;
  private int age;

  // TODO: Define no-arg constructor
  public Pet() {
     this.name = "unknown";
     this.type = "unknown";
     this.age = 0;
  }

  // TODO: Define overloaded constructor
 public Pet(String name, String type, int age) {
    this.name = name;
    this.type = type;
    this.age = age;
 }

  // TODO: Define getter (accessor) methods and setter (mutator) methods
  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getAge() {
    return age;
  }

}