
package com.fhir.diagnosticmedicinemodule;

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
    "coding",
    "text"
})
public class Code implements Serializable
{

    @JsonProperty("coding")
    private List<Coding> coding = new ArrayList<Coding>();
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3161806457710657733L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Code() {
    }

    /**
     * 
     * @param text
     * @param coding
     */
    public Code(List<Coding> coding, String text) {
        super();
        this.coding = coding;
        this.text = text;
    }

    @JsonProperty("coding")
    public List<Coding> getCoding() {
        return coding;
    }

    @JsonProperty("coding")
    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
        return new ToStringBuilder(this).append("coding", coding).append("text", text).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(additionalProperties).append(coding).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Code) == false) {
            return false;
        }
        Code rhs = ((Code) other);
        return new EqualsBuilder().append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(coding, rhs.coding).isEquals();
    }

}
