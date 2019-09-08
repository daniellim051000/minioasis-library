/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.minioasis.library.jooq.tables.PatronType;


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
public class PatronTypeRecord extends UpdatableRecordImpl<PatronTypeRecord> implements Record17<Long, Integer, String, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, Integer, Integer, Integer, BigDecimal, Integer, String, Integer, Date> {

    private static final long serialVersionUID = -797928998;

    /**
     * Setter for <code>PATRON_TYPE.ID</code>.
     */
    public PatronTypeRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PATRON_TYPE.BIBLIO_LIMIT</code>.
     */
    public PatronTypeRecord setBiblioLimit(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.BIBLIO_LIMIT</code>.
     */
    public Integer getBiblioLimit() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PATRON_TYPE.CODE</code>.
     */
    public PatronTypeRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.CODE</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PATRON_TYPE.DEPOSIT</code>.
     */
    public PatronTypeRecord setDeposit(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.DEPOSIT</code>.
     */
    public BigDecimal getDeposit() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>PATRON_TYPE.DURATION</code>.
     */
    public PatronTypeRecord setDuration(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.DURATION</code>.
     */
    public Integer getDuration() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>PATRON_TYPE.EXPIRY_DATE</code>.
     */
    public PatronTypeRecord setExpiryDate(Date value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.EXPIRY_DATE</code>.
     */
    public Date getExpiryDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>PATRON_TYPE.FINE_RATE</code>.
     */
    public PatronTypeRecord setFineRate(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.FINE_RATE</code>.
     */
    public BigDecimal getFineRate() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>PATRON_TYPE.MAX_CANT_RESERVE_PERIOD</code>.
     */
    public PatronTypeRecord setMaxCantReservePeriod(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MAX_CANT_RESERVE_PERIOD</code>.
     */
    public Integer getMaxCantReservePeriod() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>PATRON_TYPE.MAX_COLLECTABLE_PERIOD</code>.
     */
    public PatronTypeRecord setMaxCollectablePeriod(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MAX_COLLECTABLE_PERIOD</code>.
     */
    public Integer getMaxCollectablePeriod() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>PATRON_TYPE.MAX_NO_OF_RENEW</code>.
     */
    public PatronTypeRecord setMaxNoOfRenew(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MAX_NO_OF_RENEW</code>.
     */
    public Integer getMaxNoOfRenew() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>PATRON_TYPE.MAX_NO_OF_RESERVATIONS</code>.
     */
    public PatronTypeRecord setMaxNoOfReservations(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MAX_NO_OF_RESERVATIONS</code>.
     */
    public Integer getMaxNoOfReservations() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>PATRON_TYPE.MAX_UNCOLLECTED_NO</code>.
     */
    public PatronTypeRecord setMaxUncollectedNo(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MAX_UNCOLLECTED_NO</code>.
     */
    public Integer getMaxUncollectedNo() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>PATRON_TYPE.MEMBER_FEE</code>.
     */
    public PatronTypeRecord setMemberFee(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MEMBER_FEE</code>.
     */
    public BigDecimal getMemberFee() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>PATRON_TYPE.MIN_RENEWABLE_PERIOD</code>.
     */
    public PatronTypeRecord setMinRenewablePeriod(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.MIN_RENEWABLE_PERIOD</code>.
     */
    public Integer getMinRenewablePeriod() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>PATRON_TYPE.NAME</code>.
     */
    public PatronTypeRecord setName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.NAME</code>.
     */
    public String getName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>PATRON_TYPE.RESUME_BORROWABLE_PERIOD</code>.
     */
    public PatronTypeRecord setResumeBorrowablePeriod(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.RESUME_BORROWABLE_PERIOD</code>.
     */
    public Integer getResumeBorrowablePeriod() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>PATRON_TYPE.START_DATE</code>.
     */
    public PatronTypeRecord setStartDate(Date value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>PATRON_TYPE.START_DATE</code>.
     */
    public Date getStartDate() {
        return (Date) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Integer, String, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, Integer, Integer, Integer, BigDecimal, Integer, String, Integer, Date> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, Integer, String, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, Integer, Integer, Integer, BigDecimal, Integer, String, Integer, Date> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PatronType.PATRON_TYPE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return PatronType.PATRON_TYPE.BIBLIO_LIMIT;
    }

    @Override
    public Field<String> field3() {
        return PatronType.PATRON_TYPE.CODE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return PatronType.PATRON_TYPE.DEPOSIT;
    }

    @Override
    public Field<Integer> field5() {
        return PatronType.PATRON_TYPE.DURATION;
    }

    @Override
    public Field<Date> field6() {
        return PatronType.PATRON_TYPE.EXPIRY_DATE;
    }

    @Override
    public Field<BigDecimal> field7() {
        return PatronType.PATRON_TYPE.FINE_RATE;
    }

    @Override
    public Field<Integer> field8() {
        return PatronType.PATRON_TYPE.MAX_CANT_RESERVE_PERIOD;
    }

    @Override
    public Field<Integer> field9() {
        return PatronType.PATRON_TYPE.MAX_COLLECTABLE_PERIOD;
    }

    @Override
    public Field<Integer> field10() {
        return PatronType.PATRON_TYPE.MAX_NO_OF_RENEW;
    }

    @Override
    public Field<Integer> field11() {
        return PatronType.PATRON_TYPE.MAX_NO_OF_RESERVATIONS;
    }

    @Override
    public Field<Integer> field12() {
        return PatronType.PATRON_TYPE.MAX_UNCOLLECTED_NO;
    }

    @Override
    public Field<BigDecimal> field13() {
        return PatronType.PATRON_TYPE.MEMBER_FEE;
    }

    @Override
    public Field<Integer> field14() {
        return PatronType.PATRON_TYPE.MIN_RENEWABLE_PERIOD;
    }

    @Override
    public Field<String> field15() {
        return PatronType.PATRON_TYPE.NAME;
    }

    @Override
    public Field<Integer> field16() {
        return PatronType.PATRON_TYPE.RESUME_BORROWABLE_PERIOD;
    }

    @Override
    public Field<Date> field17() {
        return PatronType.PATRON_TYPE.START_DATE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getBiblioLimit();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public BigDecimal component4() {
        return getDeposit();
    }

    @Override
    public Integer component5() {
        return getDuration();
    }

    @Override
    public Date component6() {
        return getExpiryDate();
    }

    @Override
    public BigDecimal component7() {
        return getFineRate();
    }

    @Override
    public Integer component8() {
        return getMaxCantReservePeriod();
    }

    @Override
    public Integer component9() {
        return getMaxCollectablePeriod();
    }

    @Override
    public Integer component10() {
        return getMaxNoOfRenew();
    }

    @Override
    public Integer component11() {
        return getMaxNoOfReservations();
    }

    @Override
    public Integer component12() {
        return getMaxUncollectedNo();
    }

    @Override
    public BigDecimal component13() {
        return getMemberFee();
    }

    @Override
    public Integer component14() {
        return getMinRenewablePeriod();
    }

    @Override
    public String component15() {
        return getName();
    }

    @Override
    public Integer component16() {
        return getResumeBorrowablePeriod();
    }

    @Override
    public Date component17() {
        return getStartDate();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getBiblioLimit();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public BigDecimal value4() {
        return getDeposit();
    }

    @Override
    public Integer value5() {
        return getDuration();
    }

    @Override
    public Date value6() {
        return getExpiryDate();
    }

    @Override
    public BigDecimal value7() {
        return getFineRate();
    }

    @Override
    public Integer value8() {
        return getMaxCantReservePeriod();
    }

    @Override
    public Integer value9() {
        return getMaxCollectablePeriod();
    }

    @Override
    public Integer value10() {
        return getMaxNoOfRenew();
    }

    @Override
    public Integer value11() {
        return getMaxNoOfReservations();
    }

    @Override
    public Integer value12() {
        return getMaxUncollectedNo();
    }

    @Override
    public BigDecimal value13() {
        return getMemberFee();
    }

    @Override
    public Integer value14() {
        return getMinRenewablePeriod();
    }

    @Override
    public String value15() {
        return getName();
    }

    @Override
    public Integer value16() {
        return getResumeBorrowablePeriod();
    }

    @Override
    public Date value17() {
        return getStartDate();
    }

    @Override
    public PatronTypeRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PatronTypeRecord value2(Integer value) {
        setBiblioLimit(value);
        return this;
    }

    @Override
    public PatronTypeRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PatronTypeRecord value4(BigDecimal value) {
        setDeposit(value);
        return this;
    }

    @Override
    public PatronTypeRecord value5(Integer value) {
        setDuration(value);
        return this;
    }

    @Override
    public PatronTypeRecord value6(Date value) {
        setExpiryDate(value);
        return this;
    }

    @Override
    public PatronTypeRecord value7(BigDecimal value) {
        setFineRate(value);
        return this;
    }

    @Override
    public PatronTypeRecord value8(Integer value) {
        setMaxCantReservePeriod(value);
        return this;
    }

    @Override
    public PatronTypeRecord value9(Integer value) {
        setMaxCollectablePeriod(value);
        return this;
    }

    @Override
    public PatronTypeRecord value10(Integer value) {
        setMaxNoOfRenew(value);
        return this;
    }

    @Override
    public PatronTypeRecord value11(Integer value) {
        setMaxNoOfReservations(value);
        return this;
    }

    @Override
    public PatronTypeRecord value12(Integer value) {
        setMaxUncollectedNo(value);
        return this;
    }

    @Override
    public PatronTypeRecord value13(BigDecimal value) {
        setMemberFee(value);
        return this;
    }

    @Override
    public PatronTypeRecord value14(Integer value) {
        setMinRenewablePeriod(value);
        return this;
    }

    @Override
    public PatronTypeRecord value15(String value) {
        setName(value);
        return this;
    }

    @Override
    public PatronTypeRecord value16(Integer value) {
        setResumeBorrowablePeriod(value);
        return this;
    }

    @Override
    public PatronTypeRecord value17(Date value) {
        setStartDate(value);
        return this;
    }

    @Override
    public PatronTypeRecord values(Long value1, Integer value2, String value3, BigDecimal value4, Integer value5, Date value6, BigDecimal value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, BigDecimal value13, Integer value14, String value15, Integer value16, Date value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PatronTypeRecord
     */
    public PatronTypeRecord() {
        super(PatronType.PATRON_TYPE);
    }

    /**
     * Create a detached, initialised PatronTypeRecord
     */
    public PatronTypeRecord(Long id, Integer biblioLimit, String code, BigDecimal deposit, Integer duration, Date expiryDate, BigDecimal fineRate, Integer maxCantReservePeriod, Integer maxCollectablePeriod, Integer maxNoOfRenew, Integer maxNoOfReservations, Integer maxUncollectedNo, BigDecimal memberFee, Integer minRenewablePeriod, String name, Integer resumeBorrowablePeriod, Date startDate) {
        super(PatronType.PATRON_TYPE);

        set(0, id);
        set(1, biblioLimit);
        set(2, code);
        set(3, deposit);
        set(4, duration);
        set(5, expiryDate);
        set(6, fineRate);
        set(7, maxCantReservePeriod);
        set(8, maxCollectablePeriod);
        set(9, maxNoOfRenew);
        set(10, maxNoOfReservations);
        set(11, maxUncollectedNo);
        set(12, memberFee);
        set(13, minRenewablePeriod);
        set(14, name);
        set(15, resumeBorrowablePeriod);
        set(16, startDate);
    }
}
