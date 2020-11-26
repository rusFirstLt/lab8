package lab8;

class People {
    String name, lastname;
    int age;

    void getInfo() {
        System.out.println(this.lastname + " " + this.name + " " + this.age);
    }

    void walk() {
        System.out.println("Я могу ходить");
    }

    void voice() {
        System.out.println("Я могу говорить");
    }

    void run() {
        System.out.println("Я могу бегать");
    }

    People() {
        name = "People";
        lastname = "People";
        age = 0;
    }

    People(String name, String lastname, int age) {
        this.age = age;
        this.lastname = lastname;
        this.name = name;
    }
}

class Student extends People {
    Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    void learn() {
        System.out.println("Я учусь");
    }

}

class Teacher extends People {
    Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    void teach() {
        System.out.println("Я учу");
    }
}

class Vivod_metodov {
    public static void main(String[] args) {
        People people = new People();
        people.getInfo();
        people.run();
        people.voice();
        people.walk();
        System.out.println();

        People Artemiy = new People("Artemiy", "Kychkin", 19);
        Artemiy.getInfo();
        Artemiy.run();
        Artemiy.voice();
        Artemiy.walk();
        System.out.println();

        Student Kirill = new Student("Kirill", "Fedorov", 16);
        Kirill.getInfo();
        Kirill.run();
        Kirill.voice();
        Kirill.walk();
        Kirill.learn();
        System.out.println();

        Teacher Corpse = new Teacher("Corpse", "Lucefer", 30);
        Corpse.getInfo();
        Corpse.run();
        Corpse.voice();
        Corpse.walk();
        Corpse.teach();
        System.out.println();
    }
}
