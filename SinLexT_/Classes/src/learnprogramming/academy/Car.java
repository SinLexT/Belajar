package learnprogramming.academy;

public class Car { // public means unrestricted access to the class, class is blueprint for an object that we're gonna be creating
    private int doors; //it named field
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) { // why use setter and getter is to add some validation like line 12
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }else {
            this.model = "Unkown";
        }
    }

    public String getModel() {
        return this.model;
    }
}