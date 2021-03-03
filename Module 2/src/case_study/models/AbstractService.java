package case_study.models;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractService {
    private static List<Villa> arrayVilla = new ArrayList<>();
    private static List<House> arrayHouse = new ArrayList<>();
    private static List<Room> arrayRoom = new ArrayList<>();
    private String id;
    private String nameService;
    private double areaUsing;
    private double payRent;
    private int peopleCapacity;
    private String typeRent;

    public AbstractService(String id, String nameService, double areaUsing, double payRent, int peopleCapacity, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsing = areaUsing;
        this.payRent = payRent;
        this.peopleCapacity = peopleCapacity;
        this.typeRent = typeRent;
    }

    public AbstractService() {

    }

    public static List<Villa> getArrayVilla() {
        return arrayVilla;
    }

    public static void setArrayVilla(List<Villa> arrayVilla) {
        AbstractService.arrayVilla = arrayVilla;
    }

    public static List<House> getArrayHouse() {
        return arrayHouse;
    }

    public static void setArrayHouse(List<House> arrayHouse) {
        AbstractService.arrayHouse = arrayHouse;
    }

    public static List<Room> getArrayRoom() {
        return arrayRoom;
    }

    public static void setArrayRoom(List<Room> arrayRoom) {
        AbstractService.arrayRoom = arrayRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(double areaUsing) {
        this.areaUsing = areaUsing;
    }

    public double getPayRent() {
        return payRent;
    }

    public void setPayRent(double payRent) {
        this.payRent = payRent;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "abstractService{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsing=" + areaUsing +
                ", payRent=" + payRent +
                ", peopleCapacity=" + peopleCapacity +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    public abstract void addNewService();

    public abstract void editService();

    public abstract void deleteService();

    public abstract void searchService();

    public abstract void sortService();

    public abstract void showInfo();
}
