package _17_io_binary.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String nameProduct;
    private String madeIn;
    private double priceProduct;
    private String otherInformation;

    public Product() {
    }

    public Product(String id, String nameProduct, String madeIn, double priceProduct, String otherInformation) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.madeIn = madeIn;
        this.priceProduct = priceProduct;
        this.otherInformation = otherInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", priceProduct=" + priceProduct +
                ", otherInformation='" + otherInformation + '\'' +
                '}';
    }
}
