/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.BiblioTag;
import org.minioasis.library.jooq.tables.records.BiblioTagRecord;


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
public class BiblioTagDao extends DAOImpl<BiblioTagRecord, org.minioasis.library.jooq.tables.pojos.BiblioTag, Record2<Long, Long>> {

    /**
     * Create a new BiblioTagDao without any configuration
     */
    public BiblioTagDao() {
        super(BiblioTag.BIBLIO_TAG, org.minioasis.library.jooq.tables.pojos.BiblioTag.class);
    }

    /**
     * Create a new BiblioTagDao with an attached configuration
     */
    public BiblioTagDao(Configuration configuration) {
        super(BiblioTag.BIBLIO_TAG, org.minioasis.library.jooq.tables.pojos.BiblioTag.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(org.minioasis.library.jooq.tables.pojos.BiblioTag object) {
        return compositeKeyRecord(object.getBiblioId(), object.getTagId());
    }

    /**
     * Fetch records that have <code>BIBLIO_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.BiblioTag> fetchByBiblioId(Long... values) {
        return fetch(BiblioTag.BIBLIO_TAG.BIBLIO_ID, values);
    }

    /**
     * Fetch records that have <code>TAG_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.BiblioTag> fetchByTagId(Long... values) {
        return fetch(BiblioTag.BIBLIO_TAG.TAG_ID, values);
    }
}