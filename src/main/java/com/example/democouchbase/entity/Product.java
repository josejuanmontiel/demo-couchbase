package com.example.democouchbase.entity;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "gridElemType",
    "name",
    "nameEn",
    "productUrl",
    "productUrlParam",
    "image",
    "isBuyable",
    "onSpecial",
    "backSoon",
    "unitsLot",
    "isTop",
    "sizeSystem",
    "subFamily",
    "productType",
    "bundleColors",
    "tags",
    "attributes",
    "relatedCategories",
    "attachments",
    "bundleProductSummaries",
    "detail",
    "field5",
    "sequence",
    "section",
    "family",
    "sectionName",
    "sectionNameEN",
    "subFamilyName",
    "subFamilyNameEN",
    "startDate",
    "isSales",
    "availabilityDate",
    "familyName",
    "familyNameEN"
})
@Document
public class Product {

	@Id
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("gridElemType")
    private String gridElemType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameEn")
    private String nameEn;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("productUrlParam")
    private String productUrlParam;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("isBuyable")
    private Boolean isBuyable;
    @JsonProperty("onSpecial")
    private Boolean onSpecial;
    @JsonProperty("backSoon")
    private String backSoon;
    @JsonProperty("unitsLot")
    private Integer unitsLot;
    @JsonProperty("isTop")
    private Integer isTop;
    @JsonProperty("sizeSystem")
    private String sizeSystem;
    @JsonProperty("subFamily")
    private String subFamily;
    @JsonProperty("productType")
    private String productType;
    @JsonProperty("bundleColors")
    private List<BundleColor> bundleColors = new ArrayList<BundleColor>();
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonProperty("relatedCategories")
    private List<RelatedCategory> relatedCategories = new ArrayList<RelatedCategory>();
    @JsonProperty("attachments")
    private List<Object> attachments = new ArrayList<Object>();
    @JsonProperty("bundleProductSummaries")
    private List<BundleProductSummary> bundleProductSummaries = new ArrayList<BundleProductSummary>();
    @JsonProperty("detail")
    private Detail_ detail;
    @JsonProperty("field5")
    private Object field5;
    @JsonProperty("sequence")
    private Double sequence;
    @JsonProperty("section")
    private String section;
    @JsonProperty("family")
    private String family;
    @JsonProperty("sectionName")
    private String sectionName;
    @JsonProperty("sectionNameEN")
    private String sectionNameEN;
    @JsonProperty("subFamilyName")
    private String subFamilyName;
    @JsonProperty("subFamilyNameEN")
    private String subFamilyNameEN;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("isSales")
    private Object isSales;
    @JsonProperty("availabilityDate")
    private String availabilityDate;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("familyNameEN")
    private String familyNameEN;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("gridElemType")
    public String getGridElemType() {
        return gridElemType;
    }

    @JsonProperty("gridElemType")
    public void setGridElemType(String gridElemType) {
        this.gridElemType = gridElemType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameEn")
    public String getNameEn() {
        return nameEn;
    }

    @JsonProperty("nameEn")
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @JsonProperty("productUrl")
    public String getProductUrl() {
        return productUrl;
    }

    @JsonProperty("productUrl")
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    @JsonProperty("productUrlParam")
    public String getProductUrlParam() {
        return productUrlParam;
    }

    @JsonProperty("productUrlParam")
    public void setProductUrlParam(String productUrlParam) {
        this.productUrlParam = productUrlParam;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("isBuyable")
    public Boolean getIsBuyable() {
        return isBuyable;
    }

    @JsonProperty("isBuyable")
    public void setIsBuyable(Boolean isBuyable) {
        this.isBuyable = isBuyable;
    }

    @JsonProperty("onSpecial")
    public Boolean getOnSpecial() {
        return onSpecial;
    }

    @JsonProperty("onSpecial")
    public void setOnSpecial(Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }

    @JsonProperty("backSoon")
    public String getBackSoon() {
        return backSoon;
    }

    @JsonProperty("backSoon")
    public void setBackSoon(String backSoon) {
        this.backSoon = backSoon;
    }

    @JsonProperty("unitsLot")
    public Integer getUnitsLot() {
        return unitsLot;
    }

    @JsonProperty("unitsLot")
    public void setUnitsLot(Integer unitsLot) {
        this.unitsLot = unitsLot;
    }

    @JsonProperty("isTop")
    public Integer getIsTop() {
        return isTop;
    }

    @JsonProperty("isTop")
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    @JsonProperty("sizeSystem")
    public String getSizeSystem() {
        return sizeSystem;
    }

    @JsonProperty("sizeSystem")
    public void setSizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
    }

    @JsonProperty("subFamily")
    public String getSubFamily() {
        return subFamily;
    }

    @JsonProperty("subFamily")
    public void setSubFamily(String subFamily) {
        this.subFamily = subFamily;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("bundleColors")
    public List<BundleColor> getBundleColors() {
        return bundleColors;
    }

    @JsonProperty("bundleColors")
    public void setBundleColors(List<BundleColor> bundleColors) {
        this.bundleColors = bundleColors;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("relatedCategories")
    public List<RelatedCategory> getRelatedCategories() {
        return relatedCategories;
    }

    @JsonProperty("relatedCategories")
    public void setRelatedCategories(List<RelatedCategory> relatedCategories) {
        this.relatedCategories = relatedCategories;
    }

    @JsonProperty("attachments")
    public List<Object> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("bundleProductSummaries")
    public List<BundleProductSummary> getBundleProductSummaries() {
        return bundleProductSummaries;
    }

    @JsonProperty("bundleProductSummaries")
    public void setBundleProductSummaries(List<BundleProductSummary> bundleProductSummaries) {
        this.bundleProductSummaries = bundleProductSummaries;
    }

    @JsonProperty("detail")
    public Detail_ getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(Detail_ detail) {
        this.detail = detail;
    }

    @JsonProperty("field5")
    public Object getField5() {
        return field5;
    }

    @JsonProperty("field5")
    public void setField5(Object field5) {
        this.field5 = field5;
    }

    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    @JsonProperty("sectionName")
    public String getSectionName() {
        return sectionName;
    }

    @JsonProperty("sectionName")
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @JsonProperty("sectionNameEN")
    public String getSectionNameEN() {
        return sectionNameEN;
    }

    @JsonProperty("sectionNameEN")
    public void setSectionNameEN(String sectionNameEN) {
        this.sectionNameEN = sectionNameEN;
    }

    @JsonProperty("subFamilyName")
    public String getSubFamilyName() {
        return subFamilyName;
    }

    @JsonProperty("subFamilyName")
    public void setSubFamilyName(String subFamilyName) {
        this.subFamilyName = subFamilyName;
    }

    @JsonProperty("subFamilyNameEN")
    public String getSubFamilyNameEN() {
        return subFamilyNameEN;
    }

    @JsonProperty("subFamilyNameEN")
    public void setSubFamilyNameEN(String subFamilyNameEN) {
        this.subFamilyNameEN = subFamilyNameEN;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("isSales")
    public Object getIsSales() {
        return isSales;
    }

    @JsonProperty("isSales")
    public void setIsSales(Object isSales) {
        this.isSales = isSales;
    }

    @JsonProperty("availabilityDate")
    public String getAvailabilityDate() {
        return availabilityDate;
    }

    @JsonProperty("availabilityDate")
    public void setAvailabilityDate(String availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("familyNameEN")
    public String getFamilyNameEN() {
        return familyNameEN;
    }

    @JsonProperty("familyNameEN")
    public void setFamilyNameEN(String familyNameEN) {
        this.familyNameEN = familyNameEN;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("type", type).append("gridElemType", gridElemType).append("name", name).append("nameEn", nameEn).append("productUrl", productUrl).append("productUrlParam", productUrlParam).append("image", image).append("isBuyable", isBuyable).append("onSpecial", onSpecial).append("backSoon", backSoon).append("unitsLot", unitsLot).append("isTop", isTop).append("sizeSystem", sizeSystem).append("subFamily", subFamily).append("productType", productType).append("bundleColors", bundleColors).append("tags", tags).append("attributes", attributes).append("relatedCategories", relatedCategories).append("attachments", attachments).append("bundleProductSummaries", bundleProductSummaries).append("detail", detail).append("field5", field5).append("sequence", sequence).append("section", section).append("family", family).append("sectionName", sectionName).append("sectionNameEN", sectionNameEN).append("subFamilyName", subFamilyName).append("subFamilyNameEN", subFamilyNameEN).append("startDate", startDate).append("isSales", isSales).append("availabilityDate", availabilityDate).append("familyName", familyName).append("familyNameEN", familyNameEN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subFamily).append(attachments).append(familyNameEN).append(subFamilyNameEN).append(isBuyable).append(relatedCategories).append(availabilityDate).append(section).append(type).append(bundleProductSummaries).append(sectionName).append(sectionNameEN).append(familyName).append(bundleColors).append(id).append(productType).append(image).append(sizeSystem).append(backSoon).append(isSales).append(nameEn).append(subFamilyName).append(tags).append(gridElemType).append(sequence).append(onSpecial).append(isTop).append(name).append(unitsLot).append(attributes).append(detail).append(productUrl).append(family).append(productUrlParam).append(field5).append(startDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(subFamily, rhs.subFamily).append(attachments, rhs.attachments).append(familyNameEN, rhs.familyNameEN).append(subFamilyNameEN, rhs.subFamilyNameEN).append(isBuyable, rhs.isBuyable).append(relatedCategories, rhs.relatedCategories).append(availabilityDate, rhs.availabilityDate).append(section, rhs.section).append(type, rhs.type).append(bundleProductSummaries, rhs.bundleProductSummaries).append(sectionName, rhs.sectionName).append(sectionNameEN, rhs.sectionNameEN).append(familyName, rhs.familyName).append(bundleColors, rhs.bundleColors).append(id, rhs.id).append(productType, rhs.productType).append(image, rhs.image).append(sizeSystem, rhs.sizeSystem).append(backSoon, rhs.backSoon).append(isSales, rhs.isSales).append(nameEn, rhs.nameEn).append(subFamilyName, rhs.subFamilyName).append(tags, rhs.tags).append(gridElemType, rhs.gridElemType).append(sequence, rhs.sequence).append(onSpecial, rhs.onSpecial).append(isTop, rhs.isTop).append(name, rhs.name).append(unitsLot, rhs.unitsLot).append(attributes, rhs.attributes).append(detail, rhs.detail).append(productUrl, rhs.productUrl).append(family, rhs.family).append(productUrlParam, rhs.productUrlParam).append(field5, rhs.field5).append(startDate, rhs.startDate).isEquals();
    }

}
