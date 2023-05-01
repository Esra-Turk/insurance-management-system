package models.insurance;

public class HealthInsurance extends Insurance {

    public HealthInsurance(int price) {
        super(price, "health");
    }

    @Override
    public double calculate() {
        return (this.getPriceInsurance() * 0.2);
    }
}
