/**
 *
 */
package com.eternal.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eternal.web.entity.TalkEvaluation;

/**
 * TalkEvaluationRepository
 *
 * @author taiki0304
 */
@Repository
public interface TalkEvaluationRepository extends JpaRepository<TalkEvaluation, Long> {

}
