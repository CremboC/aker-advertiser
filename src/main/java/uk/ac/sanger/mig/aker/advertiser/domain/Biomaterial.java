package uk.ac.sanger.mig.aker.advertiser.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "biomaterials")
public class Biomaterial extends BaseEntity {

	@Column
	private Integer quantity;

	@Column
	private String quantityUnits;

	@ManyToOne(optional = false)
	@JoinColumn(name = "type_id")
	private BiomaterialType type;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnits() {
		return quantityUnits;
	}

	public void setQuantityUnits(String quantityUnits) {
		this.quantityUnits = quantityUnits;
	}

	public BiomaterialType getType() {
		return type;
	}

	public void setType(BiomaterialType type) {
		this.type = type;
	}
}
