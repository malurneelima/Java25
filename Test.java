class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Before super()");
        super(); // allowed in JDK 25
        System.out.println("After super()");
    }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}