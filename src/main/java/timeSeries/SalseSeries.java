package timeSeries;

import db.SalseNsDao;
import po.SalesNs;
import utils.*;

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

    public static void main(String[] args) {
        SalseSeries salseSeries = new SalseSeries();
        salseSeries.statisticsAmountByDay();
    }
}
