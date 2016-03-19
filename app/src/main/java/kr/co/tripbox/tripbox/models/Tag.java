package kr.co.tripbox.tripbox.models;

import java.io.Serializable;

/**
 * Created by motivation on 16. 3. 19..
 */
public class Tag implements Serializable {
    String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
