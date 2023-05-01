package models.insurance;

public class TravelInsurance extends Insurance {
    public TravelInsurance(int price) {
        super(price, "Travel");
    }

    @Override
    public double calculate() {
        return (this.getPriceInsurance() * 0.25);
    }
}
