
package com.hl7.diagnostic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coding"
})
public class Interpretation implements Serializable
{

    @JsonProperty("coding")
    private List<Coding> coding = new ArrayList<Coding>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6733743907763872431L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Interpretation() {
    }

    /**
     * 
     * @param coding
     */
    public Interpretation(List<Coding> coding) {
        super();
        this.coding = coding;
    }

    @JsonProperty("coding")
    public List<Coding> getCoding() {
        return coding;
    }

    @JsonProperty("coding")
    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("coding", coding).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(coding).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interpretation) == false) {
            return false;
        }
        Interpretation rhs = ((Interpretation) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(coding, rhs.coding).isEquals();
    }

}
