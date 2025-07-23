package com.librarysystem.loan.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class CreateLoamDTO {
    private Long bookCopyId;
    private Long userId;
    private String loanDate;
    private String returnDate;
}
