package fourth;

public class Clothing extends Product {
    private int size;
    private String material;
    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString().concat(" _ " + size + " _ " + material);
    }
}
