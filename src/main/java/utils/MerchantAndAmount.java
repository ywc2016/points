package utils;

/**
 * Created by ywcrm on 2017/6/5.
 */
public class MerchantAndAmount implements Comparable<MerchantAndAmount> {

    private String merchant;
    private double amount = 0d;

    public MerchantAndAmount(String merchant) {
        this.merchant = merchant;
        this.amount = 0d;
    }

    public MerchantAndAmount(String merchant, double amount) {
        this.merchant = merchant;
        this.amount = amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int compareTo(MerchantAndAmount o1) {
        double a = this.amount - o1.getAmount();
        if (a > 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        if (a < 0) {
            return -1;
        }
        return 0;
    }
}
