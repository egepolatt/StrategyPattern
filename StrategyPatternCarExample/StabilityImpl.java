public class StabilityImpl implements Favorite {
    @Override
    public CarsType getFirst() {
        return CarsType.AUDI;
    }

    @Override
    public CarsType getSecond() {
        return CarsType.BMW;
    }

    @Override
    public CarsType getThird() {
        return CarsType.MERCEDES;
    }
}
