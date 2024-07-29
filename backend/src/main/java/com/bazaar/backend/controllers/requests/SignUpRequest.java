package com.bazaar.backend.controllers.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignUpRequest {
  @Schema(example = "JohnDoe")
  @NotBlank
  private String username;

  @Schema(example = "asdf1234")
  @NotBlank
  private String password;

  @Schema(example = "John Doe")
  @NotBlank
  private String name;

  @Schema(example = "a@a.com")
  @Email
  private String email;
}
