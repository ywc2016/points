package utils;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class MerchantAndFrequency {

    private String merchant;
    private int frequncy = 1;

    public MerchantAndFrequency(String merchant) {
        this.merchant = merchant;
        this.frequncy = 1;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public int getFrequncy() {
        return frequncy;
    }

    public void setFrequncy(int frequncy) {
        this.frequncy = frequncy;
    }


}
