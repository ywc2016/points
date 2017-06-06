package timeSeries;

import db.MemberNsDao;
import po.MemberNs;
import utils.DateAndFrequency;
import utils.DateAndFrequencyList;
import utils.TimeConvert;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by ywcrm on 2017/6/6.
 */
public class MemberSeries {
    private MemberNsDao memberNsDao = new MemberNsDao();

    /**
     * 按天统计注册次数
     */
    public DateAndFrequencyList statisticsByDay() {

        DateAndFrequencyList dateAndFrequencieList = new DateAndFrequencyList();
        List<MemberNs> memberNsList = memberNsDao.findAll();
        for (MemberNs memberNs : memberNsList) {
            Date date = TimeConvert.convertStringToDate3(memberNs.getRegisterDate());
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
        dateAndFrequencieList.writeToCsv("file/member/memberTimeSeries.csv");
        return dateAndFrequencieList;
    }

    public static void main(String[] args) {
        MemberSeries memberSeries = new MemberSeries();
        memberSeries.statisticsByDay();
    }
}
