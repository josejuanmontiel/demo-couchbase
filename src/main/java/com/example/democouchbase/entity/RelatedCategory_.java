package com.example.democouchbase.entity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "identifier",
    "name",
    "urlCategory"
})
public class RelatedCategory_ {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("name")
    private String name;
    @JsonProperty("urlCategory")
    private Boolean urlCategory;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("urlCategory")
    public Boolean getUrlCategory() {
        return urlCategory;
    }

    @JsonProperty("urlCategory")
    public void setUrlCategory(Boolean urlCategory) {
        this.urlCategory = urlCategory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("identifier", identifier).append("name", name).append("urlCategory", urlCategory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(identifier).append(id).append(urlCategory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedCategory_) == false) {
            return false;
        }
        RelatedCategory_ rhs = ((RelatedCategory_) other);
        return new EqualsBuilder().append(name, rhs.name).append(identifier, rhs.identifier).append(id, rhs.id).append(urlCategory, rhs.urlCategory).isEquals();
    }

}
