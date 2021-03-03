package CaseStudy.services;

import CaseStudy.common.ReadWriteFile;
import CaseStudy.controller.MainController;
import CaseStudy.documents.EmployeesFile;
import CaseStudy.models.Employee;
import CaseStudy.view.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ManageEmployee extends Employee {
    public static void showInformationOfEmployee() {

        Map<Integer, Employee> employeeMaps = ReadWriteFile.readFileEmployee();
        for (Map.Entry<Integer, Employee> employees : employeeMaps.entrySet()) {
            System.out.println(employees.toString());
        }
        boolean check = false;
        Set<Integer> keys = employeeMaps.keySet();
        boolean check1 = true;
        Integer number = null;
        do {
            System.out.println("Chọn hành động" +
                    "\n1. Tìm kiếm nhân viên bằng ID" +
                    "\n2. Tìm kiếm nhân viên bằng tên");
            String choose = Main.inputScanner().nextLine();
            switch (choose) {
                case "1": {
                    System.out.println("Nhập ID: ");
                    number = Main.inputScanner().nextInt();
                    for (Integer i : keys) {
                        if (i == number) {
                            check1 = false;
                        }
                    }
                    break;
                }
                case "2": {
                    EmployeesFile.employeeFile();
                    MainController.showMenu();
                    break;
                }
            }
        }
        while (check1);
        Employee employee = employeeMaps.get(number);
        System.out.println(employee.toString());
    }
}