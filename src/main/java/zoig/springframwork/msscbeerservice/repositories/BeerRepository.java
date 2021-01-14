package zoig.springframwork.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import zoig.springframwork.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
