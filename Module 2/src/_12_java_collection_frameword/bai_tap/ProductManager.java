package _12_java_collection_frameword.bai_tap;


import java.util.*;

public class ProductManager extends Product {
    static ArrayList<Product> menu = new ArrayList<>();

    public ProductManager() {
    }

    public static ArrayList<Product> getMenu() {
        return menu;
    }

    public static void setMenu(ArrayList<Product> menu) {
        ProductManager.menu = menu;
    }

    public static void addProduct() {

        int id = Product.getCount();
        Scanner input = new Scanner(System.in);
        System.out.println("Input name product:");
        String name = input.nextLine();
        System.out.println("Input price product:");
        double price = input.nextDouble();

        Product product = new Product(id, name, price);
        menu.add(product);

    }

    public static void editProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input id product which want to edit: ");
        int id = input.nextInt();
        boolean checkFind = false;
        for (Product product : menu) {
            if (id == product.getId()) {
                System.out.println("Input new name: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("Input new price: ");
                double price = input.nextDouble();
                product.setNameProduct(name);
                product.setPriceProduct(price);
                checkFind = true;
                break;
            }
        }
        if (!checkFind) {
            System.out.println("Do NOT find product!");
        }
    }

    public static void deleteProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input id product which want to delete: ");
        int id = input.nextInt();
        int d = -1;
        boolean checkFind = false;
        for (int i = 0; i < menu.size(); i++) {
            if (id == menu.get(i).getId()) {
                d = i;
                checkFind = true;
                break;
            }
        }
        if (!checkFind) {
            System.out.println("Do NOT find product!");
        } else {
            menu.remove(d);
        }
    }

    public static void searchProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input id product which want to search: ");
        int id = input.nextInt();
        boolean checkFind = false;
        for (int i = 0; i < menu.size(); i++) {
            if (id == menu.get(i).getId()) {
                System.out.println(menu.get(i).toString());
                checkFind = true;
                break;
            }
        }
        if (!checkFind) {
            System.out.println("Do NOT find product!");
        }
    }

    public static void showProduct() {
        for (Product a : menu) {
            System.out.println(a.toString());
        }
    }

    public static void sortProductByPrice() {
        menu.sort(Comparator.comparing(Product::getPriceProduct));
    }

    public static void exit() {
        System.out.println("Exit!");
        System.exit(0);
    }

    public static void menu() {
        System.out.println("1. Add product.");
        System.out.println("2. Edit product by ID.");
        System.out.println("3. Delete product by ID.");
        System.out.println("4. Show array product.");
        System.out.println("5. Search product by ID.");
        System.out.println("6. Sort product by Price.");
        System.out.println("0. Exit.");
        System.out.println("Input your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                editProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                showProduct();
                break;
            case 5:
                searchProduct();
                break;
            case 6:
                sortProductByPrice();
                break;
            case 0:
                exit();
                break;
        }
    }

}
