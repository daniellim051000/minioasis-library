/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;

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
public class BiblioTag implements Serializable {

    private static final long serialVersionUID = -1365496736;

    private final Long biblioId;
    private final Long tagId;

    public BiblioTag(BiblioTag value) {
        this.biblioId = value.biblioId;
        this.tagId = value.tagId;
    }

    public BiblioTag(
        Long biblioId,
        Long tagId
    ) {
        this.biblioId = biblioId;
        this.tagId = tagId;
    }

    public Long getBiblioId() {
        return this.biblioId;
    }

    public Long getTagId() {
        return this.tagId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BiblioTag (");

        sb.append(biblioId);
        sb.append(", ").append(tagId);

        sb.append(")");
        return sb.toString();
    }
}
