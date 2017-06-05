package timeSeries;

import org.apache.commons.io.FileUtils;
import utils.TimeConvert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class DateAndFrequencyList extends ArrayList<DateAndFrequency> {

    public DateAndFrequency findByDate(Date date) {
        for (DateAndFrequency dateAndFrequency : this) {
            if (date.equals(dateAndFrequency.getDate())) {
                return dateAndFrequency;
            }
        }
        return null;
    }

    public void show() {
        for (DateAndFrequency dateAndFrequency : this) {
            System.out.println("date:" + TimeConvert
                    .convertDateToString(dateAndFrequency.getDate())
                    + ", frequency:" + dateAndFrequency.getFrequency());
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

        for (DateAndFrequency dateAndFrequency : this) {
            try {
                FileUtils.writeStringToFile(file, TimeConvert.convertDateToString(dateAndFrequency.getDate())
                        + "," + dateAndFrequency.getFrequency() + "\r\n", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕.");
    }
}
