package Question1;

public class Shape {
    private String name;
    private String color;
    private int perimeter;
    private int area;

    public Shape() {

    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String printShape() {
        String res = "";
        if ( name.length() > 0 && color.length() > 0 ) {
            res += "The " + name + " has a " + color + " color";
        }
        return res;
    }
}
