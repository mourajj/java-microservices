package com.microcode;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {
}
