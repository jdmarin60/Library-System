package com.librarysystem.loan.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class LoanSummary {
    private Long id;
    private Date loanDate;
    private Date   dueDate;
    private Date   returnedDate;
}
