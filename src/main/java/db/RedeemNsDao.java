package db;

import org.hibernate.Session;
import org.hibernate.query.Query;
import po.RedeemNs;
import timeSeries.MerchantAndFrequency;
import timeSeries.MerchantAndFrequencyList;

import java.util.List;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class RedeemNsDao extends BaseDao<RedeemNs> {

    public MerchantAndFrequencyList findMerchantType() {
        Session session = null;
        try {
            String queryString = "FROM " + typeClass().getCanonicalName();
            session = Client.getSessionFactory().openSession();
            Query query = session.createQuery(queryString);
            List<RedeemNs> pojos = query.list();
//            List<String> merchantList = new ArrayList<String>();
//            for (RedeemNs redeemNs : pojos) {
//                merchantList.add(redeemNs.getMerchant());
//            }
//            List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(merchantList));
            MerchantAndFrequencyList merchantAndFrequencyList = new MerchantAndFrequencyList();
            for (RedeemNs redeemNs : pojos) {
                if (redeemNs.getMerchant() == null) {
//                    System.out.println(redeemNs);
                    continue;
                }
                MerchantAndFrequency merchantAndFrequency = merchantAndFrequencyList.findByMerchant(redeemNs.getMerchant());
                if (merchantAndFrequency != null) {
                    merchantAndFrequency.setFrequncy(merchantAndFrequency.getFrequncy() + 1);
                } else {
                    merchantAndFrequencyList.add(new MerchantAndFrequency(redeemNs.getMerchant()));
                }
            }
            return merchantAndFrequencyList;
        } catch (RuntimeException re) {
            throw re;
        } finally {
            if (session != null) {
                if (session.isOpen()) {
                    //关闭session
                    session.close();
                }
            }
        }
    }

    public static void main(String[] args) {
        MerchantAndFrequencyList merchantAndFrequencies = new RedeemNsDao().findMerchantType();
    }
}

