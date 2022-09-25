public class ComfortImpl implements Favorite {
    @Override
    public CarsType getFirst() {
        return CarsType.MERCEDES;
    }

    @Override
    public CarsType getSecond() {
        return CarsType.AUDI;
    }

    @Override
    public CarsType getThird() {
        return CarsType.BMW;
    }
}
