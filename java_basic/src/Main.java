public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("호야", 20);
        System.out.println(person1.getName());
    }
}

class Person {
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}