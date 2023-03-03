package lessons.one.animals;

public class Cat {

    private static String name; //будет null , для обьектов
    private int age; // будет 0 . для примитивов
    /* автоматически присваивает значение  т.к. это глобальная*/

    public void sleep(){
        int name = 10000; // локальная переменная должна иметь значение, не может быть равна 0 или null
        System.out.println("Спит : " + name);
        System.out.println(age);
        Integer x = 10; //DD
        Integer y = x;
        x = 5;

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
