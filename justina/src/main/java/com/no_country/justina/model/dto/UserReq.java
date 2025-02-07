package com.no_country.justina.model.dto;

import java.time.LocalDateTime;

public record UserReq(Long id, String name, String lastname, String email,
                      String password, LocalDateTime createdAt, boolean isEnabled) {
}
