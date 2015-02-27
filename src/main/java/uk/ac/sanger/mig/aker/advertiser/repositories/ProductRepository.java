package uk.ac.sanger.mig.aker.advertiser.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uk.ac.sanger.mig.aker.advertiser.domain.Product;

/**
 * @author pi1
 * @since February 2015
 */
@RepositoryRestResource(path = "products")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
