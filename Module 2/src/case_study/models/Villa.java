package case_study.models;

import java.util.Scanner;

public class Villa extends AbstractService {
    private static int count = 1;
    private String typeRoomOfVilla;
    private String serviceOtherOfVilla;
    private int numberFloorOfVilla;
    private double areaPool;

    public Villa() {
        super();
    }

    public Villa(String id, String nameService, double areaUsing, double payRent, int peopleCapacity, String typeRent, String typeRoom, String serviceOther, int numberFloor, double areaPool) {
        super(id, nameService, areaUsing, payRent, peopleCapacity, typeRent);
        this.typeRoomOfVilla = typeRoom;
        this.serviceOtherOfVilla = serviceOther;
        this.numberFloorOfVilla = numberFloor;
        this.areaPool = areaPool;
    }

    public static int getCount() {
        return count++;
    }

    public static void setCount(int count) {
        Villa.count = count;
    }

    public String getTypeRoom() {
        return typeRoomOfVilla;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoomOfVilla = typeRoom;
    }

    public String getServiceOtherOfVilla() {
        return serviceOtherOfVilla;
    }

    public void setServiceOtherOfVilla(String serviceOtherOfVilla) {
        this.serviceOtherOfVilla = serviceOtherOfVilla;
    }

    public int getNumberFloor() {
        return numberFloorOfVilla;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloorOfVilla = numberFloor;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        super.toString();
        return "villa{" +
                "typeRoom='" + typeRoomOfVilla + '\'' +
                ", serviceOther='" + serviceOtherOfVilla + '\'' +
                ", numberFloor=" + numberFloorOfVilla +
                ", areaPool=" + areaPool +
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
        System.out.println("Enter area pool: ");
        double areaPool = input.nextDouble();
        System.out.println("Enter number of floor: ");
        int numberFloor = input.nextInt();

        Villa villa = new Villa(id, nameService, areaUsing, payRent, peopleCapacity, typeRent, typeRoom, serviceOther, numberFloor, areaPool);
        getArrayVilla().add(villa);

    }

    @Override
    public void editService() {
        Scanner input = new Scanner(System.in);

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
