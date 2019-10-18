package ru.itpark.model;

public class TurnOnTariff extends AbstractTariff {
    private int internet;
    private int minute;
    private String additionOne;
    private String additionTwo;
    private String cashBack;
    private int sms;

    public TurnOnTariff(int id, String name, int price, String paymentPeriod, String choose, String moreDetails, int internet, int minute, String additionOne, String additionTwo, String cashBack, int sms) {
        super(id, name, price, paymentPeriod, choose, moreDetails);
        this.internet = internet;
        this.minute = minute;
        this.additionOne = additionOne;
        this.additionTwo = additionTwo;
        this.cashBack = cashBack;
        this.sms = sms;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getAdditionOne() {
        return additionOne;
    }

    public void setAdditionOne(String additionOne) {
        this.additionOne = additionOne;
    }

    public String getAdditionTwo() {
        return additionTwo;
    }

    public void setAdditionTwo(String additionTwo) {
        this.additionTwo = additionTwo;
    }

    public String getCashBack() {
        return cashBack;
    }

    public void setCashBack(String cashBack) {
        this.cashBack = cashBack;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        String result = super.getName();
        String newLine = "\n";
        result = result + newLine + minute + " минут" + newLine;
        if (internet > 0) {
            result = result + internet + " ГБ" + newLine;
        } else {
            result = result + "Безлимитный интернет" + newLine;
        }
        if (sms > 0) {
            result = result + sms + " SMS" + newLine;
        }
        if (additionOne != null) {
            result = result + additionOne + newLine;
        }
        if (cashBack != null) {
            result = result + cashBack + newLine;
        }
        if (additionTwo != null) {
            result = result + additionTwo + newLine;
        }

        result = result + super.getPrice() + " Р" + super.getPaymentPeriod() + newLine + super.getChoose() + newLine + super.getMoreDetails() + newLine;
        return result;
    }
}
