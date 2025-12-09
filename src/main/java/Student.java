public class Student {
    String name;
    String surname;
    int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] args) {
        Student std1 = new Student("sharu", "avhad", 59);
        System.out.println(std1.name);
        System.out.println(std1.surname);
        System.out.println(std1.id);

    }
}