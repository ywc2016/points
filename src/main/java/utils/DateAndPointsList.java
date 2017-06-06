package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class DateAndPointsList extends ArrayList<DateAndPoints> {

    public DateAndPoints findByDate(Date date) {
        for (DateAndPoints dateAndPoints : this) {
            if (date.equals(dateAndPoints.getDate())) {
                return dateAndPoints;
            }
        }
        return null;
    }

    public void show() {
        for (DateAndPoints dateAndPoints : this) {
            System.out.println("date:" + TimeConvert
                    .convertDateToString(dateAndPoints.getDate())
                    + ", points:" + dateAndPoints.getPoints());
        }
    }

    public void writeToCsv(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + "不存在.将创建.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(file.getAbsolutePath() + "已存在.将重新创建.");
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (DateAndPoints dateAndPoints : this) {
            try {
                FileUtils.writeStringToFile(file, TimeConvert.convertDateToString(dateAndPoints.getDate())
                        + "," + dateAndPoints.getPoints() + "\r\n", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕.");
    }

}
