package Chapter14.Package01;


// Простой обобщенный класс.
// Здесь Т обозначает параметр типа, который будет заменен
// реальным типом при создании объекта типа Gen


// В классе Gen применяется параметр типа, и поэтому он является
// обобщенным классом, относящимся к параметризованному типу.
class Gen<T> {
    T ob; // объявить объект типа T

    // Конкретный тип параметра о определяется с помощью параметра типа Т,
    // передаваемого при создании объекта класса Gen.
    // Передаем конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }

    // Параметр типа T используется для указания типа, возвращаемого методом.
    // Метод возвращает объект оЬ
    T getOb() {
        return ob;
    }

    // Метод отображает тип Т
    void showType() {
        System.out.println("Tипoм Т является: " + ob.getClass().getName());
    }
}

// Класс GenDemo служит для демонстрации обобщенного класса Gen.
class GenDemo {
    public static void main(String[] args) {

        // <Integer> - это аргумент типа, который передается в качестве параметра типа Т из класса Gen
        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;


        // Здесь применяется автоупаковка для инкапсуляции значения 12345678 в объекте типа <Integer>
        // Создать объект типа Gen<Integer> и присвоить ссылку на него переменной iOb
        iOb = new Gen<Integer>(12345678);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // Получить значение переменной iOb.
        // Для этого не требуется никакого приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // Создать объект типа Gen для символьных строк
        Gen<String> sOb = new Gen<String>("текстовая строка");

        // показать тип данных, хранящихся в переменной strOb
        sOb.showType();

        // Получить значение переменной sOb.
        // И в этом случае приведение типов не требуется
        String str = sOb.getOb();
        System.out.println("Значение: " + str);
    }
}
/* -------------------------------
Tипoм Т является: java.lang.Integer
Значение: 12345678

Tипoм Т является: java.lang.String
Значение: текстовая строка

 */