package com.nhan.case_study.repository.Position;

import com.nhan.case_study.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Integer> {
}
