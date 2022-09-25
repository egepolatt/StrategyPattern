public class Buyer {
    private Favorite favorite;
    private ChoiceType choice;

    public Buyer(ChoiceType choice) {
        this.choice = choice;

        if(choice == null){
            throw new NullPointerException("Cars is not null");
        }

        switch (choice){
            case Junior:
                favorite = new SpeedImpl();
                break;

            case Middle:
                favorite = new StabilityImpl();
                break;

            case Senior:
                favorite = new ComfortImpl();
                break;

            default:
                break;
        }
    }

    public String getPriority(){

        System.out.println("Selection of " + choice + ":");

        String list = favorite.getFirst() + "\n" + favorite.getSecond() +"\n" + favorite.getThird();

        return list;
    }
}
