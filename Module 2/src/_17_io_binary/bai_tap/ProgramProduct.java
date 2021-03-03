package _17_io_binary.bai_tap;

import com.sun.corba.se.pept.encoding.OutputObject;
import longabc.Program;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramProduct {

    public static void main(String[] args) {
        Product product1 = new Product("1", "iphone", "China", 1000, "Non");
        Product product2 = new Product("2", "nokia", "China", 500, "Non");
        Product product3 = new Product("3", "samsung", "China", 800, "Non");
        // Write File
        try {
            List<Product> arrProduct = new ArrayList<>();
            arrProduct.add(product1);
            arrProduct.add(product2);
            arrProduct.add(product3);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("src/_17_io_binary/bai_tap/ProductOutput")));
            outputStream.writeObject(arrProduct);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Read File
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("src/_17_io_binary/bai_tap/ProductOutput")));
            List<Product> arrProduct = (List<Product>) inputStream.readObject();
            System.out.println(arrProduct);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
