package Data_case_study_SQL;

public class Employees {
    public static void main(String[] args) {
        //Ho va Ten
        String[] arrHo = {"Nguyen", "Tran", "Le", "Ho", "Pham"};
        String[] arrTenLot = {"Van", "Thi", "Thien", "Thanh", "Duong"};
        String[] arrTen = {"Nhan", "Trang", "Anh", "Bao", "Long", "Khanh", "Hiep", "Huy", "Ly", "Tien", "Trinh", "Phuc"};
        //Ngay sinh
        String[] arrDiaChi = {"Le Duan", "Ham Nghi", "Hoang Hoa Tham", "Dien Bien Phu", "Bach Dang", "Nguyen Hoang",
                "Nguyen Van Linh", "Hoang Dieu", "Ton Duc Thang", "Hai Phong", "Quang Trung", "Dong Da"};
        String[] arrThanhPho = {"Da Nang", "Quang Nam", "Hue", "Ho Chi Minh", "Ha Noi"};
        //email
        //address
        //(employees.id_employee, name, id_position(1-6), id_level(1-4), id_department(1-4), birthday, cmnd, salary,
//        phone, email, dia chi);
        for (int i = 0; i < 200; i++) {
            int namSinh = 1960 + (int) (Math.random() * ((2002 - 1960) + 1));
            int thangSinh = 1 + (int) (Math.random() * ((9 - 1) + 1));
            int ngaySinh = 10 + (int) (Math.random() * ((28 - 10) + 1));
            //CMND
            long cmnd = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            //salary
            int salary = 10 + (int) (Math.random() * ((290 - 10) + 1));
            //phone
            String ten = arrTen[0 + (int) (Math.random() * ((11 - 0) + 1))];
            long phoneNumber = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            int idPosition = 1 + (int) (Math.random() * ((6 - 1) + 1));
            int idLevel = 1 + (int) (Math.random() * ((4 - 1) + 1));
            int idDepartment = 1 + (int) (Math.random() * ((4 - 1) + 1));
            System.out.println("(employees.id_employee, '" + arrHo[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    arrTenLot[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    ten + "', " + idPosition + ", " + idLevel + ", " +
                    idDepartment + ", '" + namSinh + "-0" + thangSinh + '-' + ngaySinh + "', '" + cmnd + "', '" +
                    salary + "00000', '0" + phoneNumber + "', '" + ten +
                    "0" + i + "@gmali.com', '" + salary + ' ' +
                    arrDiaChi[0 + (int) (Math.random() * ((11 - 0) + 1))] + ", " +
                    arrThanhPho[0 + (int) (Math.random() * ((4 - 0) + 1))] + "'),"
            );
        }
    }
}
