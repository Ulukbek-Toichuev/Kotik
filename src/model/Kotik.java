package model;
import java.util.Scanner;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety;
    private final String hungry = "Судя по тому как он истошно мяукает, думаю его стоит покормить.";
    private final String full = "Есть он сейчас точно не хочет.";
    private final String kittyEat = "Котик - кушает.";
    private String food;
    private boolean b = true;
    private Scanner scanner = new Scanner(System.in);
    static int classObjects = 0;

    public static int catCount(){
        classObjects++;
        System.out.println( "Создано: " + classObjects + " котика");
        return classObjects;
    }

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
    public Kotik(int weight, String name) {
        this(5, weight, name, "Мяу!");
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        classObjects++;
    }

    //Сеттеры и геттеры на food
    public void setFood(String food) {this.food = food;}

    public String getFood() {return food;}

    //Сеттеры и геттеры на satiety
    public void setSatiety(int satiety) {this.satiety = satiety;}

    public int getSatiety() {return satiety;}

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

    public boolean eat(boolean b) {
        this.b = b;
        int a = (int) (Math.random() * (2 + 1)) - 1;
        switch (a) {
            case -1:
            case 0:
                System.out.println(hungry);
                break;
            case 1:
                System.out.println(full);
                break;
        }
        return b;
    }

    public int eat(int value) {
        satiety = value;
        satiety = (int) (Math.random() * (2 + 1)) - 1;
        return satiety;
    }

    public String eat(String food, int value) {
        this.food = food;
        satiety = value;

        if (eat(getSatiety()) <= 0) {

            System.out.println("Котик хочет кушать.");
            System.out.println("Чем хотите покормить его?" + "\n" +
                    "1) корм" + "\n" + "2) консервы" + "\n" + "3) натуральная еда");
            food = scanner.nextLine();
            switch (food) {
                case "корм":
                case "консервы":
                case "натуральная еда":
                    System.out.println("Вы выбрали: " + food + "\n" + kittyEat);
                    break;
                default:
                    System.out.println("Ошибка!");
                    scanner.nextLine();
                }
        }
        else {
            System.out.println(full);
        }
          return food;
    }

    public boolean eat(){
        eat(food, satiety);
        return true;
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
        eat();
        for (int i = 0; i < 24; i++){

            int a = (int) (Math.random()*6+1);

            switch (a) {
                case 1:
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