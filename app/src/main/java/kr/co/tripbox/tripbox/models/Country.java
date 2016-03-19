package kr.co.tripbox.tripbox.models;

/**
 * Created by motivation on 16. 3. 19..
 */
public class Country {
    private long id;
    private String name;
    private Continent continent;
    private String image;

    public Country(long id, Continent continent, String name, String image) {
        this.id = id;
        this.continent = continent;
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public long getId() {
        return id;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
