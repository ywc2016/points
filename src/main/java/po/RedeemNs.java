package po;

import javax.persistence.*;

/**
 * Created by ywcrm on 2017/6/5.
 */
@Entity
@Table(name = "redeem_ns", schema = "points", catalog = "")
public class RedeemNs {
    private String redeemId;
    private String card;
    private String member;
    private String requestDate;
    private String terminalDate;
    private String transNo;
    private String status;
    private String merchant;
    private String companyCode;
    private String branchCode;
    private String posid;
    private String voidid;
    private String memberMerchant;
    private String redeemPoint;
    private String delZip;
    private String delState;
    private String delCountry;
    private long id;

    @Basic
    @Column(name = "redeemID")
    public String getRedeemId() {
        return redeemId;
    }

    public void setRedeemId(String redeemId) {
        this.redeemId = redeemId;
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
    @Column(name = "RequestDate")
    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    @Basic
    @Column(name = "TerminalDate")
    public String getTerminalDate() {
        return terminalDate;
    }

    public void setTerminalDate(String terminalDate) {
        this.terminalDate = terminalDate;
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
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "POSID")
    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    @Basic
    @Column(name = "VOIDID")
    public String getVoidid() {
        return voidid;
    }

    public void setVoidid(String voidid) {
        this.voidid = voidid;
    }

    @Basic
    @Column(name = "MemberMerchant")
    public String getMemberMerchant() {
        return memberMerchant;
    }

    public void setMemberMerchant(String memberMerchant) {
        this.memberMerchant = memberMerchant;
    }

    @Basic
    @Column(name = "RedeemPoint")
    public String getRedeemPoint() {
        return redeemPoint;
    }

    public void setRedeemPoint(String redeemPoint) {
        this.redeemPoint = redeemPoint;
    }

    @Basic
    @Column(name = "DelZip")
    public String getDelZip() {
        return delZip;
    }

    public void setDelZip(String delZip) {
        this.delZip = delZip;
    }

    @Basic
    @Column(name = "DelState")
    public String getDelState() {
        return delState;
    }

    public void setDelState(String delState) {
        this.delState = delState;
    }

    @Basic
    @Column(name = "DelCountry")
    public String getDelCountry() {
        return delCountry;
    }

    public void setDelCountry(String delCountry) {
        this.delCountry = delCountry;
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

        RedeemNs redeemNs = (RedeemNs) o;

        if (id != redeemNs.id) return false;
        if (redeemId != null ? !redeemId.equals(redeemNs.redeemId) : redeemNs.redeemId != null) return false;
        if (card != null ? !card.equals(redeemNs.card) : redeemNs.card != null) return false;
        if (member != null ? !member.equals(redeemNs.member) : redeemNs.member != null) return false;
        if (requestDate != null ? !requestDate.equals(redeemNs.requestDate) : redeemNs.requestDate != null)
            return false;
        if (terminalDate != null ? !terminalDate.equals(redeemNs.terminalDate) : redeemNs.terminalDate != null)
            return false;
        if (transNo != null ? !transNo.equals(redeemNs.transNo) : redeemNs.transNo != null) return false;
        if (status != null ? !status.equals(redeemNs.status) : redeemNs.status != null) return false;
        if (merchant != null ? !merchant.equals(redeemNs.merchant) : redeemNs.merchant != null) return false;
        if (companyCode != null ? !companyCode.equals(redeemNs.companyCode) : redeemNs.companyCode != null)
            return false;
        if (branchCode != null ? !branchCode.equals(redeemNs.branchCode) : redeemNs.branchCode != null) return false;
        if (posid != null ? !posid.equals(redeemNs.posid) : redeemNs.posid != null) return false;
        if (voidid != null ? !voidid.equals(redeemNs.voidid) : redeemNs.voidid != null) return false;
        if (memberMerchant != null ? !memberMerchant.equals(redeemNs.memberMerchant) : redeemNs.memberMerchant != null)
            return false;
        if (redeemPoint != null ? !redeemPoint.equals(redeemNs.redeemPoint) : redeemNs.redeemPoint != null)
            return false;
        if (delZip != null ? !delZip.equals(redeemNs.delZip) : redeemNs.delZip != null) return false;
        if (delState != null ? !delState.equals(redeemNs.delState) : redeemNs.delState != null) return false;
        if (delCountry != null ? !delCountry.equals(redeemNs.delCountry) : redeemNs.delCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = redeemId != null ? redeemId.hashCode() : 0;
        result = 31 * result + (card != null ? card.hashCode() : 0);
        result = 31 * result + (member != null ? member.hashCode() : 0);
        result = 31 * result + (requestDate != null ? requestDate.hashCode() : 0);
        result = 31 * result + (terminalDate != null ? terminalDate.hashCode() : 0);
        result = 31 * result + (transNo != null ? transNo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (merchant != null ? merchant.hashCode() : 0);
        result = 31 * result + (companyCode != null ? companyCode.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        result = 31 * result + (posid != null ? posid.hashCode() : 0);
        result = 31 * result + (voidid != null ? voidid.hashCode() : 0);
        result = 31 * result + (memberMerchant != null ? memberMerchant.hashCode() : 0);
        result = 31 * result + (redeemPoint != null ? redeemPoint.hashCode() : 0);
        result = 31 * result + (delZip != null ? delZip.hashCode() : 0);
        result = 31 * result + (delState != null ? delState.hashCode() : 0);
        result = 31 * result + (delCountry != null ? delCountry.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
