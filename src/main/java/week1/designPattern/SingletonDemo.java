package week1.designPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        Abc abc = Abc.getObject();
        abc.dis();
    }
}

class Abc {
    private static Abc abc = new Abc();

    private Abc() {
    }

    public static Abc getObject() {
        return abc;
    }

    public void dis() {
        System.out.println("ABC");
    }
}
