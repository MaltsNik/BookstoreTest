package com.bookstore.bookstoretest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Артикул обязателен для заполнения")
    @Size(min = 2, max = 50, message = "Артикул должен содержать от 2 до 50 символов")
    private String vendorCode;

    @NotBlank(message = "Название обязательно для заполнения")
    @Size(min = 1, max = 255, message = "Название должно содержать от 1 до 255 символов")
    private String title;

    @NotNull(message = "Год обязателен для заполнения")
    @Min(value = 1800, message = "Год должен быть не ранее 1800")
    private Integer year;

    @NotBlank(message = "Издательство обязательно для заполнения")
    @Size(min = 1, max = 100, message = "Издательство должно содержать от 1 до 100 символов")
    private String brand;

    @NotNull(message = "Количество обязательно для заполнения")
    @Min(value = 0, message = "Количество не может быть отрицательным")
    private Integer stock;

    @NotNull(message = "Цена обязательна для заполнения")
    @DecimalMin(value = "0.0", inclusive = false, message = "Цена должна быть больше 0")
    @Digits(integer = 8, fraction = 2, message = "Цена должна иметь не более 8 цифр до запятой и 2 после")
    private BigDecimal price;
}
