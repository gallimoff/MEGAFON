package ru.itpark.model;

public class TariffForDevice extends AbstractTariff {
    private String internet;
    private String description;
    private String addition;

    public TariffForDevice(int id, String name, int price, String paymentPeriod, String choose, String moreDetails, String internet, String description, String addition) {
        super(id, name, price, paymentPeriod, choose, moreDetails);
        this.internet = internet;
        this.description = description;
        this.addition = addition;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        result = result + newLine + description + newLine + internet + newLine + super.getPrice() + " Р";
        if (super.getPrice() == 0) {
            result = result + super.getPaymentPeriod();
        }
        result = result + newLine + super.getChoose() + newLine + super.getMoreDetails() + newLine;
        return result;
    }
}

