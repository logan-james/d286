import java.util.ArrayList;

public class q14 { // Customer class
  private int id;
  private String name;

  // TODO: Create a Grocery ArrayList
  private ArrayList<Grocery> groceryList = new ArrayList<>();

  // TODO: Define getGroceryList() method that returns Grocery ArrayList
  public ArrayList<Grocery> getGroceryList() {
    return groceryList;
  }

  // TODO: Define addGrocery(Grocery grocery) that adds a Grocery object to
  // Grocery ArrayList via the grocery parameter
  public void addGrocery(Grocery grocery) {
    groceryList.add(grocery);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}