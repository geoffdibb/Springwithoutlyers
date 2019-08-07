package com.BAE.domain;

public class SentAccount {

    private Long accountId;

    private String firstName;

    private String lastName;

    private String accountNumber;
    
    

    public SentAccount(){}

    public SentAccount(Long accountID, String firstNAme, String lastName, String accountNumber ){
        this.accountId = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



}