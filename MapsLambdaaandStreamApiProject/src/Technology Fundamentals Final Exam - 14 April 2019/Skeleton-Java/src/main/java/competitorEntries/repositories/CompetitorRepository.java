package competitorEntries.repositories;

import competitorEntries.entities.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitorRepository extends JpaRepository<Competitor,Integer> {
}
