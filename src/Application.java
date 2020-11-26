import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik(5, "Том");
        Kotik kotik1 = new Kotik(6, 4, "Вася", "Мяу!");

        kotik.liveAnotherDay();
        System.out.println(kotik.getWeight());
        System.out.println(kotik.getName());

    }
}
