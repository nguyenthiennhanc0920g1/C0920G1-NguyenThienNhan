package case_study.models;

import java.util.Scanner;

public class Room extends AbstractService {
    private static int count = 1;
    private String bonusServiceFree;

    public Room() {
    }

    public Room(String id, String nameService, double areaUsing, double payRent, int peopleCapacity, String typeRent, String bonusServiceFree) {
        super(id, nameService, areaUsing, payRent, peopleCapacity, typeRent);
        this.bonusServiceFree = bonusServiceFree;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Room.count = count;
    }

    public String getBonusServiceFree() {
        return bonusServiceFree;
    }

    public void setBonusServiceFree(String bonusServiceFree) {
        this.bonusServiceFree = bonusServiceFree;
    }

    @Override
    public String toString() {
        super.toString();
        return "room{" +
                "bonusServiceFree='" + bonusServiceFree + '\'' +
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
        System.out.println("Enter bonus service free: ");
        String bonusServiceFree = input.nextLine();
        Room room = new Room(id, nameService, areaUsing, payRent, peopleCapacity, typeRent, bonusServiceFree);
        getArrayRoom().add(room);
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
