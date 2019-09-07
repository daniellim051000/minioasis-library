/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row20;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.DefaultSchema;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.tables.records.ItemRecord;


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
public class Item extends TableImpl<ItemRecord> {

    private static final long serialVersionUID = -632613247;

    /**
     * The reference instance of <code>ITEM</code>
     */
    public static final Item ITEM = new Item();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemRecord> getRecordType() {
        return ItemRecord.class;
    }

    /**
     * The column <code>ITEM.ID</code>.
     */
    public final TableField<ItemRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>ITEM.ACTIVE</code>.
     */
    public final TableField<ItemRecord, String> ACTIVE = createField(DSL.name("ACTIVE"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'Y'", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>ITEM.BARCODE</code>.
     */
    public final TableField<ItemRecord, String> BARCODE = createField(DSL.name("BARCODE"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ITEM.CHECKED</code>.
     */
    public final TableField<ItemRecord, String> CHECKED = createField(DSL.name("CHECKED"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * The column <code>ITEM.CREATED</code>.
     */
    public final TableField<ItemRecord, Date> CREATED = createField(DSL.name("CREATED"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>ITEM.EXPIRED</code>.
     */
    public final TableField<ItemRecord, Timestamp> EXPIRED = createField(DSL.name("EXPIRED"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6), this, "");

    /**
     * The column <code>ITEM.FIRST_CHECKIN</code>.
     */
    public final TableField<ItemRecord, Date> FIRST_CHECKIN = createField(DSL.name("FIRST_CHECKIN"), org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>ITEM.LAST_CHECKIN</code>.
     */
    public final TableField<ItemRecord, Timestamp> LAST_CHECKIN = createField(DSL.name("LAST_CHECKIN"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6), this, "");

    /**
     * The column <code>ITEM.LAST_FULL_RENEW_PERSON</code>.
     */
    public final TableField<ItemRecord, String> LAST_FULL_RENEW_PERSON = createField(DSL.name("LAST_FULL_RENEW_PERSON"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ITEM.PRICE</code>.
     */
    public final TableField<ItemRecord, BigDecimal> PRICE = createField(DSL.name("PRICE"), org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false), this, "");

    /**
     * The column <code>ITEM.SHELF_MARK</code>.
     */
    public final TableField<ItemRecord, String> SHELF_MARK = createField(DSL.name("SHELF_MARK"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ITEM.SOURCE</code>.
     */
    public final TableField<ItemRecord, String> SOURCE = createField(DSL.name("SOURCE"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>ITEM.BORROWABLE</code>.
     */
    public final TableField<ItemRecord, Boolean> BORROWABLE = createField(DSL.name("BORROWABLE"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>ITEM.RESERVABLE</code>.
     */
    public final TableField<ItemRecord, Boolean> RESERVABLE = createField(DSL.name("RESERVABLE"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>ITEM.STATE</code>.
     */
    public final TableField<ItemRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>ITEM.PUBLISHING_DATE</code>.
     */
    public final TableField<ItemRecord, Date> PUBLISHING_DATE = createField(DSL.name("PUBLISHING_DATE"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>ITEM.VOLUME_NO</code>.
     */
    public final TableField<ItemRecord, String> VOLUME_NO = createField(DSL.name("VOLUME_NO"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>ITEM.BIBLIO_ID</code>.
     */
    public final TableField<ItemRecord, Long> BIBLIO_ID = createField(DSL.name("BIBLIO_ID"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ITEM.ITEM_STATUS_ID</code>.
     */
    public final TableField<ItemRecord, Long> ITEM_STATUS_ID = createField(DSL.name("ITEM_STATUS_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>ITEM.LOCATION_ID</code>.
     */
    public final TableField<ItemRecord, Long> LOCATION_ID = createField(DSL.name("LOCATION_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>ITEM</code> table reference
     */
    public Item() {
        this(DSL.name("ITEM"), null);
    }

    /**
     * Create an aliased <code>ITEM</code> table reference
     */
    public Item(String alias) {
        this(DSL.name(alias), ITEM);
    }

    /**
     * Create an aliased <code>ITEM</code> table reference
     */
    public Item(Name alias) {
        this(alias, ITEM);
    }

    private Item(Name alias, Table<ItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Item(Name alias, Table<ItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Item(Table<O> child, ForeignKey<O, ItemRecord> key) {
        super(child, key, ITEM);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_ITEM_BIBLIO_INDEX_2, Indexes.FK_ITEM_ITEMSTATUS_INDEX_2, Indexes.FK_ITEM_LOCATION_INDEX_2, Indexes.PRIMARY_KEY_2, Indexes.UK_BFO0NHIH8F3JL9M9UBLNXR4UY_INDEX_2);
    }

    @Override
    public Identity<ItemRecord, Long> getIdentity() {
        return Keys.IDENTITY_ITEM;
    }

    @Override
    public UniqueKey<ItemRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_2;
    }

    @Override
    public List<UniqueKey<ItemRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemRecord>>asList(Keys.CONSTRAINT_2, Keys.UK_BFO0NHIH8F3JL9M9UBLNXR4UY);
    }

    @Override
    public List<ForeignKey<ItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ItemRecord, ?>>asList(Keys.FK_ITEM_BIBLIO, Keys.FK_ITEM_ITEMSTATUS, Keys.FK_ITEM_LOCATION);
    }

    public Biblio biblio() {
        return new Biblio(this, Keys.FK_ITEM_BIBLIO);
    }

    public ItemStatus itemStatus() {
        return new ItemStatus(this, Keys.FK_ITEM_ITEMSTATUS);
    }

    public Location location() {
        return new Location(this, Keys.FK_ITEM_LOCATION);
    }

    @Override
    public Item as(String alias) {
        return new Item(DSL.name(alias), this);
    }

    @Override
    public Item as(Name alias) {
        return new Item(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(String name) {
        return new Item(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(Name name) {
        return new Item(name, null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, String, String, String, Date, Timestamp, Date, Timestamp, String, BigDecimal, String, String, Boolean, Boolean, String, Date, String, Long, Long, Long> fieldsRow() {
        return (Row20) super.fieldsRow();
    }
}
