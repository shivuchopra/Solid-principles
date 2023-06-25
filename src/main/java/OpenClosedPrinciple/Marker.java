package OpenClosedPrinciple;

public class Marker {

    private  String name;
    private  String color;
    private  Integer year;
    private  Integer price;

    public Marker(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
