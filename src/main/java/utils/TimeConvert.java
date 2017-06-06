package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class TimeConvert {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
    private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");


    public static String convertDateToString(Date date) {
        return simpleDateFormat2.format(date);
    }

    /**
     * 将如"2013-08-1720:03:42"的字符串转成Date对象
     *
     * @param string
     * @return
     */
    public static Date convertStringToDate(String string) {
        try {
            return simpleDateFormat.parse(string);
        } catch (ParseException e) {
            System.out.println("转换日期格式失败！ " + string);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将如"2013-08-1720:03:42"的字符串转成Date对象,且值为"2013-08-17 00:00:00"
     *
     * @param string
     * @return
     */
    public static Date convertStringToDate3(String string) {
        try {
            Date date = simpleDateFormat.parse(string);
            return new Date(date.getYear(), date.getMonth(), date.getDate());
        } catch (ParseException e) {
            System.out.println("转换日期格式失败！ " + string);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将如"2013-08-1720:03:42"的字符串转成Date对象,且值为"2013-08-01 00:00:00"
     *
     * @param string
     * @return
     */
    public static Date convertStringToDate2(String string) {
        try {
            Date date = simpleDateFormat.parse(string);
            return new Date(date.getYear(), date.getMonth(), 1);
        } catch (ParseException e) {
            System.out.println("转换日期格式失败！ " + string);
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//        Date date = TimeConvert.convertStringToDate("2013-08-1720:03:42");
//        System.out.println(date);
//        TimeConvert.convertStringToDate3("2013-08-1720:03:42");
        Date date = TimeConvert.convertStringToDate2("2013-08-1720:03:42");
    }
}
