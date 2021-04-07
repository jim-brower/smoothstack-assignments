interface Shape {
    double calculateArea();
    void display();
}

class Rectangle implements Shape {
    private double length;
    private double width;
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public double calculateArea() {
        return this.length * this.width;
    }
    public void display() {
        System.out.println(this.calculateArea());
    }
}

class Circle implements Shape {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    public double calculateArea() {
        return (this.radius * this.radius * Math.PI);
    }
    public void display() {
        System.out.println(this.calculateArea());
    }
}

class Triangle implements Shape {
    private double base;
    private double height;
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    public double calculateArea() {
        return (this.base * this.height * 0.5);
    }
    public void display() {
        System.out.println(this.calculateArea());
    }
}

class TestShapes {
    public static void main(String[] args) {
        System.out.print("Rectangle 5x3: ");
        (new Rectangle(5,3)).display();

        System.out.print("Circle of radius 3: ");
        (new Circle(1)).display();

        System.out.print("Triangle 5x3: ");
        (new Triangle(5,3)).display();
    }
}
