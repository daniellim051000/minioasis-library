/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatronType implements Serializable {

    private static final long serialVersionUID = 170353004;

    private final Long       id;
    private final Integer    biblioLimit;
    private final String     code;
    private final BigDecimal deposit;
    private final Integer    duration;
    private final Date       expiryDate;
    private final BigDecimal fineRate;
    private final Integer    maxCantReservePeriod;
    private final Integer    maxCollectablePeriod;
    private final Integer    maxNoOfRenew;
    private final Integer    maxNoOfReservations;
    private final Integer    maxUncollectedNo;
    private final BigDecimal memberFee;
    private final Integer    minRenewablePeriod;
    private final String     name;
    private final Integer    resumeBorrowablePeriod;
    private final Date       startDate;

    public PatronType(PatronType value) {
        this.id = value.id;
        this.biblioLimit = value.biblioLimit;
        this.code = value.code;
        this.deposit = value.deposit;
        this.duration = value.duration;
        this.expiryDate = value.expiryDate;
        this.fineRate = value.fineRate;
        this.maxCantReservePeriod = value.maxCantReservePeriod;
        this.maxCollectablePeriod = value.maxCollectablePeriod;
        this.maxNoOfRenew = value.maxNoOfRenew;
        this.maxNoOfReservations = value.maxNoOfReservations;
        this.maxUncollectedNo = value.maxUncollectedNo;
        this.memberFee = value.memberFee;
        this.minRenewablePeriod = value.minRenewablePeriod;
        this.name = value.name;
        this.resumeBorrowablePeriod = value.resumeBorrowablePeriod;
        this.startDate = value.startDate;
    }

    public PatronType(
        Long       id,
        Integer    biblioLimit,
        String     code,
        BigDecimal deposit,
        Integer    duration,
        Date       expiryDate,
        BigDecimal fineRate,
        Integer    maxCantReservePeriod,
        Integer    maxCollectablePeriod,
        Integer    maxNoOfRenew,
        Integer    maxNoOfReservations,
        Integer    maxUncollectedNo,
        BigDecimal memberFee,
        Integer    minRenewablePeriod,
        String     name,
        Integer    resumeBorrowablePeriod,
        Date       startDate
    ) {
        this.id = id;
        this.biblioLimit = biblioLimit;
        this.code = code;
        this.deposit = deposit;
        this.duration = duration;
        this.expiryDate = expiryDate;
        this.fineRate = fineRate;
        this.maxCantReservePeriod = maxCantReservePeriod;
        this.maxCollectablePeriod = maxCollectablePeriod;
        this.maxNoOfRenew = maxNoOfRenew;
        this.maxNoOfReservations = maxNoOfReservations;
        this.maxUncollectedNo = maxUncollectedNo;
        this.memberFee = memberFee;
        this.minRenewablePeriod = minRenewablePeriod;
        this.name = name;
        this.resumeBorrowablePeriod = resumeBorrowablePeriod;
        this.startDate = startDate;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getBiblioLimit() {
        return this.biblioLimit;
    }

    public String getCode() {
        return this.code;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public BigDecimal getFineRate() {
        return this.fineRate;
    }

    public Integer getMaxCantReservePeriod() {
        return this.maxCantReservePeriod;
    }

    public Integer getMaxCollectablePeriod() {
        return this.maxCollectablePeriod;
    }

    public Integer getMaxNoOfRenew() {
        return this.maxNoOfRenew;
    }

    public Integer getMaxNoOfReservations() {
        return this.maxNoOfReservations;
    }

    public Integer getMaxUncollectedNo() {
        return this.maxUncollectedNo;
    }

    public BigDecimal getMemberFee() {
        return this.memberFee;
    }

    public Integer getMinRenewablePeriod() {
        return this.minRenewablePeriod;
    }

    public String getName() {
        return this.name;
    }

    public Integer getResumeBorrowablePeriod() {
        return this.resumeBorrowablePeriod;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatronType (");

        sb.append(id);
        sb.append(", ").append(biblioLimit);
        sb.append(", ").append(code);
        sb.append(", ").append(deposit);
        sb.append(", ").append(duration);
        sb.append(", ").append(expiryDate);
        sb.append(", ").append(fineRate);
        sb.append(", ").append(maxCantReservePeriod);
        sb.append(", ").append(maxCollectablePeriod);
        sb.append(", ").append(maxNoOfRenew);
        sb.append(", ").append(maxNoOfReservations);
        sb.append(", ").append(maxUncollectedNo);
        sb.append(", ").append(memberFee);
        sb.append(", ").append(minRenewablePeriod);
        sb.append(", ").append(name);
        sb.append(", ").append(resumeBorrowablePeriod);
        sb.append(", ").append(startDate);

        sb.append(")");
        return sb.toString();
    }
}
