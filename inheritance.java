class Parent {
    public void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    // No additional methods or properties
}

public class InheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();  // Output: Parent class method
    }
}
