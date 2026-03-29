package com.banking.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transactions {
    private long id;
    private String accountId;
    private TransactionType transactionType;
    private BigDecimal balanceBeforeTransaction;
    private String balanceAfterTransaction;
    private String description;
    private LocalDateTime createdAt;

    public enum TransactionType {
        DEPOSIT, WITHDRAW , Transfer
    }

    public Transactions() {
    }

    public Transactions(long id, String accountId, TransactionType transactionType, BigDecimal balanceBeforeTransaction, String balanceAfterTransaction, String description, LocalDateTime createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.balanceBeforeTransaction = balanceBeforeTransaction;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
        this.createdAt = createdAt;
    }

    public Transactions(String accountId, TransactionType transactionType, BigDecimal balanceBeforeTransaction, String balanceAfterTransaction, String description) {
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.balanceBeforeTransaction = balanceBeforeTransaction;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getBalanceBeforeTransaction() {
        return balanceBeforeTransaction;
    }

    public void setBalanceBeforeTransaction(BigDecimal balanceBeforeTransaction) {
        this.balanceBeforeTransaction = balanceBeforeTransaction;
    }

    public String getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    public void setBalanceAfterTransaction(String balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", accountId='" + accountId + '\'' +
                ", transactionType=" + transactionType +
                ", balanceBeforeTransaction=" + balanceBeforeTransaction +
                ", balanceAfterTransaction='" + balanceAfterTransaction + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
