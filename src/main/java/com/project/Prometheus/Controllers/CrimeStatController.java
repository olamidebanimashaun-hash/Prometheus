package com.project.Prometheus.Controllers;

import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Result.CrimeResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Prometheus.Service.CrimeService;
import com.project.Prometheus.Service.FilterService;

@RestController
@RequestMapping("/crimestat")
public class CrimeStatController {
  
  @Autowired
  private CrimeService crimeService;

  @Autowired
  private FilterService filterService;
  
  @Async 
  @GetMapping("/filter")
  public String filter(@RequestParam String fieldName) {
    return filterService.getFilter(fieldName).toString();
  }

  @Async 
  @PostMapping("/offence")
  public List<CrimeResult> offence(@RequestBody Filter filter) {
    return  crimeService.getCrimes(filter);
  }


}