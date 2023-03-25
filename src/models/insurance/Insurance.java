package models.insurance;

import java.util.Date;

public abstract class Insurance {

    private String insuranceName;

    private double priceInsurance;

    private Date startEndDate;

    public abstract double calculate();


}
