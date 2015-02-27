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
@Table(name = "data_resources")
public class DataResource extends BaseEntity {

	@Column
	private String location;

	@ManyToOne
	private DataResourceType type;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public DataResourceType getType() {
		return type;
	}

	public void setType(DataResourceType type) {
		this.type = type;
	}
}
