// B1: Xây dựng lớp product bao gồm các công việc như sau
public class Product {
    //Các thuộc tính ucra sản phẩm bao gồm: mã sản phẩm, tên sản phẩm và giá sản phẩm
    private int id;
    private String name;
    private double price;

    // Constructor cho class product
    public Product() {
    }

    public Product(Product product) {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Getter và setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Cài phương thức toString
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }
}