package com.project.Prometheus.Controllers;

import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Prometheus.Service.CrimeService;

@RestController
@RequestMapping("/crimestat")
public class CrimeStatController {
  
  @Autowired
  private CrimeService crimeService;

  @GetMapping("/location")
  public String location() {
    return "Location: 123 Main St, Anytown, USA";
  }

  @Async 
  @PostMapping("/offence")
  public String offence(@RequestBody Filter filter) {
    System.out.println(filter.getType());
    System.out.println(crimeService.getCrimes(filter));
    CrimeResult crimeResult = crimeService.getCrimes(filter).get(0);
    return crimeResult.typeOffence();
  }


}