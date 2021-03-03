package case_study.models;

public class BonusService {
    private String nameBonusService;
    private int unitBonusService;
    private double priceBonusService;

    public BonusService() {
    }

    public BonusService(String nameBonusService, int unitBonusService, double priceBonusService) {
        this.nameBonusService = nameBonusService;
        this.unitBonusService = unitBonusService;
        this.priceBonusService = priceBonusService;
    }

    public String getNameBonusService() {
        return nameBonusService;
    }

    public void setNameBonusService(String nameBonusService) {
        this.nameBonusService = nameBonusService;
    }

    public int getUnitBonusService() {
        return unitBonusService;
    }

    public void setUnitBonusService(int unitBonusService) {
        this.unitBonusService = unitBonusService;
    }

    public double getPriceBonusService() {
        return priceBonusService;
    }

    public void setPriceBonusService(double priceBonusService) {
        this.priceBonusService = priceBonusService;
    }

    public void massage() {

    }

    public void karaoke() {

    }

    public void oderFood() {

    }

    public void oderDrink() {

    }

    public void bookCar() {

    }

    @Override
    public String toString() {
        return "bonusService{" +
                "nameBonusService='" + nameBonusService + '\'' +
                ", unitBonusService=" + unitBonusService +
                ", priceBonusService=" + priceBonusService +
                '}';
    }

    public void showInfo() {
        this.toString();
    }
}
