package week1.lamda;

public class LambdaDemo {
    public static void main(String[] args) {
//        week1.lamda.A obj = new week1.lamda.A() {
//            @Override
//            public void show() {
//                System.out.println("week1.designPattern.Abc");
//            }
//        };

        A obj = i -> System.out.println("Fun " + i);
        obj.show(30);
    }
}

interface A {
    void show(int i);
}