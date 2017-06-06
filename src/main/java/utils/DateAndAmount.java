package utils;

import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class DateAndAmount implements Comparable<DateAndAmount> {

    private Date date;
    private double amount = 0d;

    public DateAndAmount(Date date) {
        super();
        this.date = date;
        this.amount = 0d;
    }

    public DateAndAmount(Date date, double amount) {
        super();
        this.date = date;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int compareTo(DateAndAmount dateAndAmount) {
        return this.getDate().compareTo(dateAndAmount.getDate());
    }
}
