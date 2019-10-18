package ru.itpark.model;

public abstract class AbstractTariff {
    private int id;
    private String name;
    private int price;
    private String paymentPeriod;
    private String choose;
    private String moreDetails;

    public AbstractTariff(int id, String name, int price, String paymentPeriod, String choose, String moreDetails) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.paymentPeriod = paymentPeriod;
        this.choose = choose;
        this.moreDetails = moreDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }
}
