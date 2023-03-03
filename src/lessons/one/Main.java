package lessons.one;

import lessons.one.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();

        Calc calc = new Calc();
        calc.setA(12);
        calc.setB(0);
         System.out.println(calc.divide());




        //String badcommit = "not very bad";



        /*
        byte a = 1;
        byte t = 1;
        short b = 1233;
        int c = -256;
        long d = 12345655555L; // ставить "L" желательно чтобы переваривало конвертацию из строки или при больших значениях итд./*
        //                         выше описаны сугубо целые примитивные типы данных.
        float e = 12.12f; // Ставить "F" обязательно
        double f = 12.12;
        boolean bool = false;

        //ниже описание константы
        final byte kk = 66;// создали константу kk со значением 66

        */


        // Для всех примитивных типов данных память выделяется СРАЗУ.

        // в то же время существуют классы-оболочки :
        /*
         * Byte
         * Short
         * Integer // <- в отличие еще и в полном написании
         * Long
         * Float
         * Double
         * Character // <- в отличие еще и в полном написании
         * Boolean
         *
         * Они всегда пишутся с заглавной(большой) буквы.
         * Под них не выделяется память если его значение : null
         * */

        /*Byte by3 = null;
        Byte by2 = 123;
        System.out.println(Byte.MAX_VALUE);

        String s = "789";

        Integer by = c; //
        */





        //Integer by = 123; // оболочка типа инт с именем by
        //int in = by.intValue(); //  создаем постоянную в памяти с данными со значением by
        //Integer in = Integer.valueOf(s); // создали обьект
        //int in2 = Integer.parseInt(s); // parseInt преобразует строку в int

        //System.out.println(in);


        //byte g = (byte) (a + t);
        /* что здесь сделано.
        создали переменную типа byte , и в нее занесли значение а+т
        но если мы сделаем это без команды преобразования (byte)
        то в переменную типа байт попытается записать(а точнее просто выдаст ошибку) переменную типа инт
        т.к. по умолчанию создает инт? ( тут я не оч понял)
        и да можно было бы написать int g = a + t:
        и все было бы ок
        но чтобы сохранить тип переменной байт преобразование ОБЯЗАТЕЛЬНО

        * */

        //byte g = (byte) c;
        //System.out.println(g);
        /*
        char ch = 'f';
        char ch2 = 123;
         */
        /* используются данные из таблицы ЮниКОД, проще говоря если мы написали 'f' выведет f
         *    если написали число без скобок, то возьмет данные из таблицы.      */
       /* System.out.println(ch);
        System.out.println(ch2);
        */
        //поэтому при выводе мы получаем
        // F и {

        /*
        String s = "Hello!" + " sdfasfasdfasdfas"; // не дублируется в памяти
        String s2 = "Hello!" + " sdfasfasdfasdfas"; // а ссылается на текст один для 3х переменных
        String s3= "Hello!" + " sdfasfasdfasdfas"; // \\\ правильный метод
        String s4 = new String ("Hello!"); // дублируется в памяти забивая ее одним и тем же текстом
        String s5 = new String ("Hello!"); // из-за чего память сильно забивается.
        String s6 = new String ("Hello!"); // так не надо делать, за редким исключением.

        String s7 = new String ("Hello!").intern(); // используя метод INTERN оно занесется в память и будет работать по тому же не дублирующему принципу.
        // но чтобы так это работало intern должен быть написан во всех 3 переменных( s4-s6);
        */
        /*/String s = null;

        //если пишем для стринг NULL то в памяти не выделяется место




        System.out.println(s);
        */







    }
}