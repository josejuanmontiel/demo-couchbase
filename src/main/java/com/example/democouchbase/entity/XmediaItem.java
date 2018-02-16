package com.example.democouchbase.entity;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "medias",
    "set"
})
public class XmediaItem {

    @JsonProperty("medias")
    private List<Media> medias = new ArrayList<Media>();
    @JsonProperty("set")
    private Integer set;

    @JsonProperty("medias")
    public List<Media> getMedias() {
        return medias;
    }

    @JsonProperty("medias")
    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    @JsonProperty("set")
    public Integer getSet() {
        return set;
    }

    @JsonProperty("set")
    public void setSet(Integer set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("medias", medias).append("set", set).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(medias).append(set).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XmediaItem) == false) {
            return false;
        }
        XmediaItem rhs = ((XmediaItem) other);
        return new EqualsBuilder().append(medias, rhs.medias).append(set, rhs.set).isEquals();
    }

}
