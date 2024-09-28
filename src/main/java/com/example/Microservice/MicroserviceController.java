package com.example.Microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {

  @GetMapping("v1/data")
  public String getData() {
    return "some data";
  }
}
