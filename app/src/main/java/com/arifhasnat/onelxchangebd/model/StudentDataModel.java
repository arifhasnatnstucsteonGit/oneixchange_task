package com.arifhasnat.onelxchangebd.model;

public class StudentDataModel {

    public String serial;
    public String participant;
    public String token;
    public String company;
    public String category;
    public String invalidEmail;
    public String rsp;
    public String eTicketSent;
    public String reminderEmail;
    public String reminderSMS;
    public String attendent;
    public String feedBackEmailSent;
    public String feedBackReceived;


    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getRsp() {
        return rsp;
    }

    public void setRsp(String rsp) {
        this.rsp = rsp;
    }

    public String geteTicketSent() {
        return eTicketSent;
    }

    public void seteTicketSent(String eTicketSent) {
        this.eTicketSent = eTicketSent;
    }

    public String getReminderEmail() {
        return reminderEmail;
    }

    public void setReminderEmail(String reminderEmail) {
        this.reminderEmail = reminderEmail;
    }

    public String getReminderSMS() {
        return reminderSMS;
    }

    public void setReminderSMS(String reminderSMS) {
        this.reminderSMS = reminderSMS;
    }

    public String getAttendent() {
        return attendent;
    }

    public void setAttendent(String attendent) {
        this.attendent = attendent;
    }

    public String getFeedBackEmailSent() {
        return feedBackEmailSent;
    }

    public void setFeedBackEmailSent(String feedBackEmailSent) {
        this.feedBackEmailSent = feedBackEmailSent;
    }

    public String getFeedBackReceived() {
        return feedBackReceived;
    }

    public void setFeedBackReceived(String feedBackReceived) {
        this.feedBackReceived = feedBackReceived;
    }

    @Override
    public String toString() {
        return "StudentDataModel{" +
                "serial='" + serial + '\'' +
                ", participant='" + participant + '\'' +
                ", token='" + token + '\'' +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                ", invalidEmail='" + invalidEmail + '\'' +
                ", rsp='" + rsp + '\'' +
                ", eTicketSent='" + eTicketSent + '\'' +
                ", reminderEmail='" + reminderEmail + '\'' +
                ", reminderSMS='" + reminderSMS + '\'' +
                ", attendent='" + attendent + '\'' +
                ", feedBackEmailSent='" + feedBackEmailSent + '\'' +
                ", feedBackReceived='" + feedBackReceived + '\'' +
                '}';
    }


}
