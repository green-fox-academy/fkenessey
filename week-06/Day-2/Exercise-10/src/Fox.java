public class Fox {

  private String name;
  private String type;
  private String colour;

  public Fox(String name, String type, String colour) {
    this.name = name;
    this.type = type;
    this.colour = colour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "name: " + this.name + " type: " + this.type + " colour: " + this.colour;
  }
}
