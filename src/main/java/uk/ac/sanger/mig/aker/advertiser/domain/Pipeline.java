package uk.ac.sanger.mig.aker.advertiser.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "pipelines")
public class Pipeline extends BaseEntity {

	@Column
	private String name;

	@Column
	private String description;

	@ManyToOne
	private Facility facility;

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
