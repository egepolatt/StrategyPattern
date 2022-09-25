public class SpeedImpl implements Favorite {
    @Override
    public CarsType getFirst() {
        return CarsType.BMW;
    }

    @Override
    public CarsType getSecond() {
        return CarsType.AUDI;
    }

    @Override
    public CarsType getThird() {
        return CarsType.MERCEDES;
    }
}
