package models.account;
import models.insurance.Insurance;
import models.user.User;
import java.util.ArrayList;

enum AuthenticationStatus{
    SUCCESS,
    FAIL
}

public abstract class Account {
    User user;

    private ArrayList<Insurance> insuranceList;

    private AuthenticationStatus isLogin;

    public void showUserInfo(){

    }

    public void addAddress(){

    }
    public void deleteAddress(){

    }

    public AuthenticationStatus loginStatus(){
        return AuthenticationStatus.SUCCESS;
    }

    public void login(){

    }

    public abstract void addInsurancePolicy();


}
