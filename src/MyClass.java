public class MyClass {
    String name;
    String surname;
    int age;
    String[] lessons = new String[3];
    String myFavoriteFood;

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MyClass(String[] lessons, String favoriteFood) {
        this.lessons = lessons;
        this.myFavoriteFood = favoriteFood;
    }
}
