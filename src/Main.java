import java.util.Scanner;

//B3: Chạy chương trình và test từng chức năng
public class Main {
    public static void main(String[] args) {
//        // Để test các chức năng một cách nhanh chóng, ta sẽ tạo sẵn 1 danh sách các sản phẩm
//        // Tạo ra các sản phẩm
//        Product product1 = new Product(1, "Audi", 5000);
//        Product product2 = new Product(2, "Porsche", 2000);
//        Product product3 = new Product(3, "Mecerdes", 3000);
//        Product product4 = new Product(4, "BMW", 9000);
//        Product product5 = new Product(5, "Toyota", 1200);
//
//        // Test phương thức thêm sản phẩm vào danh sách
//        ProductManager productManager = new ProductManager();
//        productManager.addProduct(product1);
//        productManager.addProduct(product2);
//        productManager.addProduct(product3);
//        productManager.addProduct(product4);
//        productManager.addProduct(product5);
//
//        // Test phương thức hiển thị danh sách
//        productManager.showListProduct();
//
//        // Test phương thức sửa sản phẩm
//        productManager.editProduct(1, "Mazda", 3200);
//        System.out.println("Danh sách sau khi sửa");
//        productManager.showListProduct();
//
//        // Test phương thức xóa sản phẩm
//        productManager.deleteProduct(1);
//        System.out.println("Danh sách sau khi xóa");
//        productManager.showListProduct();
//
//        //  Test phương thức tìm kiếm sản phẩm
//        productManager.searchProduct("BMW");
//
//        //test phương thức sắp xếp sản phẩm theo giá
//        productManager.sortByPrice();



        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choose = -1;
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. Thêm sản phẩm vào danh sách");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("0. Exit");
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    System.out.println("=====THÊM SẢN PHẨM======");
                    System.out.println("Nhập mã sản phẩm ");
                    int id = scanner.nextInt();
                    System.out.println("Nhập tên sản phẩm ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm ");
                    double price = scanner.nextDouble();
                    productManager.addProduct(id, name, price);
                    break;
                case 2:
                    System.out.println("=====SỬA SẢN PHẨM======");
                    System.out.println("Nhập mã sản phẩm cần sửa ");
                    int editId = scanner.nextInt();
                    System.out.println("Nhập tên mới ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá mới ");
                    double newPrice = scanner.nextDouble();
                    productManager.editProduct(editId, newName, newPrice);
                    break;
                case 3:
                    System.out.println("=====XÓA SẢN PHẨM======");
                    System.out.println("Nhập mã sản phẩm cần xóa ");
                    int deleteId = scanner.nextInt();
                    productManager.deleteProduct(deleteId);
                    break;
                case 4:
                    System.out.println("=====HIỂN THỊ DANH SÁCH SẢN PHẨM======");
                    productManager.showListProduct();
                    break;
                case 5:
                    System.out.println("======TÌM KIẾM SẢN PHẨM======");
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm cần tìm:");
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;
                case 6:
                    System.out.println("======SẮP XẾP SẢN PHẨM======");
                    productManager.sortByPrice();
                    break;
                default:
                    System.out.println("NO Choice!");
            }
        } while(choose != 0);
    }
}