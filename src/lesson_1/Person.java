package lesson_1;

public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        return getName().equals(((Person) obj).getName());

    }

    public static void main(String[] args) {
//        int a = 8;
//        int b = 8;

//        Person p1 = new Person("Ivan");
//        Person p2 = new Person("Ivan");
//
//        if (p1.equals(p2)) {
//            System.out.println("equals");
//        } else {
//            System.out.println("no equals");
//        }


//        int a = 7;
//        inc(a);
//        System.out.println(a);


//        Person p1 = new Person("Ivan");
//        updateName(p1);
//        System.out.println(p1.getName());

        int a = 0x10;

        System.out.println(a);

    }

    static void updateName(Person p){
        p.setName("Super"+p.getName());
    }


    static void inc(int a){
        a++;
    }
}
