public class student {

  /*Attributes*/
  public int age;
  public String name;
  public String group;

  /*Main Mwthod */
  public static void main(String[] args) {
    student Phubate = new student();
    // Phubate.name = "Phbate";
    // Phubate.age = 19;
    // Phubate.group = "65/45";

    Phubate.setData("phubate", 19, "65/45");

    student plashon = new student();
    plashon.name = "Plashon";
    plashon.age = 19;
    plashon.group = "65/45";

    plashon.printName();
    plashon.printAge();
    plashon.printGroup();

    System.out.println(
      "------------------------------------------------------------------------"
    );
    Phubate.getData();
    // Phubate.printName();
    // Phubate.printAge();
    // Phubate.printGroup();
  }

  /*methode */
  public void setData(String name, int age, String group) {
    this.name = name;
    this.age = age;
    this.group = group;
  }

  public void getData() {
    System.out.println(
      this.name + " is " + this.age + " years old and is in group " + this.group
    );
  }

  public void printName() {
    System.out.println("studern name:\t" + this.name);
  }

  public void printAge() {
    System.out.println("studern Age:\t" + this.age);
  }

  public void printGroup() {
    System.out.println("studern Group:\t" + this.group);
  }
}
