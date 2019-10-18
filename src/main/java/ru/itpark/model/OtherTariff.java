package ru.itpark.model;

public class OtherTariff extends AbstractTariff {
    private String description;
    private String internet;
    private String addition;

    public OtherTariff(int id, String name, int price, String paymentPeriod, String choose, String moreDetails, String description, String internet, String addition) {
        super(id, name, price, paymentPeriod, choose, moreDetails);
        this.description = description;
        this.internet = internet;
        this.addition = addition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    @Override
    public String toString() {
        String result = super.getName();
        String newLine = "\n";
        result = result + newLine + description + newLine + internet + newLine;
        result = result + super.getPrice() + " Р";
        if (super.getPaymentPeriod() != null) {
            result = result + super.getPaymentPeriod();
        }
        if (super.getChoose() != null){
            result = result + newLine + super.getChoose();
        }
        result = result + newLine + super.getMoreDetails() + newLine;
        return result;
    }
}

