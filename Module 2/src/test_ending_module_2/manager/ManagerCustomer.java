package test_ending_module_2.manager;

import test_ending_module_2.information.Customer;
import test_module_2.product.ExportProduct;
import test_module_2.product.ImportProduct;
import test_module_2.product.Product;
import utilites_regex_exception_read_write_file.check_input_output.CheckInStringData;
import utilites_regex_exception_read_write_file.reader_writer_utilities.FileUtilities;
import utilites_regex_exception_read_write_file.regex.RegexToString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    private static List<Customer> arrCustomer = new ArrayList<>();
    public static void addCustomer() {
        Scanner input = new Scanner(System.in);
        int maKhachHang = 1;
        System.out.println("Nhập tên khách hàng: ");
        String name = CheckInStringData.checkString();
        System.out.println("Nhập ngày sinh khách hàng: ");
        String ngaySinh = RegexToString.regexDate(input.nextLine());
        System.out.println("Nhập giới tính khách hàng: ");
        String gioiTinh = RegexToString.regexGender(input.nextLine());
        System.out.println("Nhập số điện thoại khách hàng: ");
        String soDienThoai = RegexToString.regexPhoneNumber(input.nextLine());
        System.out.println("Nhập địa chỉ khách hàng: ");
        String diaChi = CheckInStringData.checkString();
        Customer customer = new Customer(maKhachHang, name, ngaySinh, gioiTinh, soDienThoai, diaChi);
        arrCustomer.add(customer);
    }
    public static void writeFile(){
        File file = new File("src/test_ending_module_2/data/customer.csv");
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer customer : arrCustomer) {
            try {
                out.write(customer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() {
        List<String> arrListStr = null;
        try {
            arrListStr = FileUtilities.readFileAsListOfStrings("src/test_ending_module_2/data/customer.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert arrListStr != null;
        for (String str : arrListStr) {
            List<String> arrStr = new ArrayList<>();
            arrStr = Arrays.asList(str.split(","));
//                Customer customer = new Customer(arrStr.get(0), arrStr.get(1), arrStr.get(2), Double.parseDouble(arrStr.get(3)), Integer.parseInt(arrStr.get(4)), arrStr.get(5));
//                arrCustomer.add(customer);

        }
    }
}
