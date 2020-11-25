package model;
public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety;

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

    //get-set satiety
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public int getSatiety() {
        return satiety;
    }

    public boolean play(){
        boolean bool = true;
        if (bool)
            System.out.println("Play");
        return bool;
    }

    public boolean sleep(){
        boolean bool = true;
        if (bool)
            System.out.println("Sleep");
        return bool;
    }

    public boolean chaseMouse(){
        boolean bool = true;
        if (bool)
            System.out.println("Chase mouse");
        return bool;
    }

    public boolean goToTheCatLitter(){
        boolean bool = true;
        if (bool)
            System.out.println("Go to the cat litter");
        return bool;
    }

    public boolean goForAWalk(){
        boolean bool = true;
        if (bool)
            System.out.println("Go for a walk");
        return bool;
    }



}
