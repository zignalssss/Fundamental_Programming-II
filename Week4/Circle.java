public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this(1.0,"red");
    }
    public Circle(double radius){
        this(radius,"red");
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
