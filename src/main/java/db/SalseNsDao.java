package db;

import org.hibernate.Session;
import org.hibernate.query.Query;
import po.SalesNs;
import utils.MerchantAndAmount;
import utils.MerchantAndAmountList;

import java.util.List;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class SalseNsDao extends BaseDao<SalesNs> {

    public MerchantAndAmountList getMerchantAndAmountList() {
        Session session = null;
        try {
            String queryString = "FROM " + typeClass().getCanonicalName();
            session = Client.getSessionFactory().openSession();
            Query query = session.createQuery(queryString);
            List<SalesNs> pojos = query.list();
//            List<String> merchantList = new ArrayList<String>();
//            for (RedeemNs redeemNs : pojos) {
//                merchantList.add(redeemNs.getMerchant());
//            }
//            List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(merchantList));
            MerchantAndAmountList merchantAndAmountList = new MerchantAndAmountList();
            for (SalesNs salesNs : pojos) {
                if (salesNs.getMerchant() == null) {
//                    System.out.println(redeemNs);
                    continue;
                }
                MerchantAndAmount merchantAndAmount = merchantAndAmountList.findByMerchant(salesNs.getMerchant());
                if (merchantAndAmount != null) {
                    merchantAndAmount.setAmount(merchantAndAmount.getAmount() + Double.parseDouble(salesNs.getTotalAmt()));
                } else {
                    merchantAndAmountList.add(new MerchantAndAmount(salesNs.getMerchant()));
                }
            }
            return merchantAndAmountList;
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
    }
}

