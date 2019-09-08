/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.DefaultSchema;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.tables.records.JournalEntryLineRecord;


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
public class JournalEntryLine extends TableImpl<JournalEntryLineRecord> {

    private static final long serialVersionUID = -1786991557;

    /**
     * The reference instance of <code>JOURNAL_ENTRY_LINE</code>
     */
    public static final JournalEntryLine JOURNAL_ENTRY_LINE = new JournalEntryLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JournalEntryLineRecord> getRecordType() {
        return JournalEntryLineRecord.class;
    }

    /**
     * The column <code>JOURNAL_ENTRY_LINE.ID</code>.
     */
    public final TableField<JournalEntryLineRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.CREDIT</code>.
     */
    public final TableField<JournalEntryLineRecord, BigDecimal> CREDIT = createField(DSL.name("CREDIT"), org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.DEBIT</code>.
     */
    public final TableField<JournalEntryLineRecord, BigDecimal> DEBIT = createField(DSL.name("DEBIT"), org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.DESCRIPTION</code>.
     */
    public final TableField<JournalEntryLineRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.REFERENCE</code>.
     */
    public final TableField<JournalEntryLineRecord, String> REFERENCE = createField(DSL.name("REFERENCE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.ACCOUNT_ID</code>.
     */
    public final TableField<JournalEntryLineRecord, Long> ACCOUNT_ID = createField(DSL.name("ACCOUNT_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>JOURNAL_ENTRY_LINE.JOURNALENTRY_ID</code>.
     */
    public final TableField<JournalEntryLineRecord, Long> JOURNALENTRY_ID = createField(DSL.name("JOURNALENTRY_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>JOURNAL_ENTRY_LINE</code> table reference
     */
    public JournalEntryLine() {
        this(DSL.name("JOURNAL_ENTRY_LINE"), null);
    }

    /**
     * Create an aliased <code>JOURNAL_ENTRY_LINE</code> table reference
     */
    public JournalEntryLine(String alias) {
        this(DSL.name(alias), JOURNAL_ENTRY_LINE);
    }

    /**
     * Create an aliased <code>JOURNAL_ENTRY_LINE</code> table reference
     */
    public JournalEntryLine(Name alias) {
        this(alias, JOURNAL_ENTRY_LINE);
    }

    private JournalEntryLine(Name alias, Table<JournalEntryLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private JournalEntryLine(Name alias, Table<JournalEntryLineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JournalEntryLine(Table<O> child, ForeignKey<O, JournalEntryLineRecord> key) {
        super(child, key, JOURNAL_ENTRY_LINE);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_JOURNALENTRYLINE_ACCOUNT_INDEX_F, Indexes.FK_JOURNALENTRYLINE_JOURNALENTRY_INDEX_F, Indexes.PRIMARY_KEY_F);
    }

    @Override
    public UniqueKey<JournalEntryLineRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_F;
    }

    @Override
    public List<UniqueKey<JournalEntryLineRecord>> getKeys() {
        return Arrays.<UniqueKey<JournalEntryLineRecord>>asList(Keys.CONSTRAINT_F);
    }

    @Override
    public List<ForeignKey<JournalEntryLineRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JournalEntryLineRecord, ?>>asList(Keys.FK_JOURNALENTRYLINE_ACCOUNT, Keys.FK_JOURNALENTRYLINE_JOURNALENTRY);
    }

    public Account account() {
        return new Account(this, Keys.FK_JOURNALENTRYLINE_ACCOUNT);
    }

    public JournalEntry journalEntry() {
        return new JournalEntry(this, Keys.FK_JOURNALENTRYLINE_JOURNALENTRY);
    }

    @Override
    public JournalEntryLine as(String alias) {
        return new JournalEntryLine(DSL.name(alias), this);
    }

    @Override
    public JournalEntryLine as(Name alias) {
        return new JournalEntryLine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JournalEntryLine rename(String name) {
        return new JournalEntryLine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JournalEntryLine rename(Name name) {
        return new JournalEntryLine(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, BigDecimal, BigDecimal, String, String, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
