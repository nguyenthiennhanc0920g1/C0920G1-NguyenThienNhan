package case_study.models;

import java.util.Scanner;

public class House extends AbstractService {
    private static int count = 1;
    private String typeRoomOfHouse;
    private String serviceOtherOfHouse;
    private int numberFloorOfHouse;

    public House() {
    }

    public House(String id, String nameService, double areaUsing, double payRent, int peopleCapacity, String typeRent, String typeRoom, String serviceOther, int numberFloor) {
        super(id, nameService, areaUsing, payRent, peopleCapacity, typeRent);
        this.typeRoomOfHouse = typeRoom;
        this.serviceOtherOfHouse = serviceOther;
        this.numberFloorOfHouse = numberFloor;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        House.count = count;
    }

    public String getTypeRoom() {
        return typeRoomOfHouse;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoomOfHouse = typeRoom;
    }

    public String getServiceOtherOfHouse() {
        return serviceOtherOfHouse;
    }

    public void setServiceOtherOfHouse(String serviceOtherOfHouse) {
        this.serviceOtherOfHouse = serviceOtherOfHouse;
    }

    public int getNumberFloorOfHouse() {
        return numberFloorOfHouse;
    }

    public void setNumberFloorOfHouse(int numberFloorOfHouse) {
        this.numberFloorOfHouse = numberFloorOfHouse;
    }

    @Override
    public String toString() {
        super.toString();
        return "house{" +
                "typeRoom='" + typeRoomOfHouse + '\'' +
                ", serviceOther='" + serviceOtherOfHouse + '\'' +
                ", numberFloor=" + numberFloorOfHouse +
                '}';
    }

    @Override
    public void addNewService() {
        String id = String.valueOf(getCount());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name service: ");
        String nameService = input.nextLine();
        System.out.println("Enter area using: ");
        double areaUsing = input.nextDouble();
        System.out.println("Enter pay for rent: ");
        double payRent = input.nextDouble();
        System.out.println("Enter capacity of people: ");
        int peopleCapacity = input.nextInt();
        System.out.println("Enter type of rent: ");
        String typeRent = input.nextLine();
        System.out.println("Enter type of room: ");
        String typeRoom = input.nextLine();
        System.out.println("Enter service other: ");
        String serviceOther = input.nextLine();
        System.out.println("Enter number of floor: ");
        int numberFloor = input.nextInt();

        House house = new House(id, nameService, areaUsing, payRent, peopleCapacity, typeRent, typeRoom, serviceOther, numberFloor);
        getArrayHouse().add(house);
    }

    @Override
    public void editService() {

    }

    @Override
    public void deleteService() {

    }

    @Override
    public void searchService() {

    }

    @Override
    public void sortService() {

    }

    @Override
    public void showInfo() {
        this.toString();
    }
}
