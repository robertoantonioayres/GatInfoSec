/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robertoantonio.domain.card;

import br.com.robertoantonio.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 */

@RestController
@RequestMapping(value = "/card")
public class CardController {

    @Autowired
    private CardService cardService;


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET})
    public List<Card> getList() {
        return cardService.findAll();
    }

}
