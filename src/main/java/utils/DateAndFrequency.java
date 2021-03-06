package utils;

import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class DateAndFrequency implements Comparable<DateAndFrequency> {

    private Date date;
    private int frequency = 1;

    public DateAndFrequency(Date date) {
        super();
        this.date = date;
        this.frequency = 1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    public int compareTo(DateAndFrequency dateAndFrequency) {
        return this.getDate().compareTo(dateAndFrequency.getDate());
    }
}
