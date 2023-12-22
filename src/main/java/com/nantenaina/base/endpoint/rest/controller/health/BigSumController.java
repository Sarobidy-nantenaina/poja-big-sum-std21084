package com.nantenaina.base.endpoint.rest.controller.health;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigSumController {

  @GetMapping("/big-sum")
  public String getBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
    // Convertir les paramètres en BigInteger
    BigInteger aBig = new BigInteger(a);
    BigInteger bBig = new BigInteger(b);

    // Faire la somme
    BigInteger sum = aBig.add(bBig);

    // Convertir le résultat en chaîne
    String sumString = sum.toString();

    return sumString;
  }

}
