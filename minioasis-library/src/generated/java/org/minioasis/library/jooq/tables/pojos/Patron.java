/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Patron implements Serializable {

    private static final long serialVersionUID = 1314180335;

    private Long      id;
    private String    active;
    private String    cardKey;
    private String    address1;
    private String    address2;
    private String    address3;
    private String    city;
    private String    country;
    private String    postcode;
    private String    state;
    private String    email;
    private String    mobile;
    private String    tel;
    private Timestamp created;
    private Date      endDate;
    private String    entangled;
    private String    gender;
    private String    ic;
    private String    name;
    private String    name2;
    private String    note;
    private Short     orderNo;
    private Date      startDate;
    private Short     uncollectedNo;
    private Timestamp updated;
    private Long      groupId;
    private Long      patrontypeId;

    public Patron() {}

    public Patron(Patron value) {
        this.id = value.id;
        this.active = value.active;
        this.cardKey = value.cardKey;
        this.address1 = value.address1;
        this.address2 = value.address2;
        this.address3 = value.address3;
        this.city = value.city;
        this.country = value.country;
        this.postcode = value.postcode;
        this.state = value.state;
        this.email = value.email;
        this.mobile = value.mobile;
        this.tel = value.tel;
        this.created = value.created;
        this.endDate = value.endDate;
        this.entangled = value.entangled;
        this.gender = value.gender;
        this.ic = value.ic;
        this.name = value.name;
        this.name2 = value.name2;
        this.note = value.note;
        this.orderNo = value.orderNo;
        this.startDate = value.startDate;
        this.uncollectedNo = value.uncollectedNo;
        this.updated = value.updated;
        this.groupId = value.groupId;
        this.patrontypeId = value.patrontypeId;
    }

    public Patron(
        Long      id,
        String    active,
        String    cardKey,
        String    address1,
        String    address2,
        String    address3,
        String    city,
        String    country,
        String    postcode,
        String    state,
        String    email,
        String    mobile,
        String    tel,
        Timestamp created,
        Date      endDate,
        String    entangled,
        String    gender,
        String    ic,
        String    name,
        String    name2,
        String    note,
        Short     orderNo,
        Date      startDate,
        Short     uncollectedNo,
        Timestamp updated,
        Long      groupId,
        Long      patrontypeId
    ) {
        this.id = id;
        this.active = active;
        this.cardKey = cardKey;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
        this.state = state;
        this.email = email;
        this.mobile = mobile;
        this.tel = tel;
        this.created = created;
        this.endDate = endDate;
        this.entangled = entangled;
        this.gender = gender;
        this.ic = ic;
        this.name = name;
        this.name2 = name2;
        this.note = note;
        this.orderNo = orderNo;
        this.startDate = startDate;
        this.uncollectedNo = uncollectedNo;
        this.updated = updated;
        this.groupId = groupId;
        this.patrontypeId = patrontypeId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCardKey() {
        return this.cardKey;
    }

    public void setCardKey(String cardKey) {
        this.cardKey = cardKey;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEntangled() {
        return this.entangled;
    }

    public void setEntangled(String entangled) {
        this.entangled = entangled;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIc() {
        return this.ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return this.name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Short getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(Short orderNo) {
        this.orderNo = orderNo;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Short getUncollectedNo() {
        return this.uncollectedNo;
    }

    public void setUncollectedNo(Short uncollectedNo) {
        this.uncollectedNo = uncollectedNo;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getPatrontypeId() {
        return this.patrontypeId;
    }

    public void setPatrontypeId(Long patrontypeId) {
        this.patrontypeId = patrontypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Patron (");

        sb.append(id);
        sb.append(", ").append(active);
        sb.append(", ").append(cardKey);
        sb.append(", ").append(address1);
        sb.append(", ").append(address2);
        sb.append(", ").append(address3);
        sb.append(", ").append(city);
        sb.append(", ").append(country);
        sb.append(", ").append(postcode);
        sb.append(", ").append(state);
        sb.append(", ").append(email);
        sb.append(", ").append(mobile);
        sb.append(", ").append(tel);
        sb.append(", ").append(created);
        sb.append(", ").append(endDate);
        sb.append(", ").append(entangled);
        sb.append(", ").append(gender);
        sb.append(", ").append(ic);
        sb.append(", ").append(name);
        sb.append(", ").append(name2);
        sb.append(", ").append(note);
        sb.append(", ").append(orderNo);
        sb.append(", ").append(startDate);
        sb.append(", ").append(uncollectedNo);
        sb.append(", ").append(updated);
        sb.append(", ").append(groupId);
        sb.append(", ").append(patrontypeId);

        sb.append(")");
        return sb.toString();
    }
}
