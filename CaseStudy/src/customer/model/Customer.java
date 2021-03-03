package customer.model;

public class Customer {
    private String idCustomer;
    private String customerTypeId;
    private String nameCustomer;
    private String birthdayCustomer;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(String idCustomer, String customerTypeId, String nameCustomer, String birthdayCustomer,
                    String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer) {
        this.idCustomer = idCustomer;
        this.customerTypeId = customerTypeId;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerTypeId=" + customerTypeId +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", birthdayCustomer=" + birthdayCustomer +
                ", idCardCustomer='" + idCardCustomer + '\'' +
                ", phoneCustomer='" + phoneCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
