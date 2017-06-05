package timeSeries;

import java.util.ArrayList;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class MerchantAndFrequencyList extends ArrayList<MerchantAndFrequency> {
    public MerchantAndFrequency findByMerchant(String merchant) {
        for (MerchantAndFrequency merchantAndFrequency : this) {
            try {
                if (merchantAndFrequency.getMerchant().equals(merchant)) {
                    return merchantAndFrequency;
                }
            } catch (Exception e) {
                System.out.println(merchantAndFrequency.getMerchant());
                System.out.println(merchant);
            }
        }
        return null;
    }
}
