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

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resourceType", "id",
		"meta", "text", "contained", "identifier", "status", "category",
		"code", "subject", "context", "effectiveDateTime", "issued",
		"performer", "result", "presentedForm"})
public class DiagnosticReport2 implements Serializable {

	@com.fasterxml.jackson.annotation.JsonProperty("resourceType")
	private String resourceType;
	@com.fasterxml.jackson.annotation.JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -6988836822536246194L;

	private java.lang.String conclusion;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public DiagnosticReport2() {
	}


	@JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
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
		return new ToStringBuilder(this).append("resourceType", resourceType).append("status", status)
				.append("conclusion", conclusion)
				.toString();
	}

	public java.lang.String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(java.lang.String conclusion) {
		this.conclusion = conclusion;
	}

	public DiagnosticReport2(java.lang.String resourceType,
			java.lang.String status, java.lang.String conclusion) {
		this.resourceType = resourceType;
		this.status = status;
		this.conclusion = conclusion;
	}

}
