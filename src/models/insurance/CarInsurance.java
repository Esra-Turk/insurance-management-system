package models.insurance;

public class CarInsurance extends Insurance {
    public CarInsurance(int price) {
        super(price, "Car");
    }

    @Override
    public double calculate() {
        return (this.getPriceInsurance() * 0.3);
    }
}
