package com.bazaar.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/test")
public class TestController {
  



  @GetMapping("/protected")
  @PreAuthorize( "hasRole('USER') or hasRole('ADMIN')")
  public String getProtected(@RequestParam String param) {
      return "Protected";
  }
  
  
}
