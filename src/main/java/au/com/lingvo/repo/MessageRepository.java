package au.com.lingvo.repo;import au.com.lingvo.domain.Message;import org.springframework.data.jpa.repository.Query;import org.springframework.data.repository.PagingAndSortingRepository;import org.springframework.data.repository.query.Param;import org.springframework.data.rest.core.annotation.RepositoryRestResource;import java.util.List;@RepositoryRestResource(collectionResourceRel = "chat", path = "chat")public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {    @Query("SELECT m from Message m WHERE (m.fromId=:fromId AND m.toId=:toId) OR  (m.fromId=:toId AND m.toId=:fromId) ") List<Message> findChats(@Param("fromId") Long fromId,            @Param("toId") Long toId);}