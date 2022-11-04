package com.example.creditcardes.models;

public class Profile {
    private int creditAge;
    private int numberOfCardsOpen;
    private int numberOfHardInquiries;
    private int derogatoryMarks;
    private int usagePercentage;
    private int paymentHistory;
    private int oldestCardAge;
    private int openedAccountLastTwoYears;
    private int creditScore;
    private String offeredCard;
    private String reason;
    private boolean newAccount;

    public boolean isNewAccount() {
        return newAccount;
    }

    public void setNewAccount(boolean newAccount) {
        this.newAccount = newAccount;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "creditAge=" + creditAge +
                ", numberOfCardsOpen=" + numberOfCardsOpen +
                ", numberOfHardInquiries=" + numberOfHardInquiries +
                ", derogatoryMarks=" + derogatoryMarks +
                ", usagePercentage=" + usagePercentage +
                ", paymentHistory=" + paymentHistory +
                ", oldestCardAge=" + oldestCardAge +
                ", openedAccountLastTwoYears=" + openedAccountLastTwoYears +
                ", creditScore=" + creditScore +
                ", offeredCard='" + offeredCard + '\'' +
                ", reason='" + reason + '\'' +
                ", newAccount=" + newAccount +
                '}';
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOfferedCard() {
        return offeredCard;
    }

    public void setOfferedCard(String offeredCard) {
        this.offeredCard = offeredCard;
    }

    public int getCreditAge() {
        return creditAge;
    }

    public void setCreditAge(int creditAge) {
        this.creditAge = creditAge;
    }

    public int getNumberOfCardsOpen() {
        return numberOfCardsOpen;
    }

    public void setNumberOfCardsOpen(int numberOfCardsOpen) {
        this.numberOfCardsOpen = numberOfCardsOpen;
    }

    public int getNumberOfHardInquiries() {
        return numberOfHardInquiries;
    }

    public void setNumberOfHardInquiries(int numberOfHardInquiries) {
        this.numberOfHardInquiries = numberOfHardInquiries;
    }

    public int getDerogatoryMarks() {
        return derogatoryMarks;
    }

    public void setDerogatoryMarks(int derogatoryMarks) {
        this.derogatoryMarks = derogatoryMarks;
    }

    public int getUsagePercentage() {
        return usagePercentage;
    }

    public void setUsagePercentage(int usagePercentage) {
        this.usagePercentage = usagePercentage;
    }

    public int getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(int paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public int getOldestCardAge() {
        return oldestCardAge;
    }

    public void setOldestCardAge(int oldestCardAge) {
        this.oldestCardAge = oldestCardAge;
    }

    public int getOpenedAccountLastTwoYears() {
        return openedAccountLastTwoYears;
    }

    public void setOpenedAccountLastTwoYears(int openedAccountLastTwoYears) {
        this.openedAccountLastTwoYears = openedAccountLastTwoYears;
    }

}
