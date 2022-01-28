public class JvmComprehension { // инициализация класса JvmComprehension в Metaspace

    public static void main(String[] args) { // в Stack Memory создается фрейм main()
        int i = 1;                      // 1 во фрейме main() объявляется переменная i, и ей сразу присваивается значение 1
        Object o = new Object();        // 2 в heap создается объект класса Object, а во фрейме main() создается ссылка типа Object "o" на этот объект
        Integer ii = 2;                 // 3 в heap создается объект класса Integer имеющий значение 2, во фрейме main() создается ссылка "ii" типа Integer на этот объект
        printAll(o, i, ii);             // 4 создается новый фрейм printAll()
        System.out.println("finished"); // 7 создается новый фрейм для вывода строки "finished"
    }

    private static void printAll(Object o, int i, Integer ii) { //передаются ссылки на о, i, ii
        Integer uselessVar = 700;                   // 5 в heap создается объект класса Integer имеющий значение 700, во фрейме printAll() создается ссылка "uselessVar" типа Integer на этот объект
        System.out.println(o.toString() + i + ii);  // 6 создается новый фрейм, в который передается строковое представление объекта Object посредством метода o.toString() с учетом конкатенации "i" и "ii"

    }
}