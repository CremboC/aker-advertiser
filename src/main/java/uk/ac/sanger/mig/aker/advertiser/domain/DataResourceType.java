package uk.ac.sanger.mig.aker.advertiser.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "data_resource_type")
public class DataResourceType extends BaseEntity {

	@Column(unique = true, nullable = false)
	private String value;

	@Column
	private String description;

	@Column
	private Integer orderBy;

	@Column
	private boolean userVisible = true;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public boolean isUserVisible() {
		return userVisible;
	}

	public void setUserVisible(boolean userVisible) {
		this.userVisible = userVisible;
	}
}
