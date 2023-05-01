package models.account;

import models.insurance.Insurance;
import models.user.User;

public class Enterprise extends Account {

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy(Insurance insurance) {
        insurance.setPriceInsurance(insurance.calculate());
        super.getInsuranceList().add(insurance);

    }

}
