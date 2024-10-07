package YouTube;

class Pen {
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

    class Students {
        String name;
        int age;

        public void printName() {
            System.out.println(this.name);
            System.out.print(this.age);
        }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main (String args[]) {
        Students s1 = new Students("Anchal", 20);   //Constructors means java k objects banana
        s1.printName();

   } 
}
