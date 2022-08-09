import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductManager extends Product{
    //Tạo một arrayList, kiểu dữ liệu truyền vào là Product - để lưu danh sách sản phẩm
    List<Product> productList = new ArrayList<Product>();

    public void addProduct(int id, String name, double price){
        productList.add(new Product(id, name, price));
    }


    public void editProduct(int id, String name, double price){
        for(int i = 0; i < productList.size(); i++){
            if(id==productList.get(i).getId()){
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
                showListProduct();
            } else {
                System.out.println("Not found product");
            }
        }
    }


    public void deleteProduct(int id){
        if (productList.size() != 0){
            for(int i = 0; i < productList.size(); i++){
                if(id == productList.get(i).getId()){
                    productList.remove(i);
                    System.out.println("Xóa thành công sản phẩm");
                    showListProduct();
                }
            }
        } else {
            System.out.println("No product");
        }
    }


    public void showListProduct(){
        if (productList.size() != 0) {
            for (int i = 0; i < productList.size(); i++) {
                System.out.println(productList.get(i));
            }
        } else {
            System.out.println("No product");
        }
    }

    public void searchProduct(String searchName){
        for(int i = 0; i < productList.size(); i++){
            if(productList.get(i).getName().equals(searchName)) {
                System.out.println("Product is: " + productList.get(i));
            }
        }
    }


    public void sortByPrice(){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() > product2.getPrice()) {
                    return 1;
                } else if (product1.getPrice() == product2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        showListProduct();
    }
}