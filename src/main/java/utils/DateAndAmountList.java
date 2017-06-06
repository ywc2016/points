package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class DateAndAmountList extends ArrayList<DateAndAmount> {

    public DateAndAmount findByDate(Date date) {
        for (DateAndAmount dateAndAmount : this) {
            if (date.equals(dateAndAmount.getDate())) {
                return dateAndAmount;
            }
        }
        return null;
    }

    public void show() {
        for (DateAndAmount dateAndAmount : this) {
            System.out.println("date:" + TimeConvert
                    .convertDateToString(dateAndAmount.getDate())
                    + ", amount:" + dateAndAmount.getAmount());
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

        for (DateAndAmount dateAndAmount : this) {
            try {
                FileUtils.writeStringToFile(file, TimeConvert.convertDateToString(dateAndAmount.getDate())
                        + "," + dateAndAmount.getAmount() + "\r\n", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕.");
    }

}
