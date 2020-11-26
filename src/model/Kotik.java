package model;
import java.util.Scanner;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private final int satiety = (int) (Math.random() *(2+1)) - 1;
    private final String hungry= "Судя по тому как он истошно мяукает, думаю его стоит покормить.";
    private final String full= "Есть он сейчас точно не хочет.";
    // Конструктор без параметров, он идентичен конструктору по умолчанию,
    // который сюда бы подставила Java,
    // Но она его не подставит, по той причине, 
    // что ниже определяется другой (перегруженный) конструктор, с параметрами.
    public Kotik() {
    }

    /*
    Указатель this можно использовать
    для вызова перегруженного конструктора
     */
    public Kotik(int weight, String name){
        this(5, weight, name, "Мяу!");
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    //Сеттеры и геттеры на prettinness
    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getPrettiness() {
        return prettiness;
    }

    //Сеттеры и геттеры на weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    //Сеттеры и геттеры на name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Сеттеры и геттеры на meow
    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getMeow() {
        return meow;
    }

    public int eat() {
        if (satiety <= 0) {
            int chois;
            System.out.println(hungry + "\n" + "Покормите кота!");
            System.out.println("Нажмите 0 чтобы выбрать Сухой корм" + "\n"
                    + "Нажмите 1 чтобы выбрать Консервы" + "\n" + "Нажмите 2 чтобы выбрать Натуральная еда");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                chois = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число! Повторите ввод!");
                return eat();
            }
            if (chois > 2){
                System.out.println( "Вы ввели число больше 2ух!");
                return eat();
            }

            switch (chois) {
                case 0:
                    System.out.println("Котику понравился ваш выбор теперь он сытый " +
                            "практически на целый день!");
                    break;
                case 1:
                    System.out.println("Котик: кушает с большим аппетитом.");
                    break;
                case 2:
                    System.out.println("Натуральная еда, то что надо для " +
                            "здорового образа жизни. Ваш питомец тоже так считает, " +
                            "судя по тому как он всё скушал быстро.");
                    break;
            }
        } else if (satiety > 0) {
            System.out.println(full);
        }
        return satiety;
    }

        public  boolean play(){
            int a = (int) (Math.random() * 2);
            switch (a) {
                case 0:
                    System.out.println("Котик играется с мягкой игрушкой.");
                    break;
                case 1:
                    System.out.println("Котик играется с хозяином.");
                    break;
            }
            return true;
        }

        public boolean sleep () {
        int a = (int) (Math.random() *2);
            switch (a) {
                case 0:
                    System.out.println("Котик спит на диване.");
                    break;
                case 1:
                    System.out.println("Котик спит под кроватью.");
                    break;
            }
            return true;
        }

        public boolean chaseMouse () {
            int a = (int) (Math.random() * 2);
            switch (a) {
                case 0:
                    System.out.println("Котик гоняется за мышью во дворе.");
                    break;
                case 1:
                    System.out.println("Котик гоняется за мышью в подвале.");
                    break;
            }
            return true;
        }

        public boolean goToTheCatLitter () {
            int a = (int) (Math.random() * 2);
            switch (a) {
                case 0:
                    System.out.println("Котик решил сходить в лоток по маленькому.");
                    break;
                case 1:
                    System.out.println("Котик решил сходить в лоток по большому.");
                    break;
            }
            return true;
        }

        public boolean goForAWalk () {
            int a = (int) (Math.random() * 2);
            switch (a) {
                case 0:
                    System.out.println("Котик гуляет с хозяином по парку.");
                    break;
                case 1:
                    System.out.println("Котик гуляет сам по двору.");
                    break;
            }
            return true;
        }

        public void liveAnotherDay () {
        for (int i = 0; i < 24; i++){
            int a = (int) (Math.random()*6+1);
            switch (a) {
                case 1:
                    System.out.println(i + " час " + eat());
                    break;
                case 2:
                    System.out.println(i + " час " + play());
                    break;
                case 3:
                    System.out.println(i + " час " + sleep());
                    break;
                case 4:
                    System.out.println(i + " час " + chaseMouse());
                    break;
                case 5:
                    System.out.println(i + " час " + goToTheCatLitter());
                    break;
                case 6:
                    System.out.println(i + " час " + goForAWalk());
                    break;
            }
        }

        }
    }