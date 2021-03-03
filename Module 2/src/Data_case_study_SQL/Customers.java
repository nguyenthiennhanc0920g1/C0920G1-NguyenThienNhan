package Data_case_study_SQL;

public class Customers {
    public static void main(String[] args) {
        //Ho va Ten
        String[] arrHo = {"Nguyễn", "Trần", "Lê", "Hồ", "Phạm"};
        String[] arrTenLot = {"Văn", "Thị", "Thiện", "Thanh", "Dương"};
        String[] arrTen = {"Nhân", "Trang", "Anh", "Bảo", "Long", "Khánh", "Hiệp", "Huy", "Ly", "Tiến", "Trinh", "Phúc"};
        //Ngay sinh
        String[] arrDiaChi = {"Lê Duẩn", "Hàm Nghi", "Hoàng Hoa Thám", "Điện Biên Phủ", "Bạch Đằng", "Nguyễn Hoàng",
                "Nguyễn Văn Linh", "Hoàng Diệu", "Tôn Đức Thắng", "Hải Phòng", "Quang Trung", "Đống Đa"};
        String[] arrThanhPho = {"Đà Nẵng", "Quảng Nam", "Huế", "Vinh", "Quảng Ngãi", "Quảng Trị", "Hà Nội", "HCM"};
        String[] arrGender = {"Nam", "Nữ", "LGBT"};
        //email
        //address
        for (int i = 0; i < 100 ; i++) {
            int namSinh = 1960 + (int) (Math.random() * ((2018 - 1960) + 1));
            int thangSinh = 1 + (int) (Math.random() * ((9 - 1) + 1));
            int ngaySinh = 10 + (int) (Math.random() * ((28 - 10) + 1));
            int soNha = 10 + (int) (Math.random() * ((200 - 10) + 1));
            //CMND
            long cmnd = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            //phone
            String ten = arrTen[0 + (int) (Math.random() * ((11 - 0) + 1))];
            long phoneNumber = 100000000 + (long) (Math.random() * ((999999999 - 100000000) + 1));
            int idTypeCustomer = 1 + (int) (Math.random() * ((5 - 1) + 1));
            System.out.println("(customer.customer_id, '" + soNha + ' ' +  arrDiaChi[0 + (int) (Math.random() * ((11 - 0) + 1))]
                    + ", " +  arrThanhPho[0 + (int) (Math.random() * ((7 - 0) + 1))] + "', '" +
                    ngaySinh + "/0" + thangSinh + '/' + namSinh + "', '" + ten +
                    "0" + i + "@gmail.com', '" + cmnd + "', '" + arrHo[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    arrTenLot[0 + (int) (Math.random() * ((4 - 0) + 1))] + ' ' +
                    ten + "', '" + "0" + phoneNumber + "', '" + arrGender[0 + (int) (Math.random() * ((2 - 0) + 1))] +
                    "', '" + idTypeCustomer +  "'),"
            );
        }
    }
}
