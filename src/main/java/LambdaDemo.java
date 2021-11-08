public class LambdaDemo {
    public static void main(String[] args) {
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("Abc");
//            }
//        };

        A obj = i -> i;
        int a = obj.show(3);
        System.out.println(a+a);
    }
}

interface A {
    int show(int i);
}