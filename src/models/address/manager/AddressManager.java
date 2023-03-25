package models.address.manager;

import models.address.IAddress;
import models.user.User;

public class AddressManager {

    public static void addAddress(User user, IAddress address){
        user.getAddressList().add(address);

    }

    public static void deleteAddress(User user, IAddress address){
        if(!user.getAddressList().contains(address)){
            return;
        }
        user.getAddressList().remove(address);

    }

}
