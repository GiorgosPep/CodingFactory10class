package gr.aueb.cf.ch15.special_interfaces;

public class CompactDisk implements IProduct{

    private int id;
    private String title;
    private String manufacturer;

    public CompactDisk() {
    }

    public CompactDisk(int id, String title, String manufacturer) {
        this.id = id;
        this.title = title;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
