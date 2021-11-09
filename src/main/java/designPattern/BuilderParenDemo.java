package designPattern;

public class BuilderParenDemo {
    public static void main(String[] args) {
        Student studentBuilder = new StudentBuilder().setName("Soumojyoti").setAge(23).getPhone();
        System.out.println(studentBuilder);
    }

}

class Student {
    private final String name;
    private final int roll;
    private final int age;

    public Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Roll: " + roll + "\n" + "Age: " + age + "\n";
    }
}

class StudentBuilder {
    private String name;
    private int roll;
    private int age;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student getPhone() {
        return new Student(name, roll, age);
    }
}