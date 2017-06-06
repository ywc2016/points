package timeSeries;

import db.RedeemNsDao;
import org.apache.commons.io.FileUtils;
import po.RedeemNs;
import utils.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class RedeemSeries {
    private RedeemNsDao redeemDao = new RedeemNsDao();

    /**
     * 按天统计兑换次数
     */
    public void statisticsByDay() {

        DateAndFrequencyList dateAndFrequencieList = new DateAndFrequencyList();
        List<RedeemNs> redeemList = redeemDao.findAll();
        for (RedeemNs redeemNs : redeemList) {
            Date date = TimeConvert.convertStringToDate3(redeemNs.getRequestDate());
            DateAndFrequency dateAndFrequency = dateAndFrequencieList.findByDate(date);
            if (dateAndFrequency != null) {//已存在该日期
                dateAndFrequency.setFrequency(dateAndFrequency.getFrequency() + 1);
            } else {//不存在该日期,新增
                dateAndFrequencieList.add(new DateAndFrequency(date));
            }
        }
//        dateAndFrequencieList.show();
        //排序
        Collections.sort(dateAndFrequencieList);
        //写入文件
        dateAndFrequencieList.writeToCsv("file/general/redeemTimeSeries.csv");
    }


    /**
     * 按天统计兑换积分数
     */
    public void statisticsPointsByDay() {

        DateAndPointsList dateAndPointsList = new DateAndPointsList();
        List<RedeemNs> redeemList = redeemDao.findAll();
        for (RedeemNs redeemNs : redeemList) {
            Date date = TimeConvert.convertStringToDate3(redeemNs.getRequestDate());
            DateAndPoints dateAndPoints = dateAndPointsList.findByDate(date);
            if (dateAndPoints != null) {//已存在该日期
                dateAndPoints.setPoints(dateAndPoints.getPoints() + Integer.parseInt(redeemNs.getRedeemPoint()));
            } else {//不存在该日期,新增
                dateAndPointsList.add(new DateAndPoints(date, Integer.parseInt(redeemNs.getRedeemPoint())));
            }
        }
//        dateAndFrequencieList.show();
        //排序
        Collections.sort(dateAndPointsList);
        //写入文件
        dateAndPointsList.writeToCsv("file/general/redeemPointsTimeSeries.csv");
    }

    /**
     * 按商品(>=50)和天统计兑换次数
     */
    public void statisticsByMerchantAndDay() {

        File file = new File("file/merchant");
        String[] merchants = file.list();
        for (String merchant : merchants) {
            DateAndFrequencyList dateAndFrequencieList = new DateAndFrequencyList();
            List<RedeemNs> redeemList = redeemDao.findByPropertyEqual("merchant", merchant, "String");
            for (RedeemNs redeemNs : redeemList) {
                Date date = TimeConvert.convertStringToDate3(redeemNs.getRequestDate());
                DateAndFrequency dateAndFrequency = dateAndFrequencieList.findByDate(date);
                if (dateAndFrequency != null) {//已存在该日期
                    dateAndFrequency.setFrequency(dateAndFrequency.getFrequency() + 1);
                } else {//不存在该日期,新增
                    dateAndFrequencieList.add(new DateAndFrequency(date));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndFrequencieList);
            //写入文件
            dateAndFrequencieList.writeToCsv("file/merchant/" + merchant + "/redeemTimeSeries_date.csv");
        }
    }

    /**
     * 按商品(>=50)和天统计兑换积分数
     */
    public void statisticsPointsByMerchantAndDay() {

        File file = new File("file/merchant");
        String[] merchants = file.list();
        for (String merchant : merchants) {
            DateAndPointsList dateAndPointsList = new DateAndPointsList();
            List<RedeemNs> redeemList = redeemDao.findByPropertyEqual("merchant", merchant, "String");
            for (RedeemNs redeemNs : redeemList) {
                Date date = TimeConvert.convertStringToDate3(redeemNs.getRequestDate());
                DateAndPoints dateAndPoints = dateAndPointsList.findByDate(date);
                if (dateAndPoints != null) {//已存在该日期
                    dateAndPoints.setPoints(dateAndPoints.getPoints() + Integer.parseInt(redeemNs.getRedeemPoint()));
                } else {//不存在该日期,新增
                    dateAndPointsList.add(new DateAndPoints(date, Integer.parseInt(redeemNs.getRedeemPoint())));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndPointsList);
            //写入文件
            dateAndPointsList.writeToCsv("file/merchant/" + merchant + "/redeemPointsTimeSeries_date.csv");
        }
    }

    /**
     * 按商品(>=50)和月统计兑换次数
     */
    public void statisticsByMerchantAndMonth() {


        File file = new File("file/merchant");
        String[] merchants = file.list();
        for (String merchant : merchants) {
            DateAndFrequencyList dateAndFrequencieList = new DateAndFrequencyList();
            List<RedeemNs> redeemList = redeemDao.findByPropertyEqual("merchant", merchant, "String");
            for (RedeemNs redeemNs : redeemList) {
                Date date = TimeConvert.convertStringToDate2(redeemNs.getRequestDate());
                DateAndFrequency dateAndFrequency = dateAndFrequencieList.findByDate(date);
                if (dateAndFrequency != null) {//已存在该日期
                    dateAndFrequency.setFrequency(dateAndFrequency.getFrequency() + 1);
                } else {//不存在该日期,新增
                    dateAndFrequencieList.add(new DateAndFrequency(date));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndFrequencieList);
            //写入文件
            dateAndFrequencieList.writeToCsv("file/merchant/" + merchant + "/redeemTimeSeries_month.csv");
        }
    }

    /**
     * 按商品(>=50)和月统计兑换积分数
     */
    public void statisticsPointsByMerchantAndMonth() {

        File file = new File("file/merchant");
        String[] merchants = file.list();
        for (String merchant : merchants) {
            DateAndPointsList dateAndPointsList = new DateAndPointsList();
            List<RedeemNs> redeemList = redeemDao.findByPropertyEqual("merchant", merchant, "String");
            for (RedeemNs redeemNs : redeemList) {
                Date date = TimeConvert.convertStringToDate2(redeemNs.getRequestDate());
                DateAndPoints dateAndPoints = dateAndPointsList.findByDate(date);
                if (dateAndPoints != null) {//已存在该日期
                    dateAndPoints.setPoints(dateAndPoints.getPoints() + Integer.parseInt(redeemNs.getRedeemPoint()));
                } else {//不存在该日期,新增
                    dateAndPointsList.add(new DateAndPoints(date, Integer.parseInt(redeemNs.getRedeemPoint())));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndPointsList);
            //写入文件
            dateAndPointsList.writeToCsv("file/merchant/" + merchant + "/redeemPointsTimeSeries_month.csv");
        }
    }

    /**
     * 写商品和兑换次数的csv文件
     */
    public void writeMerchantAndRedeemFrequency() {
        List<MerchantAndFrequency> merchantAndFrequencyList = redeemDao.findMerchantType();
        File file = new File("file/general/merchant_redeemFrequency.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (MerchantAndFrequency merchantAndFrequency : merchantAndFrequencyList) {
            try {
                FileUtils.writeStringToFile(file, merchantAndFrequency.getMerchant()
                        + "," + merchantAndFrequency.getFrequncy() + "\r\n", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕!");
    }

    /**
     * 写商品和兑换次数(>=50)的csv文件
     */
    public void writeMerchantAndRedeemFrequencyBiggerThan50() {
        List<MerchantAndFrequency> merchantAndFrequencyList = redeemDao.findMerchantType();
        File file = new File("file/general/merchant_redeemFrequency_gt50.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (MerchantAndFrequency merchantAndFrequency : merchantAndFrequencyList) {
            try {
                if (merchantAndFrequency.getFrequncy() >= 50) {
                    FileUtils.writeStringToFile(file, merchantAndFrequency.getMerchant()
                            + "," + merchantAndFrequency.getFrequncy() + "\r\n", true);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕!");
    }

    /**
     * 创建商品文件夹
     */
    public void creatMerchantDir() {
        List<MerchantAndFrequency> merchantAndFrequencyList = redeemDao.findMerchantType();

        for (MerchantAndFrequency merchantAndFrequency : merchantAndFrequencyList) {
            if (merchantAndFrequency.getFrequncy() >= 50) {
                File file = new File("file/merchant/" + merchantAndFrequency.getMerchant());
                file.mkdir();
            }
        }
        System.out.println("写入完毕!");
    }

    public static void main(String[] args) {
        RedeemSeries redeemSeries = new RedeemSeries();
        redeemSeries.statisticsByDay();
//        redeemSeries.writeMerchantAndRedeemFrequency();
//        redeemSeries.writeMerchantAndRedeemFrequencyBiggerThan50();
//        redeemSeries.creatMerchantDir();
//        redeemSeries.statisticsByMerchantAndDay();
//        redeemSeries.statisticsByMerchantAndMonth();
//        redeemSeries.statisticsPointsByMerchantAndDay();
//        redeemSeries.statisticsPointsByMerchantAndMonth();
        redeemSeries.statisticsPointsByDay();
    }


}

