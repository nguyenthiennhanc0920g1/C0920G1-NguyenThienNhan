package test_ending_module_2.programming;

import test_ending_module_2.manager.ManagerSavingBook;

public class Programming {
    public static void main(String[] args) {
        ManagerSavingBook.docFileSoNganHan();
        ManagerSavingBook.docFileSoDaiHan();
        while (true) {
            ManagerSavingBook.menu();
        }
    }
}
