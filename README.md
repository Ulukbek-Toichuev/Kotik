## ШколаНТ_ДЗ_№03_Тойчуев
**Список задач которые нужно было выполнить:**
- ***Я с удовольствием выполнил эту работу вложив все свое усилие и внимание. Надеюсь мой малый опыт не стал помехой для того чтобы моя работа соответствовала всем требованиям. Надеюсь мой труд вас удовлетворит!***
- ***Самым трудным и не решенным для меня оказалось то что метод eat() вне зависимости от своего исхода переходил к циклу, но обещаю я найду выход одолеть эту преграду*** 
- Реализовать в классе Kotik дополнительные методы (5 шт), описывающие его поведение.
    - Создал 5 шт методов (**sleep ()**, **chaseMouse ()**, **goToTheCatLitter ()**, **goForAWalk ()**, **eat ()**)
- Так же добавить числовую переменную экземпляра показывающую степень сытости котика.
    - Добавил **private int satiety**.
- Создать в классе котик метод liveAnotherDay(), в котором будет цикл на 24 итерации, в каждой из которых будет случайным образом вызываться один из методов котика, отвечающих за его поведение, и если котик вместо выполнения метода будет просить есть - его надо будет покормить.
    - С 211 строки всё реализовано.
- Сделать три перегрузки метода eat(), одна из них будет принимать только количество условных единиц сытости, и увеличивать на них соответствующую переменную экземпляра, другая единицы сытости и название еды, третья не принимает параметров, но содержит внутри себя вызов перегрузки принимающей название еды и единицы сытости.
    - Сделал **public int eat(int value)**, **public String eat(String food, int value)**, **public boolean eat()**
- Добавить в класс Kotik статическую переменную, отвечающую за количество созданных экземпляров класса. К переменной должна применяться арифметическая операция «инкремент» при создании экземпляра класса.	
    - Добавил стат. переменную **static int classObjects** а так же добавил стат. метод **public static int catCount()**, применил операцию "инкремент".
- Изменить модификаторы доступа всех переменных в классе Kotik на private. Для доступа к переменным из других классов создать геттеры.
    - Изменил все переменные на **private** за исключением **static int classObjects**.
- Создать в корневом каталоге с программой класс Application с точкой входа в программу (метод public static void main(String[] args)).
    - Создано.
- В этом методе создать два экземпляр класса Kotik. Для первого экземпляра использовать конструктор с параметрами, для второго конструктор без параметров в сочетании с методом setKotik(int prettiness, String name, int weight, String meow) для инициализации переменных.
    - Для 1го объекта использовал конструктор с параметрами, попросив совета у лекторов я решил что для 2го объекта использовал сеттеры и геттеры так как в исходном файле отсутствовал метод **setKotik**.
- Вызвать у любого созданного экземпляра котика метод liveAnotherDay(), а так же вывести на экран (в консоль) его имя и вес.	
    - Метод liveAnotherDay() был вызван для объекта Том.
- Вывести на экран результат сравнения одинаково ли разговаривают котики (сравнить переменные meow).
    - Результат выполнен на 18ой строке с использованием if().
- Последней строкой в методе main вывести на экран количество котиков, созданных в процессе выполнения программы.
    - Вызван стат метод *public static int catCount()**.
