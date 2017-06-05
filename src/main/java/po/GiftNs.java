package po;

import javax.persistence.*;

/**
 * Created by ywcrm on 2017/6/5.
 */
@Entity
@Table(name = "gift_ns", schema = "points", catalog = "")
public class GiftNs {
    private String gift;
    private String giftName;
    private String startDate;
    private String endDate;
    private String category;
    private String point;
    private String qty;
    private String unitCost;
    private String merchant;
    private String voucherMerchant;
    private long id;

    @Basic
    @Column(name = "gift")
    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Basic
    @Column(name = "giftName")
    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    @Basic
    @Column(name = "StartDate")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "Point")
    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Basic
    @Column(name = "Qty")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "UnitCost")
    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    @Basic
    @Column(name = "Merchant")
    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    @Basic
    @Column(name = "VoucherMerchant")
    public String getVoucherMerchant() {
        return voucherMerchant;
    }

    public void setVoucherMerchant(String voucherMerchant) {
        this.voucherMerchant = voucherMerchant;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GiftNs giftNs = (GiftNs) o;

        if (id != giftNs.id) return false;
        if (gift != null ? !gift.equals(giftNs.gift) : giftNs.gift != null) return false;
        if (giftName != null ? !giftName.equals(giftNs.giftName) : giftNs.giftName != null) return false;
        if (startDate != null ? !startDate.equals(giftNs.startDate) : giftNs.startDate != null) return false;
        if (endDate != null ? !endDate.equals(giftNs.endDate) : giftNs.endDate != null) return false;
        if (category != null ? !category.equals(giftNs.category) : giftNs.category != null) return false;
        if (point != null ? !point.equals(giftNs.point) : giftNs.point != null) return false;
        if (qty != null ? !qty.equals(giftNs.qty) : giftNs.qty != null) return false;
        if (unitCost != null ? !unitCost.equals(giftNs.unitCost) : giftNs.unitCost != null) return false;
        if (merchant != null ? !merchant.equals(giftNs.merchant) : giftNs.merchant != null) return false;
        if (voucherMerchant != null ? !voucherMerchant.equals(giftNs.voucherMerchant) : giftNs.voucherMerchant != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gift != null ? gift.hashCode() : 0;
        result = 31 * result + (giftName != null ? giftName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (unitCost != null ? unitCost.hashCode() : 0);
        result = 31 * result + (merchant != null ? merchant.hashCode() : 0);
        result = 31 * result + (voucherMerchant != null ? voucherMerchant.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
