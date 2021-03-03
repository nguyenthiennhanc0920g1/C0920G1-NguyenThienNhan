public class Contracts {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int idEmployee = 1 + (int) (Math.random() * ((200 - 1) + 1));
            int idCustomer = 1 + (int) (Math.random() * ((200 - 1) + 1));
            int idService = 1 + (int) (Math.random() * ((11 - 1) + 1));
            int tienDatCoc = 1 + (int) (Math.random() * ((10 - 1) + 1));
            int namStart = 2020;
            int thangStart = 1 + (int) (Math.random() * ((5 - 1) + 1));
            int ngayStart = 10 + (int) (Math.random() * ((28 - 10) + 1));
            int namEnd = 2020;
            int thangEnd = 6 + (int) (Math.random() * ((9 - 6) + 1));
            int ngayEnd = 10 + (int) (Math.random() * ((28 - 10) + 1));
            System.out.println("(contracts.id_contract, " + idEmployee + ", " + idCustomer + ", " + idService + ", '" +
                    namStart + "-0" + thangStart + '-' + ngayStart + "', '" +
                    namEnd + "-0" + thangEnd + '-' + ngayEnd + "', " + tienDatCoc + "00000, " + tienDatCoc + "00000),");
        }
    }
}
