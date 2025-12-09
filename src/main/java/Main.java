class User{
    String name;
    int id;
    String surname;
    public User(String name, int id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }
}

public class Main {
    public static void main(String[] args) {
        User obj1 = new User("Sharayu",59,"Avhad");
        System.out.println("Hi SharuBai");
        System.out.println(obj1);
        System.out.println(obj1.name);
        System.out.println(obj1.surname);
        System.out.println(obj1.id);

        int ans = givemeid(obj1);
        System.out.println(ans);
    }

    public static int givemeid(User user){
        int id = user.id;
        return id;
    }
}
