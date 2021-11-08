public class LambdaDemo {
    public static void main(String[] args) {
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("Abc");
//            }
//        };

        A obj = i -> System.out.println("Fun" + 3);
        obj.show(3);
    }
}

interface A {
    void show(int i);
}