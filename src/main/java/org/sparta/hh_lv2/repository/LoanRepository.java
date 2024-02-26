package org.sparta.hh_lv2.repository;

import org.sparta.hh_lv2.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
