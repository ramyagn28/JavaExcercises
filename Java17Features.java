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
        String day = "Mon"; int num = 0;
        num = switch(day) {
            case "Mon" -> {
                            System.out.println("Mon");
                            yield 1;
                          }
            case "Tue" -> {
                            System.out.println("Tue");
                            yield 2;
                          }
            case "Wed" -> {
                            System.out.println("Wed");
                            yield 3;
                          }
            case "Thu" -> {
                            System.out.println("Thu");
                            yield 4;
                          }
            default -> {
                          System.out.println("Def");
                          yield -1;
                       }
        };
        System.out.println("Num : " + num);
    }
} 
non-sealed class Circle extends Shape {
    public void print() {
        System.out.println("Inside Circle class print");
        Object intObj = Integer.valueOf("5");
        Object strObj = new String("hhh");
        System.out.println(switch(strObj) {
            case Integer i -> "Int " + i;
            case String s -> "String " + s;
            default -> "Unkown";
        });
    }
}
non-sealed class Square extends Shape {
    public void print() {
        System.out.println("Inside Square class print");
    }
}
