/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robertoantonio.domain.email;

import br.com.robertoantonio.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 */

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService emailService;


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET})
    public List<Email > getList() {
        return emailService.findAll();
    }

}
