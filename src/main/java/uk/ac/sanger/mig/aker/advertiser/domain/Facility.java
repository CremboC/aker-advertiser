package uk.ac.sanger.mig.aker.advertiser.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "facilities")
public class Facility extends BaseEntity {

	private String name;

	private String description;

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
}
