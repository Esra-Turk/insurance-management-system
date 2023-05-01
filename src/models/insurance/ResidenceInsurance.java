package models.insurance;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(int price) {
        super(price, "Residence");
    }

    @Override
    public double calculate() {
        return (this.getPriceInsurance() * 0.4);
    }
}
