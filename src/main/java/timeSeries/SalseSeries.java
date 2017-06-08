package timeSeries;

import antlr.StringUtils;
import db.SalseNsDao;
import org.apache.commons.io.FileUtils;
import po.SalesNs;
import utils.DateAndAmount;
import utils.DateAndAmountList;
import utils.MerchantAndAmount;
import utils.TimeConvert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by ywcrm on 2017/6/6.
 */
public class SalseSeries {
    private SalseNsDao salseNsDao = new SalseNsDao();

    /**
     * 按天统计交易额
     */
    public void statisticsAmountByDay() {

        DateAndAmountList dateAndAmountList = new DateAndAmountList();
        List<SalesNs> salesNsList = salseNsDao.findAll();
        for (SalesNs salesNs : salesNsList) {
            Date date = TimeConvert.convertStringToDate3(salesNs.getSalesDate());
            DateAndAmount dateAndAmount = dateAndAmountList.findByDate(date);
            if (dateAndAmount != null) {//已存在该日期
                dateAndAmount.setAmount(dateAndAmount.getAmount() + Double.parseDouble(salesNs.getTotalAmt()));
            } else {//不存在该日期,新增
                dateAndAmountList.add(new DateAndAmount(date, Double.parseDouble(salesNs.getTotalAmt())));
            }
        }
//        dateAndFrequencieList.show();
        //排序
        Collections.sort(dateAndAmountList);
        //写入文件
        dateAndAmountList.writeToCsv("file/salse/salseTimeSeries.csv");
    }

    /**
     * 按月统计交易额
     */
    public void statisticsAmountByMonth() {

        DateAndAmountList dateAndAmountList = new DateAndAmountList();
        List<SalesNs> salesNsList = salseNsDao.findAll();
        for (SalesNs salesNs : salesNsList) {
            Date date = TimeConvert.convertStringToDate2(salesNs.getSalesDate());
            DateAndAmount dateAndAmount = dateAndAmountList.findByDate(date);
            if (dateAndAmount != null) {//已存在该日期
                dateAndAmount.setAmount(dateAndAmount.getAmount() + Double.parseDouble(salesNs.getTotalAmt()));
            } else {//不存在该日期,新增
                dateAndAmountList.add(new DateAndAmount(date, Double.parseDouble(salesNs.getTotalAmt())));
            }
        }
//        dateAndFrequencieList.show();
        //排序
        Collections.sort(dateAndAmountList);
        //写入文件
        dateAndAmountList.writeToCsv("file/salse/salseTimeSeries_month.csv");
    }


    /**
     * 写商品和销售额csv
     */
    public void writeMerchantAndAmount() {
        List<MerchantAndAmount> merchantAndAmountList = salseNsDao.getMerchantAndAmountList();
        Collections.sort(merchantAndAmountList);
        File file = new File("file/salse/merchant&amount.csv");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (MerchantAndAmount merchantAndAmount : merchantAndAmountList) {
            try {
                FileUtils.writeStringToFile(file, merchantAndAmount.getMerchant()
                        + "," + merchantAndAmount.getAmount() + "\r\n", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完毕!");
    }


    /**
     * 按商品(所有)和天统计销售额
     */
    public void statisticsAllAmountByMerchantAndDay() {

        List<String> merchants = getAllMerchant();
        for (String merchant : merchants) {
            if ("".equals(merchant)) {
                continue;
            }
            DateAndAmountList dateAndAmountList = new DateAndAmountList();
            List<SalesNs> salesNsList = salseNsDao.findByPropertyEqual("merchant", merchant, "String");
            for (SalesNs salesNs : salesNsList) {
                Date date = TimeConvert.convertStringToDate3(salesNs.getSalesDate());
                DateAndAmount dateAndAmount = dateAndAmountList.findByDate(date);
                if (dateAndAmount != null) {//已存在该日期
                    dateAndAmount.setAmount(dateAndAmount.getAmount() + Double.parseDouble(salesNs.getTotalAmt()));
                } else {//不存在该日期,新增
                    dateAndAmountList.add(new DateAndAmount(date, Double.parseDouble(salesNs.getTotalAmt())));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndAmountList);
            //写入文件
            dateAndAmountList.writeToCsv("file/salse/" + merchant + "/salseAmountTimeSeries_date.csv");
        }
    }


    /**
     * 按商品(销售额前20)和天统计销售额
     */
    public void statisticsAmountByMerchantAndDay() {

        List<String> merchants = getFirst20Merchant();
        for (String merchant : merchants) {
            DateAndAmountList dateAndAmountList = new DateAndAmountList();
            List<SalesNs> salesNsList = salseNsDao.findByPropertyEqual("merchant", merchant, "String");
            for (SalesNs salesNs : salesNsList) {
                Date date = TimeConvert.convertStringToDate3(salesNs.getSalesDate());
                DateAndAmount dateAndAmount = dateAndAmountList.findByDate(date);
                if (dateAndAmount != null) {//已存在该日期
                    dateAndAmount.setAmount(dateAndAmount.getAmount() + Double.parseDouble(salesNs.getTotalAmt()));
                } else {//不存在该日期,新增
                    dateAndAmountList.add(new DateAndAmount(date, Double.parseDouble(salesNs.getTotalAmt())));
                }
            }
            //dateAndFrequencieList.show();
            //排序
            Collections.sort(dateAndAmountList);
            //写入文件
            dateAndAmountList.writeToCsv("file/salse/" + merchant + "/salseAmountTimeSeries_date.csv");
        }
    }

    /**
     * 创建商品文件夹 销售额前20
     */
    public void creatMerchantDir() {
        List<MerchantAndAmount> merchantAndAmountList = salseNsDao.getMerchantAndAmountList();
        Collections.sort(merchantAndAmountList);
        for (int i = merchantAndAmountList.size() - 1, n = 0; n < 20; i--, n++) {

            File file = new File("file/salse/" + merchantAndAmountList.get(i).getMerchant());
            file.mkdir();
        }
        System.out.println("创建完毕!");
    }

    /**
     * 得到销售额前20的merchant
     *
     * @param
     */
    public List<String> getFirst20Merchant() {
        List<String> list = new ArrayList<String>();
        List<MerchantAndAmount> merchantAndAmountList = salseNsDao.getMerchantAndAmountList();
        Collections.sort(merchantAndAmountList);
        for (int i = merchantAndAmountList.size() - 1, n = 0; n < 20; i--, n++) {
            list.add(merchantAndAmountList.get(i).getMerchant());
        }
        return list;
    }

    /**
     * 得到所有商品
     *
     * @return
     */
    private List<String> getAllMerchant() {
        List<String> list = new ArrayList<String>();
        List<MerchantAndAmount> merchantAndAmountList = salseNsDao.getMerchantAndAmountList();
        Collections.sort(merchantAndAmountList);
        for (MerchantAndAmount merchantAndAmount : merchantAndAmountList) {
            list.add(merchantAndAmount.getMerchant());
        }
        return list;
    }

    public static void main(String[] args) {
        SalseSeries salseSeries = new SalseSeries();
//        salseSeries.statisticsAmountByDay();
//        salseSeries.statisticsAmountByMonth();
//        salseSeries.writeMerchantAndAmount();
//        salseSeries.creatMerchantDir();
//        salseSeries.statisticsAmountByMerchantAndDay();
        salseSeries.statisticsAllAmountByMerchantAndDay();
    }
}
