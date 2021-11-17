package adapter;

import facebook.FacebookUser;

import java.util.Date;

public class FacebookAdapter implements User {
    private FacebookUser user;

    public FacebookAdapter(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getTime() {
        return user.getUserActiveTime();
    }
}
