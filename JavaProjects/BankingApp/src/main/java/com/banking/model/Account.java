package com.banking.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private long id;
    private String accountNumber;
    private long userId;
    private AccountType accountType;
    private BigDecimal balance;
    private AccountStatus status;
    private LocalDateTime createdAt;

    public enum AccountType {
        SAVINGS, CURRENT
    }

    public enum AccountStatus{
        ACTIVE, INACTIVE
    }

    public Account(){}

    public Account(long id, String accountNumber, long userId, AccountType accountType, BigDecimal balance, AccountStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Account(String accountNumber, long userId, AccountType accountType, BigDecimal balance, AccountStatus status) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.accountType = accountType;
        this.balance = BigDecimal.ZERO;
        this.status = AccountStatus.ACTIVE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", userId=" + userId +
                ", accountType=" + accountType +
                ", balance=" + balance +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}
