package models.insurance;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double priceInsurance;
    private LocalDate startDate;
    private LocalDate endDate;

    public Insurance(int priceInsurance, String insuranceName) {
        super();
        this.priceInsurance = priceInsurance;
        this.insuranceName = insuranceName;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusYears(1);
    }

    public abstract double calculate();

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getPriceInsurance() {
        return priceInsurance;
    }

    public void setPriceInsurance(double priceInsurance) {
        this.priceInsurance = priceInsurance;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
