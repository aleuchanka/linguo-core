package au.com.lingvo.repo;import au.com.lingvo.domain.Location;import org.springframework.data.repository.PagingAndSortingRepository;import org.springframework.data.rest.core.annotation.RepositoryRestResource;@RepositoryRestResource(collectionResourceRel = "location", path = "location")public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {}