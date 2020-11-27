import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik Tom = new Kotik(10, 5, "Том", "Мяу!");
        Kotik Simon = new Kotik();
        Simon.setPrettiness(9);
        Simon.setWeight(6);
        Simon.setName("Симон");
        Simon.setMeow("Мяу!");

        if (Tom.getMeow().equals(Simon.getMeow())){
            System.out.println("Том и Симон мяукают одинаково!");
        }else {
            System.out.println("Том и Симон мяукают по разному!");
        }

        System.out.print("Имя кота: " + Tom.getName() +
                "\n" + "Его вес в кг: " + Tom.getWeight() + "\n");

        Tom.liveAnotherDay();

        Kotik.catCount();

    }
}
