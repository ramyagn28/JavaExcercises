class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Shape s = new Circle();
        s.print();
    }
}

sealed class Shape permits Circle, Square {
    public void print() {
        System.out.println("Inside Shape class print");
    }
} 
non-sealed class Circle extends Shape {
    public void print() {
        System.out.println("Inside Circle class print");
    }
}
non-sealed class Square extends Shape {
    public void print() {
        System.out.println("Inside Square class print");
    }
}
