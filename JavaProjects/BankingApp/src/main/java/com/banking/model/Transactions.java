package com.banking.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents a banking transaction in the system.
 * 
 * This class encapsulates all transaction-related information including transaction details,
 * amount, type, and timestamps. Each transaction is associated with an account and records
 * the state before and after the transaction for audit purposes.
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class Transactions {
    /** Unique identifier for the transaction */
    private long id;
    
    /** ID of the account where this transaction occurred */
    private String accountId;
    
    /** Type of transaction (DEPOSIT, WITHDRAW, or TRANSFER) */
    private TransactionType transactionType;
    
    /** Account balance before this transaction was executed */
    private BigDecimal balanceBeforeTransaction;
    
    /** Account balance after this transaction was executed */
    private String balanceAfterTransaction;
    
    /** Description of the transaction purpose or details */
    private String description;
    
    /** Timestamp when the transaction was created/executed */
    private LocalDateTime createdAt;

    /**
     * Enumeration of supported transaction types.
     */
    public enum TransactionType {
        /** Money deposited into the account */
        DEPOSIT, 
        
        /** Money withdrawn from the account */
        WITHDRAW , 
        
        /** Money transferred to another account */
        Transfer
    }

    /**
     * Default constructor for creating a new Transactions instance.
     * Required for frameworks like JPA/Hibernate.
     */
    public Transactions() {
    }

    /**
     * Constructs a new Transaction with all fields including ID.
     * Typically used when retrieving transaction data from the database.
     * 
     * @param id Unique transaction identifier
     * @param accountId ID of the account where transaction occurred
     * @param transactionType Type of transaction
     * @param balanceBeforeTransaction Balance before transaction
     * @param balanceAfterTransaction Balance after transaction
     * @param description Transaction description
     * @param createdAt Transaction creation timestamp
     */
    public Transactions(long id, String accountId, TransactionType transactionType, BigDecimal balanceBeforeTransaction, String balanceAfterTransaction, String description, LocalDateTime createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.balanceBeforeTransaction = balanceBeforeTransaction;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
        this.createdAt = createdAt;
    }

    /**
     * Constructs a new Transaction for creation purposes.
     * ID and creation timestamp are typically set by the database.
     * 
     * @param accountId ID of the account where transaction occurred
     * @param transactionType Type of transaction
     * @param balanceBeforeTransaction Balance before transaction
     * @param balanceAfterTransaction Balance after transaction
     * @param description Transaction description
     */
    public Transactions(String accountId, TransactionType transactionType, BigDecimal balanceBeforeTransaction, String balanceAfterTransaction, String description) {
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.balanceBeforeTransaction = balanceBeforeTransaction;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
    }

    /**
     * Returns the unique identifier of the transaction.
     * 
     * @return the transaction ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the transaction.
     * Typically used by the database layer when persisting the transaction.
     * 
     * @param id the transaction ID to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Returns the ID of the account where this transaction occurred.
     * 
     * @return the account ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the ID of the account where this transaction occurred.
     * 
     * @param accountId the account ID to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the type of this transaction.
     * 
     * @return the transaction type
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the type of this transaction.
     * 
     * @param transactionType the transaction type to set
     */
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Returns the account balance before this transaction was executed.
     * 
     * @return the balance before transaction
     */
    public BigDecimal getBalanceBeforeTransaction() {
        return balanceBeforeTransaction;
    }

    /**
     * Sets the account balance before this transaction was executed.
     * Used for audit trail and transaction history.
     * 
     * @param balanceBeforeTransaction the balance before transaction to set
     */
    public void setBalanceBeforeTransaction(BigDecimal balanceBeforeTransaction) {
        this.balanceBeforeTransaction = balanceBeforeTransaction;
    }

    /**
     * Returns the account balance after this transaction was executed.
     * 
     * @return the balance after transaction
     */
    public String getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    /**
     * Sets the account balance after this transaction was executed.
     * Used for audit trail and transaction history.
     * 
     * @param balanceAfterTransaction the balance after transaction to set
     */
    public void setBalanceAfterTransaction(String balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    /**
     * Returns the description of this transaction.
     * 
     * @return the transaction description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description for this transaction.
     * Provides context about the purpose or details of the transaction.
     * 
     * @param description the transaction description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the timestamp when this transaction was created/executed.
     * 
     * @return the transaction creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the timestamp when this transaction was created/executed.
     * Typically set by the database layer when the transaction is first created.
     * 
     * @param createdAt the creation timestamp to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns a string representation of the Transaction object.
     * 
     * @return string representation of the transaction
     */
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
