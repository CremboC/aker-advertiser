package uk.ac.sanger.mig.aker.advertiser.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author pi1
 * @since February 2015
 */
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

	@ManyToOne(optional = false)
	private Pipeline pipeline;

	@Column(unique = true, nullable = false)
	private String name;

	@Column
	private String description;

	@Column(nullable = false)
	private String serviceUrl;

	@ManyToMany
	@JoinTable(
			name = "products_inputs",
			joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "input_id", referencedColumnName = "id")
	)
	private Set<Biomaterial> inputMaterial;

	@ManyToMany
	@JoinTable(
			name = "products_reagents",
			joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "reagent_id", referencedColumnName = "id")
	)
	private Set<Biomaterial> reagents;

	@ManyToMany
	@JoinTable(
			name = "products_outputs",
			joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "output_id", referencedColumnName = "id")
	)
	private Set<Biomaterial> outputMaterial;

	@ManyToMany
	@JoinTable(
			name = "products_output_data",
			joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "data_resource_id", referencedColumnName = "id")
	)
	private Set<DataResource> outputData;

	@ManyToMany
	@JoinTable(
			name = "products_options",
			joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id")
	)
	private Set<Option> options;

	public Set<Biomaterial> getOutputMaterial() {
		return outputMaterial;
	}

	public void setOutputMaterial(Set<Biomaterial> outputMaterial) {
		this.outputMaterial = outputMaterial;
	}

	public Set<DataResource> getOutputData() {
		return outputData;
	}

	public void setOutputData(Set<DataResource> outputData) {
		this.outputData = outputData;
	}

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

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public Pipeline getPipeline() {
		return pipeline;
	}

	public void setPipeline(Pipeline pipeline) {
		this.pipeline = pipeline;
	}

	public Set<Biomaterial> getInputMaterial() {
		return inputMaterial;
	}

	public void setInputMaterial(Set<Biomaterial> inputMaterial) {
		this.inputMaterial = inputMaterial;
	}

	public Set<Biomaterial> getReagents() {
		return reagents;
	}

	public void setReagents(Set<Biomaterial> reagents) {
		this.reagents = reagents;
	}

	public Set<Option> getOptions() {
		return options;
	}

	public void setOptions(Set<Option> options) {
		this.options = options;
	}
}
