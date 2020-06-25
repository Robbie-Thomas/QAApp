package qasite.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qasite.demo.Model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}