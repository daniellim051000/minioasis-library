/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.DefaultSchema;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.tables.records.PatronRecord;


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
public class Patron extends TableImpl<PatronRecord> {

    private static final long serialVersionUID = 1046187863;

    /**
     * The reference instance of <code>PATRON</code>
     */
    public static final Patron PATRON = new Patron();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatronRecord> getRecordType() {
        return PatronRecord.class;
    }

    /**
     * The column <code>PATRON.ID</code>.
     */
    public final TableField<PatronRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PATRON.ACTIVE</code>.
     */
    public final TableField<PatronRecord, String> ACTIVE = createField(DSL.name("ACTIVE"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'Y'", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>PATRON.CARD_KEY</code>.
     */
    public final TableField<PatronRecord, String> CARD_KEY = createField(DSL.name("CARD_KEY"), org.jooq.impl.SQLDataType.CHAR(16).nullable(false), this, "");

    /**
     * The column <code>PATRON.ADDRESS1</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS1 = createField(DSL.name("ADDRESS1"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.ADDRESS2</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS2 = createField(DSL.name("ADDRESS2"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.ADDRESS3</code>.
     */
    public final TableField<PatronRecord, String> ADDRESS3 = createField(DSL.name("ADDRESS3"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.CITY</code>.
     */
    public final TableField<PatronRecord, String> CITY = createField(DSL.name("CITY"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.COUNTRY</code>.
     */
    public final TableField<PatronRecord, String> COUNTRY = createField(DSL.name("COUNTRY"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.POSTCODE</code>.
     */
    public final TableField<PatronRecord, String> POSTCODE = createField(DSL.name("POSTCODE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.STATE</code>.
     */
    public final TableField<PatronRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.EMAIL</code>.
     */
    public final TableField<PatronRecord, String> EMAIL = createField(DSL.name("EMAIL"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.MOBILE</code>.
     */
    public final TableField<PatronRecord, String> MOBILE = createField(DSL.name("MOBILE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.TEL</code>.
     */
    public final TableField<PatronRecord, String> TEL = createField(DSL.name("TEL"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.CREATED</code>.
     */
    public final TableField<PatronRecord, Timestamp> CREATED = createField(DSL.name("CREATED"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6), this, "");

    /**
     * The column <code>PATRON.END_DATE</code>.
     */
    public final TableField<PatronRecord, Date> END_DATE = createField(DSL.name("END_DATE"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PATRON.ENTANGLED</code>.
     */
    public final TableField<PatronRecord, String> ENTANGLED = createField(DSL.name("ENTANGLED"), org.jooq.impl.SQLDataType.CHAR(16).nullable(false), this, "");

    /**
     * The column <code>PATRON.GENDER</code>.
     */
    public final TableField<PatronRecord, String> GENDER = createField(DSL.name("GENDER"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.IC</code>.
     */
    public final TableField<PatronRecord, String> IC = createField(DSL.name("IC"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.NAME</code>.
     */
    public final TableField<PatronRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.NAME2</code>.
     */
    public final TableField<PatronRecord, String> NAME2 = createField(DSL.name("NAME2"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PATRON.NOTE</code>.
     */
    public final TableField<PatronRecord, String> NOTE = createField(DSL.name("NOTE"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PATRON.ORDER_NO</code>.
     */
    public final TableField<PatronRecord, Short> ORDER_NO = createField(DSL.name("ORDER_NO"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>PATRON.RESERVABLE_DATE</code>.
     */
    public final TableField<PatronRecord, Date> RESERVABLE_DATE = createField(DSL.name("RESERVABLE_DATE"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PATRON.START_DATE</code>.
     */
    public final TableField<PatronRecord, Date> START_DATE = createField(DSL.name("START_DATE"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>PATRON.UNCOLLECTED_NO</code>.
     */
    public final TableField<PatronRecord, Short> UNCOLLECTED_NO = createField(DSL.name("UNCOLLECTED_NO"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>PATRON.UPDATED</code>.
     */
    public final TableField<PatronRecord, Timestamp> UPDATED = createField(DSL.name("UPDATED"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6), this, "");

    /**
     * The column <code>PATRON.GROUP_ID</code>.
     */
    public final TableField<PatronRecord, Long> GROUP_ID = createField(DSL.name("GROUP_ID"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PATRON.PATRONTYPE_ID</code>.
     */
    public final TableField<PatronRecord, Long> PATRONTYPE_ID = createField(DSL.name("PATRONTYPE_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PATRON</code> table reference
     */
    public Patron() {
        this(DSL.name("PATRON"), null);
    }

    /**
     * Create an aliased <code>PATRON</code> table reference
     */
    public Patron(String alias) {
        this(DSL.name(alias), PATRON);
    }

    /**
     * Create an aliased <code>PATRON</code> table reference
     */
    public Patron(Name alias) {
        this(alias, PATRON);
    }

    private Patron(Name alias, Table<PatronRecord> aliased) {
        this(alias, aliased, null);
    }

    private Patron(Name alias, Table<PatronRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Patron(Table<O> child, ForeignKey<O, PatronRecord> key) {
        super(child, key, PATRON);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_PATRON_GROUP_INDEX_8, Indexes.FK_PATRON_PATRONTYPE_INDEX_8, Indexes.PRIMARY_KEY_8C, Indexes.UK_3CND47DLNMG4XI9OQ6JNI97X3_INDEX_8, Indexes.UK_E9FRUVR3H2998KELNJ73YM6CY_INDEX_8);
    }

    @Override
    public UniqueKey<PatronRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8C;
    }

    @Override
    public List<UniqueKey<PatronRecord>> getKeys() {
        return Arrays.<UniqueKey<PatronRecord>>asList(Keys.CONSTRAINT_8C, Keys.UK_3CND47DLNMG4XI9OQ6JNI97X3, Keys.UK_E9FRUVR3H2998KELNJ73YM6CY);
    }

    @Override
    public List<ForeignKey<PatronRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PatronRecord, ?>>asList(Keys.FK_PATRON_GROUP, Keys.FK_PATRON_PATRONTYPE);
    }

    public Groups groups() {
        return new Groups(this, Keys.FK_PATRON_GROUP);
    }

    public PatronType patronType() {
        return new PatronType(this, Keys.FK_PATRON_PATRONTYPE);
    }

    @Override
    public Patron as(String alias) {
        return new Patron(DSL.name(alias), this);
    }

    @Override
    public Patron as(Name alias) {
        return new Patron(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Patron rename(String name) {
        return new Patron(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Patron rename(Name name) {
        return new Patron(name, null);
    }
}
