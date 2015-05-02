package au.com.lingvo.repo;import au.com.lingvo.domain.Profile;import au.com.lingvo.domain.ProfileKnownLanguage;import org.springframework.beans.factory.annotation.Autowired;import javax.persistence.EntityManager;import javax.persistence.criteria.*;import java.util.List;public class ProfileRepositoryImpl implements ProfileRepositoryCustom {    @Autowired    private EntityManager entityManager;    @Override public List<Long> knownLang(Long profileId) {        CriteriaBuilder criteria = entityManager.getCriteriaBuilder();        CriteriaQuery<Long> criteriaQuery = criteria.createQuery(Long.class);        Root<Profile> rootCount = criteriaQuery.from(Profile.class);        Join<Profile, ProfileKnownLanguage> profileJoin = rootCount.join("known", JoinType.INNER);        criteriaQuery.where(criteria.equal(rootCount.get("id"), profileId));        criteriaQuery.multiselect(profileJoin.get("id"));        return entityManager.createQuery(criteriaQuery).getResultList();    }}