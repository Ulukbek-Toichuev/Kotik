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
    public Kotik(int weight, String name) {
        this(5, weight, name, "Мяу!");
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    /// get-set Prettiness
    public int getPrettiness(){
        return prettiness;
    }

    public void setPrettiness(int prettiness){
        this.prettiness = prettiness;
    }

    ///get-set Weight
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    ///get-set Name
    public String getName(){
        return name;
    }

    public void setName(String a){
        this.name = a;
    }

    /// get-set Meow
    public String getMeow(){
        return meow;
    }

    public void setMeow(String meow){
        this.meow = meow;
    }

    public boolean play()
    {

    }

    public boolean sleep()
    {

    }

    public boolean chaseMouse()
    {

    }

    public boolean goToTheCatLitter()
    {

    }

    public boolean goForAWalk()
    {

    }



}
