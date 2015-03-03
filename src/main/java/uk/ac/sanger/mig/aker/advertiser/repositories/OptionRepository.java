package uk.ac.sanger.mig.aker.advertiser.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uk.ac.sanger.mig.aker.advertiser.domain.Option;

/**
 * @author pi1
 * @since March 2015
 */
@RepositoryRestResource(path = "options")
public interface OptionRepository extends PagingAndSortingRepository<Option, Long> {

	public Page<Option> findByPerSampleTrue(Pageable p);

}
