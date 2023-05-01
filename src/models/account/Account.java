package models.account;

import models.address.IAddress;
import models.address.manager.AddressManager;
import models.insurance.Insurance;
import models.user.User;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private User user;

    private ArrayList<Insurance> insuranceList;

    private AuthenticationStatus isLogin = AuthenticationStatus.FAIL;

    public Account(User user) {
        this.user = user;
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Account account = (Account) obj;
        return Objects.equals(user, account.user);
    }


    public final void showUserInfo() {
        System.out.format("Name:%s %s\nAge:%d\nEmail:%s\nJob:%s", user.getName(), user.getSurname(), user.getAge(), user.getEmail(), user.getJob());
    }

    public void addAddress(IAddress address) {
        AddressManager.addAddress(this.user, address);

    }

    public void deleteAddress(IAddress address) {
        AddressManager.deleteAddress(this.user, address);
    }

    public AuthenticationStatus loginStatus() {
        return isLogin;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            isLogin = AuthenticationStatus.SUCCESS;
            Date time = Date.from(Instant.now());
            user.setLastLogin(time);
        } else {
            throw new InvalidAuthenticationException("Invalid user");

        }

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public void setIsLogin(AuthenticationStatus isLogin) {
        this.isLogin = isLogin;
    }
}
