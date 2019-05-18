/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.Public;
import org.minioasis.library.jooq.tables.records.ItemDurationRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemDuration extends TableImpl<ItemDurationRecord> {

    private static final long serialVersionUID = 1934980953;

    /**
     * The reference instance of <code>PUBLIC.ITEM_DURATION</code>
     */
    public static final ItemDuration ITEM_DURATION = new ItemDuration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemDurationRecord> getRecordType() {
        return ItemDurationRecord.class;
    }

    /**
     * The column <code>PUBLIC.ITEM_DURATION.ID</code>.
     */
    public final TableField<ItemDurationRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.ITEM_DURATION.NAME</code>.
     */
    public final TableField<ItemDurationRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ITEM_DURATION.ITEM_DURATION_VALUE</code>.
     */
    public final TableField<ItemDurationRecord, Integer> ITEM_DURATION_VALUE = createField("ITEM_DURATION_VALUE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.ITEM_DURATION</code> table reference
     */
    public ItemDuration() {
        this(DSL.name("ITEM_DURATION"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.ITEM_DURATION</code> table reference
     */
    public ItemDuration(String alias) {
        this(DSL.name(alias), ITEM_DURATION);
    }

    /**
     * Create an aliased <code>PUBLIC.ITEM_DURATION</code> table reference
     */
    public ItemDuration(Name alias) {
        this(alias, ITEM_DURATION);
    }

    private ItemDuration(Name alias, Table<ItemDurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemDuration(Name alias, Table<ItemDurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_E, Indexes.UK_EUJ6H91X1IYUL76UX181OQL98_INDEX_E);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ItemDurationRecord, Long> getIdentity() {
        return Keys.IDENTITY_ITEM_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ItemDurationRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_E;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemDurationRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemDurationRecord>>asList(Keys.CONSTRAINT_E, Keys.UK_EUJ6H91X1IYUL76UX181OQL98);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDuration as(String alias) {
        return new ItemDuration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemDuration as(Name alias) {
        return new ItemDuration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemDuration rename(String name) {
        return new ItemDuration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemDuration rename(Name name) {
        return new ItemDuration(name, null);
    }
}