package test_ending_module_2.manager;

import test_ending_module_2.information.LongTermBook;
import test_ending_module_2.information.NoLimitSavingBook;
import test_ending_module_2.information.SavingBook;
import test_ending_module_2.information.ShortTermBook;
import utilites_regex_exception_read_write_file.check_input_output.CheckInPrimeData;
import utilites_regex_exception_read_write_file.check_input_output.CheckInStringData;
import utilites_regex_exception_read_write_file.reader_writer_utilities.FileUtilities;
import utilites_regex_exception_read_write_file.regex.RegexToString;
import utilites_regex_exception_read_write_file.regex.TimeToMilliseconds;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManagerSavingBook {
    private static List<test_ending_module_2.information.SavingBook> arrListShortTerm = new ArrayList<>();
    private static List<test_ending_module_2.information.SavingBook> arrListLongTerm = new ArrayList<>();

    public static void menu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SỔ TIẾT KIỆM");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Thêm mới sổ tiết kiệm.");
        System.out.println("2. Xóa sổ tiết kiệm.");
        System.out.println("3. Xem danh sách sổ tiết kiệm.");
        System.out.println("4. Xem thông tin khách hàng.");
        System.out.println("5. Tìm kiếm sổ tiết kiệm.");
        System.out.println("6. Thoát.");
        System.out.println("Chọn chức năng: ");
        switch (CheckInPrimeData.checkIntPositive()) {
            case 1:
                addSavingBook();
                break;
            case 2:
                deleteSavingBookById();
                break;
            case 3:
                showSavingBook();
                break;
            case 4:
                showCustomer();
                break;
            case 5:
                searchSavingBookById();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Do not have choice, select again!");
        }
    }

    public static void addSavingBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm sổ tiết kiệm ngắn hạn.");
        System.out.println("2. Thêm sổ tiết kiệm vô thời hạn.");
        System.out.println("3. Thêm sổ tiết kiệm dài hạn.");

        switch (CheckInPrimeData.checkIntPositive()) {
            case 1:
                System.out.println("Nhập mã số sổ (STK-xxxx): ");
                String idNganHan = UtilitiesSavingBook.checkId();
                System.out.println("Nhập mã khách hàng: ");
                String idKhachHangNganHan = CheckInStringData.checkString();
                System.out.println("Nhập ngày mở sổ: ");
                String ngayMoSo = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập ngày bắt đầu gửi: ");
                String ngayBatDauGui = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập số tiền gửi (tối thiểu 1.000.000 VND): ");
                double soTienGui = CheckInPrimeData.checkDoubleMinOneMillion();
                System.out.println("Nhap lãi suât: ");
                double laiSuat = CheckInPrimeData.checkDoublePositive();
                System.out.println("Nhập kỳ hạn gửi:");
                String kyHan = CheckInStringData.checkString();
                test_ending_module_2.information.SavingBook soNganHan =
                        new test_ending_module_2.information.ShortTermBook(idNganHan, idKhachHangNganHan, ngayMoSo,
                                ngayBatDauGui, soTienGui, laiSuat, kyHan);
                arrListShortTerm.add(soNganHan);
                writeFileNganHan();
                break;
            case 2:
                System.out.println("Nhập mã số sổ (STK-xxxx): ");
                String idNganHanVTH = UtilitiesSavingBook.checkId();
                System.out.println("Nhập mã khách hàng: ");
                String idKhachHangNganHanVTH = CheckInStringData.checkString();
                System.out.println("Nhập ngày mở sổ: ");
                String ngayMoSoVTH = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập ngày bắt đầu gửi: ");
                String ngayBatDauGuiVTH = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập số tiền gửi (tối thiểu 1.000.000 VND): ");
                double soTienGuiVTH = CheckInPrimeData.checkDoubleMinOneMillion();
                System.out.println("Nhap lãi suât: ");
                double laiSuatVTH = CheckInPrimeData.checkDoublePositive();
                test_ending_module_2.information.SavingBook soNganHanVTH =
                        new NoLimitSavingBook(idNganHanVTH, idKhachHangNganHanVTH, ngayMoSoVTH,
                                ngayBatDauGuiVTH, soTienGuiVTH, laiSuatVTH);
                arrListShortTerm.add(soNganHanVTH);
                writeFileNganHan();
                break;
            case 3:
                System.out.println("Nhập mã số sổ (STK-xxxx): ");
                String idDaiHan = UtilitiesSavingBook.checkId();
                System.out.println("Nhập mã khách hàng: ");
                String idKhachHangDaiHan = CheckInStringData.checkString();
                System.out.println("Nhập ngày mở sổ: ");
                String ngayMoSoDaiHan = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập ngày bắt đầu gửi: ");
                String ngayBatDauGuiDaiHan = RegexToString.regexDate(input.nextLine());
                System.out.println("Nhập số tiền gửi (tối thiểu 1.000.000 VND): ");
                double soTienGuiDaiHan = CheckInPrimeData.checkDoubleMinOneMillion();
                System.out.println("Nhap lãi suât: ");
                double laiSuatDaiHan = CheckInPrimeData.checkDoublePositive();
                System.out.println("Nhập kỳ hạn gửi:");
                String kyHanDaiHan = CheckInStringData.checkString();
                System.out.println("Nhập ưu đãi: ");
                String uuDai = CheckInStringData.checkString();
                test_ending_module_2.information.SavingBook soDaiHan =
                        new test_ending_module_2.information.LongTermBook(idDaiHan, idKhachHangDaiHan, ngayMoSoDaiHan,
                                ngayBatDauGuiDaiHan, soTienGuiDaiHan, laiSuatDaiHan, kyHanDaiHan, uuDai);
                arrListLongTerm.add(soDaiHan);
                writeFileDaiHan();
                break;
            default:
                System.out.println("Lựa chọn không tồn tại, yêu cầu nhập lại!");
                addSavingBook();
        }
    }

    public static void showSavingBook() {
        System.out.println("Chọn loại sổ:");
        System.out.println("1. Sổ ngắn hạn.");
        System.out.println("2. Sổ dài hạn.");
        System.out.println("Nhập lựa chọn ");
        int choice = CheckInPrimeData.checkIntPositive();
        if (choice == 1) {
            for (test_ending_module_2.information.SavingBook book : arrListShortTerm) {
                System.out.println(book.toString());
            }
        } else if (choice == 2) {
            for (test_ending_module_2.information.SavingBook book : arrListLongTerm) {
                System.out.println(book.toString());
            }
        } else {
            System.out.println("Không tồn tại lựa chọn, yêu cầu nhập lại!");
            showSavingBook();
        }
    }

    public static void searchSavingBookById() {
        System.out.println("Chọn loại sổ:");
        System.out.println("1. Sổ ngắn hạn.");
        System.out.println("2. Sổ dài hạn.");
        System.out.println("Nhập lựa chọn ");
        int choice = CheckInPrimeData.checkIntPositive();
        System.out.println("Nhập mã sổ (STK-xxxx) muốn tìm kiếm: ");
        String maSo = UtilitiesSavingBook.checkId();
        boolean checkFind = false;
        if (choice == 1) {
            for (test_ending_module_2.information.SavingBook book : arrListShortTerm) {
                if (maSo.equals(book.getMaSotietKiem())) {
                    System.out.println(book.toString());
                    checkFind = true;
                    break;
                }
            }
        } else if (choice == 2) {
            for (test_ending_module_2.information.SavingBook book : arrListLongTerm) {
                if (maSo.equals(book.getMaSotietKiem())) {
                    System.out.println(book.toString());
                    checkFind = true;
                    break;
                }
            }
        } else {
            System.out.println("Không tồn tại lựa chọn, yêu cầu nhập lại!");
            searchSavingBookById();
        }
        if (!checkFind) {
            System.out.println("Không tìm thấy sổ!");
        }
    }

    public static void deleteSavingBookById() {
        System.out.println("Chọn loại sổ:");
        System.out.println("1. Sổ ngắn hạn.");
        System.out.println("2. Sổ dài hạn.");
        System.out.println("Nhập lựa chọn ");
        int choice = CheckInPrimeData.checkIntPositive();
        System.out.println("Nhập mã sổ (STK-xxxx) muốn xóa: ");
        String maSo = UtilitiesSavingBook.checkId();
        boolean checkFind = false;
        int d = -1;
        if (choice == 1) {
            for (int i = 0; i < arrListShortTerm.size(); i++) {
                if (maSo.equals(arrListShortTerm.get(i).getMaSotietKiem())) {
                    d = i;
                    checkFind = true;
                    break;
                }
            }
            if (checkFind) {
                System.out.println("1. Đồng ý.");
                System.out.println("2. Không.");
                System.out.println("Nhập chọn lựa: ");
                int choice2 = CheckInPrimeData.checkIntPositive();
                if (choice2 == 1) {
                    arrListShortTerm.remove(d);
                    showSavingBook();
                    writeFileNganHan();
                } else if (choice2 == 2) {
                } else {
                    System.out.println("Không tồn tại lựa chọn, yêu cầu nhập lại!");
                    deleteSavingBookById();
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < arrListLongTerm.size(); i++) {
                if (maSo.equals(arrListLongTerm.get(i).getMaSotietKiem())) {
                    d = i;
                    checkFind = true;
                    break;
                }
            }
            if (checkFind) {
                System.out.println("1. Đồng ý.");
                System.out.println("2. Không.");
                System.out.println("Nhập chọn lựa: ");
                int choice2 = CheckInPrimeData.checkIntPositive();
                if (choice2 == 1) {
                    arrListLongTerm.remove(d);
                    writeFileDaiHan();
                    showSavingBook();
                } else if (choice2 == 2) {
                } else {
                    System.out.println("Không tồn tại lựa chọn, yêu cầu nhập lại!");
                    deleteSavingBookById();
                }
            }
        } else {
            System.out.println("Không tìm thấy sổ tiết kiệm!");
            deleteSavingBookById();
        }
    }

    public static void docFileSoNganHan() {
        List<String> arrListStr = null;
        try {
            arrListStr = FileUtilities.readFileAsListOfStrings("src/test_ending_module_2/data/shortTerm.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert arrListStr != null;
        for (String str : arrListStr) {
            List<String> arrStr = new ArrayList<>();
            arrStr = Arrays.asList(str.split(","));
            if (arrStr.size() == 6) {
                test_ending_module_2.information.SavingBook soNganHanVTH = new NoLimitSavingBook(arrStr.get(0),
                        arrStr.get(1), arrStr.get(2), arrStr.get(3),
                        Double.parseDouble(arrStr.get(4)), Double.parseDouble(arrStr.get(5)));
                arrListShortTerm.add(soNganHanVTH);

            } else if (arrStr.size() == 7) {
                test_ending_module_2.information.SavingBook soNganHan = new ShortTermBook(arrStr.get(0), arrStr.get(1),
                        arrStr.get(2), arrStr.get(3),
                        Double.parseDouble(arrStr.get(4)), Double.parseDouble(arrStr.get(5)),
                        arrStr.get(6));
                arrListShortTerm.add(soNganHan);
            }
        }
    }

    public static void docFileSoDaiHan() {
        List<String> arrListStr = null;
        try {
            arrListStr = FileUtilities.readFileAsListOfStrings("src/test_ending_module_2/data/longTerm.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert arrListStr != null;
        for (String str : arrListStr) {
            List<String> arrStr = new ArrayList<>();
            arrStr = Arrays.asList(str.split(","));
            test_ending_module_2.information.SavingBook soDaiHan = new LongTermBook(arrStr.get(0),
                    arrStr.get(1), arrStr.get(2), arrStr.get(3),
                    Double.parseDouble(arrStr.get(4)), Double.parseDouble(arrStr.get(5)), arrStr.get(6), arrStr.get(7));
            arrListShortTerm.add(soDaiHan);
        }
    }

    public static void writeFileNganHan() {
        File file = new File("src/test_ending_module_2/data/shortTerm.csv");
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (SavingBook savingBook : arrListShortTerm) {
            try {
                assert out != null;
                out.write(savingBook.toString());
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
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileDaiHan() {
        File file = new File("src/test_ending_module_2/data/longTerm.csv");
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (SavingBook savingBook : arrListLongTerm) {
            try {
                assert out != null;
                out.write(savingBook.toString());
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
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  showCustomer(){

    }
    public static void exit() {
        System.out.println("Thoát!");
        System.exit(0);
    }
}
