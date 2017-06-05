package timeSeries;

import db.RedeemNsDao;
import org.apache.commons.io.FileUtils;
import po.RedeemNs;
import utils.TimeConvert;

import java.io.File;
import java.io.IOException;
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
    public DateAndFrequencyList statisticsByDay() {

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
        //写入文件
        dateAndFrequencieList.writeToCsv("file/redeemTimeSeries.csv");
        return dateAndFrequencieList;
    }

    public void writeMerchantAndRedeemFrequency() {
        List<MerchantAndFrequency> merchantAndFrequencyList = redeemDao.findMerchantType();
        File file = new File("file/merchant_redeemFrequency.csv");
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
    }

    public static void main(String[] args) {
        RedeemSeries redeemSeries = new RedeemSeries();
//        redeemSeries.statisticsByDay();
        redeemSeries.writeMerchantAndRedeemFrequency();
    }

}

