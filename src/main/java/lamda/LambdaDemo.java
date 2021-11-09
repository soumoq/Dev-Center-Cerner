package lamda;

public class LambdaDemo {
    public static void main(String[] args) {
//        lamda.A obj = new lamda.A() {
//            @Override
//            public void show() {
//                System.out.println("designPattern.Abc");
//            }
//        };

        A obj = i -> System.out.println("Fun " + i);
        obj.show(30);
    }
}

interface A {
    void show(int i);
}