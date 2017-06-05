package po;

import javax.persistence.*;

/**
 * Created by ywcrm on 2017/6/5.
 */
@Entity
@Table(name = "gift_redeem_ns", schema = "points", catalog = "")
public class GiftRedeemNs {
    private String redeemId;
    private String gift;
    private String unitCost;
    private String qty;
    private String point;
    private String delDate;
    private String status;
    private long id;

    @Basic
    @Column(name = "RedeemID")
    public String getRedeemId() {
        return redeemId;
    }

    public void setRedeemId(String redeemId) {
        this.redeemId = redeemId;
    }

    @Basic
    @Column(name = "Gift")
    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
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
    @Column(name = "Qty")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
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
    @Column(name = "DelDate")
    public String getDelDate() {
        return delDate;
    }

    public void setDelDate(String delDate) {
        this.delDate = delDate;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        GiftRedeemNs that = (GiftRedeemNs) o;

        if (id != that.id) return false;
        if (redeemId != null ? !redeemId.equals(that.redeemId) : that.redeemId != null) return false;
        if (gift != null ? !gift.equals(that.gift) : that.gift != null) return false;
        if (unitCost != null ? !unitCost.equals(that.unitCost) : that.unitCost != null) return false;
        if (qty != null ? !qty.equals(that.qty) : that.qty != null) return false;
        if (point != null ? !point.equals(that.point) : that.point != null) return false;
        if (delDate != null ? !delDate.equals(that.delDate) : that.delDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = redeemId != null ? redeemId.hashCode() : 0;
        result = 31 * result + (gift != null ? gift.hashCode() : 0);
        result = 31 * result + (unitCost != null ? unitCost.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        result = 31 * result + (delDate != null ? delDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
