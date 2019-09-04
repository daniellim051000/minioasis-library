/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import org.minioasis.library.jooq.tables.records.BiblioRecord;


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
public class Biblio extends TableImpl<BiblioRecord> {

    private static final long serialVersionUID = -424799992;

    /**
     * The reference instance of <code>PUBLIC.BIBLIO</code>
     */
    public static final Biblio BIBLIO = new Biblio();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BiblioRecord> getRecordType() {
        return BiblioRecord.class;
    }

    /**
     * The column <code>PUBLIC.BIBLIO.ID</code>.
     */
    public final TableField<BiblioRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.ACTIVE</code>.
     */
    public final TableField<BiblioRecord, String> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.AUTHOR</code>.
     */
    public final TableField<BiblioRecord, String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.BIBLIO_TYPE</code>.
     */
    public final TableField<BiblioRecord, String> BIBLIO_TYPE = createField("BIBLIO_TYPE", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.BINDING</code>.
     */
    public final TableField<BiblioRecord, String> BINDING = createField("BINDING", org.jooq.impl.SQLDataType.CHAR(1), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.CLASS_MARK</code>.
     */
    public final TableField<BiblioRecord, String> CLASS_MARK = createField("CLASS_MARK", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.DESCRIPTION</code>.
     */
    public final TableField<BiblioRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.EDITION</code>.
     */
    public final TableField<BiblioRecord, String> EDITION = createField("EDITION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.IMAGE_ID</code>.
     */
    public final TableField<BiblioRecord, String> IMAGE_ID = createField("IMAGE_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.ISBN</code>.
     */
    public final TableField<BiblioRecord, String> ISBN = createField("ISBN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.CODEN</code>.
     */
    public final TableField<BiblioRecord, String> CODEN = createField("CODEN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.ISSN</code>.
     */
    public final TableField<BiblioRecord, String> ISSN = createField("ISSN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.LANGUAGE</code>.
     */
    public final TableField<BiblioRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.NOTE</code>.
     */
    public final TableField<BiblioRecord, String> NOTE = createField("NOTE", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.PAGES</code>.
     */
    public final TableField<BiblioRecord, Integer> PAGES = createField("PAGES", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.PUBLICATION_PLACE</code>.
     */
    public final TableField<BiblioRecord, String> PUBLICATION_PLACE = createField("PUBLICATION_PLACE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.PUBLISHING_YEAR</code>.
     */
    public final TableField<BiblioRecord, Integer> PUBLISHING_YEAR = createField("PUBLISHING_YEAR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.TOPIC</code>.
     */
    public final TableField<BiblioRecord, String> TOPIC = createField("TOPIC", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.TITLE</code>.
     */
    public final TableField<BiblioRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.UPDATED</code>.
     */
    public final TableField<BiblioRecord, Timestamp> UPDATED = createField("UPDATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.PUBLISHER_ID</code>.
     */
    public final TableField<BiblioRecord, Long> PUBLISHER_ID = createField("PUBLISHER_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.BIBLIO.SERIES_ID</code>.
     */
    public final TableField<BiblioRecord, Long> SERIES_ID = createField("SERIES_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>PUBLIC.BIBLIO</code> table reference
     */
    public Biblio() {
        this(DSL.name("BIBLIO"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BIBLIO</code> table reference
     */
    public Biblio(String alias) {
        this(DSL.name(alias), BIBLIO);
    }

    /**
     * Create an aliased <code>PUBLIC.BIBLIO</code> table reference
     */
    public Biblio(Name alias) {
        this(alias, BIBLIO);
    }

    private Biblio(Name alias, Table<BiblioRecord> aliased) {
        this(alias, aliased, null);
    }

    private Biblio(Name alias, Table<BiblioRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.FK_BIBLIO_PUBLISHER_INDEX_7, Indexes.FK_BIBLIO_SERIES_INDEX_7, Indexes.PRIMARY_KEY_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BiblioRecord, Long> getIdentity() {
        return Keys.IDENTITY_BIBLIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BiblioRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BiblioRecord>> getKeys() {
        return Arrays.<UniqueKey<BiblioRecord>>asList(Keys.CONSTRAINT_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BiblioRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BiblioRecord, ?>>asList(Keys.FK_BIBLIO_PUBLISHER, Keys.FK_BIBLIO_SERIES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Biblio as(String alias) {
        return new Biblio(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Biblio as(Name alias) {
        return new Biblio(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Biblio rename(String name) {
        return new Biblio(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Biblio rename(Name name) {
        return new Biblio(name, null);
    }
}
