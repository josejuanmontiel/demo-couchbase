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
    "mediaLocations",
    "location"
})
public class Location {

    @JsonProperty("mediaLocations")
    private List<String> mediaLocations = new ArrayList<String>();
    @JsonProperty("location")
    private Integer location;

    @JsonProperty("mediaLocations")
    public List<String> getMediaLocations() {
        return mediaLocations;
    }

    @JsonProperty("mediaLocations")
    public void setMediaLocations(List<String> mediaLocations) {
        this.mediaLocations = mediaLocations;
    }

    @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mediaLocations", mediaLocations).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mediaLocations).append(location).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(mediaLocations, rhs.mediaLocations).append(location, rhs.location).isEquals();
    }

}
