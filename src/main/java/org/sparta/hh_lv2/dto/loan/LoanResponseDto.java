package org.sparta.hh_lv2.dto.loan;

import lombok.Getter;
import org.sparta.hh_lv2.entity.Loan;

import java.time.LocalDateTime;

@Getter
public class LoanResponseDto {
    private String status;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;

    public LoanResponseDto(Loan loan) {
        this.status = loan.getStatus();
        this.loanDate = loan.getLoanDate();
        this.returnDate = loan.getReturnDate();
    }
}
