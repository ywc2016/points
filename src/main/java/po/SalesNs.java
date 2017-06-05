package po;

import javax.persistence.*;

/**
 * Created by ywcrm on 2017/6/5.
 */
@Entity
@Table(name = "sales_ns", schema = "points", catalog = "")
public class SalesNs {
    private String salesId;
    private String card;
    private String member;
    private String salesDate;
    private String transNo;
    private String totalAmt;
    private String calcPoint;
    private String extraPoint;
    private String promoPoint;
    private String redeempoint;
    private String pointused;
    private String voidstatus;
    private String totalvoid;
    private String terminal;
    private String transType;
    private String adjustmentType;
    private String merchant;
    private String companyCode;
    private String branchCode;
    private String posId;
    private String membermerchant;
    private String processDate;
    private String fuelIndicator;
    private long id;

    @Basic
    @Column(name = "salesID")
    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    @Basic
    @Column(name = "Card")
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Basic
    @Column(name = "Member")
    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    @Basic
    @Column(name = "SalesDate")
    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    @Basic
    @Column(name = "TransNo")
    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    @Basic
    @Column(name = "TotalAmt")
    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Basic
    @Column(name = "CalcPoint")
    public String getCalcPoint() {
        return calcPoint;
    }

    public void setCalcPoint(String calcPoint) {
        this.calcPoint = calcPoint;
    }

    @Basic
    @Column(name = "ExtraPoint")
    public String getExtraPoint() {
        return extraPoint;
    }

    public void setExtraPoint(String extraPoint) {
        this.extraPoint = extraPoint;
    }

    @Basic
    @Column(name = "PromoPoint")
    public String getPromoPoint() {
        return promoPoint;
    }

    public void setPromoPoint(String promoPoint) {
        this.promoPoint = promoPoint;
    }

    @Basic
    @Column(name = "redeempoint")
    public String getRedeempoint() {
        return redeempoint;
    }

    public void setRedeempoint(String redeempoint) {
        this.redeempoint = redeempoint;
    }

    @Basic
    @Column(name = "pointused")
    public String getPointused() {
        return pointused;
    }

    public void setPointused(String pointused) {
        this.pointused = pointused;
    }

    @Basic
    @Column(name = "voidstatus")
    public String getVoidstatus() {
        return voidstatus;
    }

    public void setVoidstatus(String voidstatus) {
        this.voidstatus = voidstatus;
    }

    @Basic
    @Column(name = "totalvoid")
    public String getTotalvoid() {
        return totalvoid;
    }

    public void setTotalvoid(String totalvoid) {
        this.totalvoid = totalvoid;
    }

    @Basic
    @Column(name = "Terminal")
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Basic
    @Column(name = "TransType")
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Basic
    @Column(name = "AdjustmentType")
    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
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
    @Column(name = "CompanyCode")
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Basic
    @Column(name = "BranchCode")
    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Basic
    @Column(name = "PosID")
    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    @Basic
    @Column(name = "membermerchant")
    public String getMembermerchant() {
        return membermerchant;
    }

    public void setMembermerchant(String membermerchant) {
        this.membermerchant = membermerchant;
    }

    @Basic
    @Column(name = "ProcessDate")
    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    @Basic
    @Column(name = "FuelIndicator")
    public String getFuelIndicator() {
        return fuelIndicator;
    }

    public void setFuelIndicator(String fuelIndicator) {
        this.fuelIndicator = fuelIndicator;
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

        SalesNs salesNs = (SalesNs) o;

        if (id != salesNs.id) return false;
        if (salesId != null ? !salesId.equals(salesNs.salesId) : salesNs.salesId != null) return false;
        if (card != null ? !card.equals(salesNs.card) : salesNs.card != null) return false;
        if (member != null ? !member.equals(salesNs.member) : salesNs.member != null) return false;
        if (salesDate != null ? !salesDate.equals(salesNs.salesDate) : salesNs.salesDate != null) return false;
        if (transNo != null ? !transNo.equals(salesNs.transNo) : salesNs.transNo != null) return false;
        if (totalAmt != null ? !totalAmt.equals(salesNs.totalAmt) : salesNs.totalAmt != null) return false;
        if (calcPoint != null ? !calcPoint.equals(salesNs.calcPoint) : salesNs.calcPoint != null) return false;
        if (extraPoint != null ? !extraPoint.equals(salesNs.extraPoint) : salesNs.extraPoint != null) return false;
        if (promoPoint != null ? !promoPoint.equals(salesNs.promoPoint) : salesNs.promoPoint != null) return false;
        if (redeempoint != null ? !redeempoint.equals(salesNs.redeempoint) : salesNs.redeempoint != null) return false;
        if (pointused != null ? !pointused.equals(salesNs.pointused) : salesNs.pointused != null) return false;
        if (voidstatus != null ? !voidstatus.equals(salesNs.voidstatus) : salesNs.voidstatus != null) return false;
        if (totalvoid != null ? !totalvoid.equals(salesNs.totalvoid) : salesNs.totalvoid != null) return false;
        if (terminal != null ? !terminal.equals(salesNs.terminal) : salesNs.terminal != null) return false;
        if (transType != null ? !transType.equals(salesNs.transType) : salesNs.transType != null) return false;
        if (adjustmentType != null ? !adjustmentType.equals(salesNs.adjustmentType) : salesNs.adjustmentType != null)
            return false;
        if (merchant != null ? !merchant.equals(salesNs.merchant) : salesNs.merchant != null) return false;
        if (companyCode != null ? !companyCode.equals(salesNs.companyCode) : salesNs.companyCode != null) return false;
        if (branchCode != null ? !branchCode.equals(salesNs.branchCode) : salesNs.branchCode != null) return false;
        if (posId != null ? !posId.equals(salesNs.posId) : salesNs.posId != null) return false;
        if (membermerchant != null ? !membermerchant.equals(salesNs.membermerchant) : salesNs.membermerchant != null)
            return false;
        if (processDate != null ? !processDate.equals(salesNs.processDate) : salesNs.processDate != null) return false;
        if (fuelIndicator != null ? !fuelIndicator.equals(salesNs.fuelIndicator) : salesNs.fuelIndicator != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salesId != null ? salesId.hashCode() : 0;
        result = 31 * result + (card != null ? card.hashCode() : 0);
        result = 31 * result + (member != null ? member.hashCode() : 0);
        result = 31 * result + (salesDate != null ? salesDate.hashCode() : 0);
        result = 31 * result + (transNo != null ? transNo.hashCode() : 0);
        result = 31 * result + (totalAmt != null ? totalAmt.hashCode() : 0);
        result = 31 * result + (calcPoint != null ? calcPoint.hashCode() : 0);
        result = 31 * result + (extraPoint != null ? extraPoint.hashCode() : 0);
        result = 31 * result + (promoPoint != null ? promoPoint.hashCode() : 0);
        result = 31 * result + (redeempoint != null ? redeempoint.hashCode() : 0);
        result = 31 * result + (pointused != null ? pointused.hashCode() : 0);
        result = 31 * result + (voidstatus != null ? voidstatus.hashCode() : 0);
        result = 31 * result + (totalvoid != null ? totalvoid.hashCode() : 0);
        result = 31 * result + (terminal != null ? terminal.hashCode() : 0);
        result = 31 * result + (transType != null ? transType.hashCode() : 0);
        result = 31 * result + (adjustmentType != null ? adjustmentType.hashCode() : 0);
        result = 31 * result + (merchant != null ? merchant.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        result = 31 * result + (posId != null ? posId.hashCode() : 0);
        result = 31 * result + (membermerchant != null ? membermerchant.hashCode() : 0);
        result = 31 * result + (processDate != null ? processDate.hashCode() : 0);
        result = 31 * result + (fuelIndicator != null ? fuelIndicator.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
