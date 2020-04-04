package com.immunopass.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Otp {
    private final Long id;
    private final Long validTill;
    private final String otp;
    private final Integer tryCount;
    private final OtpStatus status; // TODO: Change from string to enum
}
