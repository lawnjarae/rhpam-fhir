
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
    "resourceType",
    "id",
    "status",
    "code",
    "subject",
    "performer",
    "valueQuantity",
    "referenceRange",
    "interpretation"
})
public class Contained implements Serializable
{

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("code")
    private Code code;
    @JsonProperty("subject")
    private Subject subject;
    @JsonProperty("performer")
    private List<Performer> performer = new ArrayList<Performer>();
    @JsonProperty("valueQuantity")
    private ValueQuantity valueQuantity;
    @JsonProperty("referenceRange")
    private List<ReferenceRange> referenceRange = new ArrayList<ReferenceRange>();
    @JsonProperty("interpretation")
    private Interpretation interpretation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4284193971735238834L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contained() {
    }

    /**
     * 
     * @param id
     * @param status
     * @param subject
     * @param referenceRange
     * @param performer
     * @param code
     * @param interpretation
     * @param valueQuantity
     * @param resourceType
     */
    public Contained(String resourceType, String id, String status, Code code, Subject subject, List<Performer> performer, ValueQuantity valueQuantity, List<ReferenceRange> referenceRange, Interpretation interpretation) {
        super();
        this.resourceType = resourceType;
        this.id = id;
        this.status = status;
        this.code = code;
        this.subject = subject;
        this.performer = performer;
        this.valueQuantity = valueQuantity;
        this.referenceRange = referenceRange;
        this.interpretation = interpretation;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("code")
    public Code getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Code code) {
        this.code = code;
    }

    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @JsonProperty("performer")
    public List<Performer> getPerformer() {
        return performer;
    }

    @JsonProperty("performer")
    public void setPerformer(List<Performer> performer) {
        this.performer = performer;
    }

    @JsonProperty("valueQuantity")
    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    @JsonProperty("valueQuantity")
    public void setValueQuantity(ValueQuantity valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    @JsonProperty("referenceRange")
    public List<ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    @JsonProperty("referenceRange")
    public void setReferenceRange(List<ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }

    @JsonProperty("interpretation")
    public Interpretation getInterpretation() {
        return interpretation;
    }

    @JsonProperty("interpretation")
    public void setInterpretation(Interpretation interpretation) {
        this.interpretation = interpretation;
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
        return new ToStringBuilder(this).append("resourceType", resourceType).append("id", id).append("status", status).append("code", code).append("subject", subject).append("performer", performer).append("valueQuantity", valueQuantity).append("referenceRange", referenceRange).append("interpretation", interpretation).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(status).append(additionalProperties).append(subject).append(referenceRange).append(performer).append(code).append(interpretation).append(valueQuantity).append(resourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contained) == false) {
            return false;
        }
        Contained rhs = ((Contained) other);
        return new EqualsBuilder().append(id, rhs.id).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).append(subject, rhs.subject).append(referenceRange, rhs.referenceRange).append(performer, rhs.performer).append(code, rhs.code).append(interpretation, rhs.interpretation).append(valueQuantity, rhs.valueQuantity).append(resourceType, rhs.resourceType).isEquals();
    }

}
