package po;

import javax.persistence.*;

/**
 * Created by ywcrm on 2017/6/5.
 */
@Entity
@Table(name = "member_ns", schema = "points", catalog = "")
public class MemberNs {
    private String card;
    private String member;
    private String cardType;
    private String cardStatus;
    private String ic;
    private String birthDate;
    private String gender;
    private String race;
    private String nationality;
    private String maritalStatus;
    private String ownCar;
    private String ownCreditCard;
    private String memberMerchant;
    private String staffStatus;
    private String balPoint;
    private String expirePoint;
    private String redeemPoint;
    private String lastTransDate;
    private String registerDate;
    private String activateDate;
    private String batchNo;
    private String remarks;
    private String memberLastUpdateDate;
    private String homeState;
    private String homeCountry;
    private String homeZip;
    private String mailState;
    private String mailCountry;
    private String mailZip;
    private String contactUpdateDate;
    private long id;

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
    @Column(name = "CardType")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Basic
    @Column(name = "cardStatus")
    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Basic
    @Column(name = "IC")
    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    @Basic
    @Column(name = "BirthDate")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Race")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Basic
    @Column(name = "Nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "MaritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "OwnCar")
    public String getOwnCar() {
        return ownCar;
    }

    public void setOwnCar(String ownCar) {
        this.ownCar = ownCar;
    }

    @Basic
    @Column(name = "OwnCreditCard")
    public String getOwnCreditCard() {
        return ownCreditCard;
    }

    public void setOwnCreditCard(String ownCreditCard) {
        this.ownCreditCard = ownCreditCard;
    }

    @Basic
    @Column(name = "memberMerchant")
    public String getMemberMerchant() {
        return memberMerchant;
    }

    public void setMemberMerchant(String memberMerchant) {
        this.memberMerchant = memberMerchant;
    }

    @Basic
    @Column(name = "StaffStatus")
    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    @Basic
    @Column(name = "BalPoint")
    public String getBalPoint() {
        return balPoint;
    }

    public void setBalPoint(String balPoint) {
        this.balPoint = balPoint;
    }

    @Basic
    @Column(name = "ExpirePoint")
    public String getExpirePoint() {
        return expirePoint;
    }

    public void setExpirePoint(String expirePoint) {
        this.expirePoint = expirePoint;
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
    @Column(name = "LastTransDate")
    public String getLastTransDate() {
        return lastTransDate;
    }

    public void setLastTransDate(String lastTransDate) {
        this.lastTransDate = lastTransDate;
    }

    @Basic
    @Column(name = "RegisterDate")
    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "ActivateDate")
    public String getActivateDate() {
        return activateDate;
    }

    public void setActivateDate(String activateDate) {
        this.activateDate = activateDate;
    }

    @Basic
    @Column(name = "BatchNo")
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "memberLastUpdateDate")
    public String getMemberLastUpdateDate() {
        return memberLastUpdateDate;
    }

    public void setMemberLastUpdateDate(String memberLastUpdateDate) {
        this.memberLastUpdateDate = memberLastUpdateDate;
    }

    @Basic
    @Column(name = "HomeState")
    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    @Basic
    @Column(name = "HomeCountry")
    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    @Basic
    @Column(name = "HomeZip")
    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    @Basic
    @Column(name = "MailState")
    public String getMailState() {
        return mailState;
    }

    public void setMailState(String mailState) {
        this.mailState = mailState;
    }

    @Basic
    @Column(name = "MailCountry")
    public String getMailCountry() {
        return mailCountry;
    }

    public void setMailCountry(String mailCountry) {
        this.mailCountry = mailCountry;
    }

    @Basic
    @Column(name = "MailZip")
    public String getMailZip() {
        return mailZip;
    }

    public void setMailZip(String mailZip) {
        this.mailZip = mailZip;
    }

    @Basic
    @Column(name = "contactUpdateDate")
    public String getContactUpdateDate() {
        return contactUpdateDate;
    }

    public void setContactUpdateDate(String contactUpdateDate) {
        this.contactUpdateDate = contactUpdateDate;
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

        MemberNs memberNs = (MemberNs) o;

        if (id != memberNs.id) return false;
        if (card != null ? !card.equals(memberNs.card) : memberNs.card != null) return false;
        if (member != null ? !member.equals(memberNs.member) : memberNs.member != null) return false;
        if (cardType != null ? !cardType.equals(memberNs.cardType) : memberNs.cardType != null) return false;
        if (cardStatus != null ? !cardStatus.equals(memberNs.cardStatus) : memberNs.cardStatus != null) return false;
        if (ic != null ? !ic.equals(memberNs.ic) : memberNs.ic != null) return false;
        if (birthDate != null ? !birthDate.equals(memberNs.birthDate) : memberNs.birthDate != null) return false;
        if (gender != null ? !gender.equals(memberNs.gender) : memberNs.gender != null) return false;
        if (race != null ? !race.equals(memberNs.race) : memberNs.race != null) return false;
        if (nationality != null ? !nationality.equals(memberNs.nationality) : memberNs.nationality != null)
            return false;
        if (maritalStatus != null ? !maritalStatus.equals(memberNs.maritalStatus) : memberNs.maritalStatus != null)
            return false;
        if (ownCar != null ? !ownCar.equals(memberNs.ownCar) : memberNs.ownCar != null) return false;
        if (ownCreditCard != null ? !ownCreditCard.equals(memberNs.ownCreditCard) : memberNs.ownCreditCard != null)
            return false;
        if (memberMerchant != null ? !memberMerchant.equals(memberNs.memberMerchant) : memberNs.memberMerchant != null)
            return false;
        if (staffStatus != null ? !staffStatus.equals(memberNs.staffStatus) : memberNs.staffStatus != null)
            return false;
        if (balPoint != null ? !balPoint.equals(memberNs.balPoint) : memberNs.balPoint != null) return false;
        if (expirePoint != null ? !expirePoint.equals(memberNs.expirePoint) : memberNs.expirePoint != null)
            return false;
        if (redeemPoint != null ? !redeemPoint.equals(memberNs.redeemPoint) : memberNs.redeemPoint != null)
            return false;
        if (lastTransDate != null ? !lastTransDate.equals(memberNs.lastTransDate) : memberNs.lastTransDate != null)
            return false;
        if (registerDate != null ? !registerDate.equals(memberNs.registerDate) : memberNs.registerDate != null)
            return false;
        if (activateDate != null ? !activateDate.equals(memberNs.activateDate) : memberNs.activateDate != null)
            return false;
        if (batchNo != null ? !batchNo.equals(memberNs.batchNo) : memberNs.batchNo != null) return false;
        if (remarks != null ? !remarks.equals(memberNs.remarks) : memberNs.remarks != null) return false;
        if (memberLastUpdateDate != null ? !memberLastUpdateDate.equals(memberNs.memberLastUpdateDate) : memberNs.memberLastUpdateDate != null)
            return false;
        if (homeState != null ? !homeState.equals(memberNs.homeState) : memberNs.homeState != null) return false;
        if (homeCountry != null ? !homeCountry.equals(memberNs.homeCountry) : memberNs.homeCountry != null)
            return false;
        if (homeZip != null ? !homeZip.equals(memberNs.homeZip) : memberNs.homeZip != null) return false;
        if (mailState != null ? !mailState.equals(memberNs.mailState) : memberNs.mailState != null) return false;
        if (mailCountry != null ? !mailCountry.equals(memberNs.mailCountry) : memberNs.mailCountry != null)
            return false;
        if (mailZip != null ? !mailZip.equals(memberNs.mailZip) : memberNs.mailZip != null) return false;
        if (contactUpdateDate != null ? !contactUpdateDate.equals(memberNs.contactUpdateDate) : memberNs.contactUpdateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = card != null ? card.hashCode() : 0;
        result = 31 * result + (member != null ? member.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (cardStatus != null ? cardStatus.hashCode() : 0);
        result = 31 * result + (ic != null ? ic.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (ownCar != null ? ownCar.hashCode() : 0);
        result = 31 * result + (ownCreditCard != null ? ownCreditCard.hashCode() : 0);
        result = 31 * result + (memberMerchant != null ? memberMerchant.hashCode() : 0);
        result = 31 * result + (staffStatus != null ? staffStatus.hashCode() : 0);
        result = 31 * result + (balPoint != null ? balPoint.hashCode() : 0);
        result = 31 * result + (expirePoint != null ? expirePoint.hashCode() : 0);
        result = 31 * result + (redeemPoint != null ? redeemPoint.hashCode() : 0);
        result = 31 * result + (lastTransDate != null ? lastTransDate.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (activateDate != null ? activateDate.hashCode() : 0);
        result = 31 * result + (batchNo != null ? batchNo.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (memberLastUpdateDate != null ? memberLastUpdateDate.hashCode() : 0);
        result = 31 * result + (homeState != null ? homeState.hashCode() : 0);
        result = 31 * result + (homeCountry != null ? homeCountry.hashCode() : 0);
        result = 31 * result + (homeZip != null ? homeZip.hashCode() : 0);
        result = 31 * result + (mailState != null ? mailState.hashCode() : 0);
        result = 31 * result + (mailCountry != null ? mailCountry.hashCode() : 0);
        result = 31 * result + (mailZip != null ? mailZip.hashCode() : 0);
        result = 31 * result + (contactUpdateDate != null ? contactUpdateDate.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
