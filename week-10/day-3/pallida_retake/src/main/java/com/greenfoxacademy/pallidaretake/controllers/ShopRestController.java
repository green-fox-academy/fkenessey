package com.greenfoxacademy.pallidaretake.controllers;

import com.greenfoxacademy.pallidaretake.factories.DTOFactory;
import com.greenfoxacademy.pallidaretake.models.DTOs.QueryDTO;
import com.greenfoxacademy.pallidaretake.services.MerchandiseServiceDbImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopRestController {

  @Autowired
  MerchandiseServiceDbImpl merchandiseServiceDb;
  @Autowired
  DTOFactory dtoFactory;

  @GetMapping("/warehouse/query")
  public ResponseEntity<QueryDTO> returnQuery(@RequestParam(name = "price", required = false) Double price,
                                             @RequestParam(name = "type", required = false) String type) {
    if (price != null && type != null) {
      return new ResponseEntity<QueryDTO>(merchandiseServiceDb.createReposneQuery(price, type), HttpStatus.OK);
    } else {
      return new ResponseEntity<QueryDTO>(dtoFactory.createNewQueryDTO("error - no input", null), HttpStatus.BAD_REQUEST);
    }
  }
}
