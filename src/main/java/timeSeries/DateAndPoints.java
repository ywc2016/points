package timeSeries;

import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
class DateAndPoints implements Comparable<DateAndPoints> {

    private Date date;
    private int points = 0;

    public DateAndPoints(Date date) {
        super();
        this.date = date;
        this.points = 0;
    }

    public DateAndPoints(Date date, int points) {
        super();
        this.date = date;
        this.points = points;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int compareTo(DateAndPoints dateAndFrequency) {
        return this.getDate().compareTo(dateAndFrequency.getDate());
    }
}
