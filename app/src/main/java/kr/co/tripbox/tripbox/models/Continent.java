package kr.co.tripbox.tripbox.models;

/**
 * Created by motivation on 16. 3. 19..
 */
public class Continent {
    // 대륙 model
    private long id;
    private String name;
    private String image;

    public Continent(long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
