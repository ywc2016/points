package utils;

import java.util.ArrayList;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class MerchantAndAmountList extends ArrayList<MerchantAndAmount> {
    public MerchantAndAmount findByMerchant(String merchant) {
        for (MerchantAndAmount merchantAndAmount : this) {
            try {
                if (merchantAndAmount.getMerchant().equals(merchant)) {
                    return merchantAndAmount;
                }
            } catch (Exception e) {
                System.out.println(merchantAndAmount.getMerchant());
                System.out.println(merchant);
            }
        }
        return null;
    }
}
