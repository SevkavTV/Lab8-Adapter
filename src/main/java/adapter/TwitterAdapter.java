package adapter;

import twitter.TwitterUser;

import java.util.Date;

public class TwitterAdapter implements User{
    private TwitterUser user;

    public TwitterAdapter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getTime() {
        return user.getLastActiveTime();
    }
}
