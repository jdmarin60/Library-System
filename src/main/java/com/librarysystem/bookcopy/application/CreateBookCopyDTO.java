package com.librarysystem.bookcopy.application;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class CreateBookCopyDTO {
    private String barcode; // Unique ID for the physical copy
}
