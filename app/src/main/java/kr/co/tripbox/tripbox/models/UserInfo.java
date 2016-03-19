package kr.co.tripbox.tripbox.models;

import java.io.Serializable;

/**
 * Created by motivation on 16. 3. 19..
 */
public class UserInfo implements Serializable {
    private long id;
    private String name;
    private String profile;
    private long age = 0;
    private String job;
    private String introduce;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
