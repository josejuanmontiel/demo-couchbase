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
    "locations",
    "set"
})
public class XmediaLocation {

    @JsonProperty("locations")
    private List<Location> locations = new ArrayList<Location>();
    @JsonProperty("set")
    private Integer set;

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
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
        return new ToStringBuilder(this).append("locations", locations).append("set", set).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(locations).append(set).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XmediaLocation) == false) {
            return false;
        }
        XmediaLocation rhs = ((XmediaLocation) other);
        return new EqualsBuilder().append(locations, rhs.locations).append(set, rhs.set).isEquals();
    }

}
