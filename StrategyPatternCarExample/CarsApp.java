public class CarsApp {

    public static void main(String[] args) {

        priority(ChoiceType.Junior);
        priority(ChoiceType.Middle);
        priority(ChoiceType.Senior);

    }
    private static void priority(ChoiceType choice) {
        Buyer buyer = new Buyer(choice);
        String priority = buyer.getPriority();
        System.out.println(priority);
    }
}
