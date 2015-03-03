package uk.ac.sanger.mig.aker.advertiser.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "options")
public class Option extends BaseEntity {

	@Column
	private String name;

	@Column
	private String description;

	@Column(nullable = false)
	private String restrictedOptions;

	@Column(nullable = false)
	private boolean required;

	@Column(nullable = false)
	private boolean perSample;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRestrictedOptions() {
		return restrictedOptions;
	}

	public void setRestrictedOptions(String restrictedOptions) {
		this.restrictedOptions = restrictedOptions;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isPerSample() {
		return perSample;
	}

	public void setPerSample(boolean perSample) {
		this.perSample = perSample;
	}
}
