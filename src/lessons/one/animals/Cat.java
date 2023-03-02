package lessons.one.animals;

public class Cat {

    String name; //будет null , для обьектов
    int age; // будет 0 . для примитивов
    /* автоматически присваивает значение  т.к. это глобальная*/

    public void sleep(){
        int name = 10000; // локальная переменная должна иметь значение, не может быть равна 0 или null
        System.out.println("Спит : " + name);
        Integer x = 10; //
        Integer y = x;
        x = 5;

    }
    public void sleep2(){
        int name = 12345;
        System.out.println("Спит : " + this.name);

    }

}
