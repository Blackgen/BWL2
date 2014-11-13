package entities;

/**
 * Created by patrick_steinhauer on 12.11.2014.
 */
public class RAM {
    private int ramID;
    private String name;
    private String description;

    public int getRamID() {
        return ramID;
    }

    public void setRamID(int ramID) {
        this.ramID = ramID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
