package Homework8_9;

import java.util.Date;

public abstract class AbstractUser implements User{

    private boolean loginState = false;
    private String userName;
    private Date registerDate;

    public void login(){
         loginState = true;
    }

    public void logout(){
        loginState = false;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public Date getRegisterDate() {
        return registerDate;
    }



}
