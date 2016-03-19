package kr.co.tripbox.tripbox.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by motivation on 16. 3. 19..
 */
public class Accompanied implements Serializable {
    public static final String ACCOMPANIED_KEY = "accompanied";

    UserInfo userInfo;
    String location;
    String desc;
    String date;
    boolean isThunder;
    boolean isPartner;

    List<Tag> tags = new ArrayList<>();

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getLocation() {
        return location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsThunder(boolean isThunder) {
        this.isThunder = isThunder;
    }

    public boolean isThunder() {
        return isThunder;
    }

    public void setIsPartner(boolean isPartner) {
        this.isPartner = isPartner;
    }

    public boolean isPartner() {
        return isPartner;
    }
}
