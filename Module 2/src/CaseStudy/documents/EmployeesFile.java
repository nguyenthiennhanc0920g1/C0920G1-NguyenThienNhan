package CaseStudy.documents;

import CaseStudy.common.ReadWriteFile;
import CaseStudy.models.Employee;
import CaseStudy.view.Main;

import java.util.Stack;

public class EmployeesFile {
    public static void employeeFile() {
        Boolean check = true;
        System.out.println("Nhập tên nhân viên cần tìm!");
        String checkEmployee = Main.inputScanner().nextLine();
        Stack<Employee> employeeStacks = ReadWriteFile.readFileEmployeeStack();
        for (Employee employee : employeeStacks) {
            if (employeeStacks.isEmpty()) {
                System.out.println("Không có hồ sơ nào trong stack ");
                break;
            } else if (checkEmployee.equals(employee.getName())) {
                System.out.println("Tìm thấy nhân viên trong stack");
                System.out.println("Name Employee: " + employee.getName() +
                        "\n Address :" + employee.getAddress() +
                        "\n ID :" + employee.getDateOfBirth());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy nhân viên trong danh sách!");
        }
    }
}
