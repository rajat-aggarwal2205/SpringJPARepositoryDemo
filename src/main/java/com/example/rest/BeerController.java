package com.example.rest;

import com.example.model.BeerDto;
import com.example.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BeerController {
    private BeerService beerService;
    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
    @RequestMapping(value = "/beers",method = RequestMethod.GET)
    public BeerDto getBeer()
    {
        return beerService.getBeer();
    }
}
