/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robertoantonio.domain.monitoramento;

import br.com.robertoantonio.model.Log;
import br.com.robertoantonio.model.Monitoramento;
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
@RequestMapping(value = "/monitoramento")
public class MonitoramentoController {

    @Autowired
    private MonitoramentoService monitoramentoService;


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET})
    public List<Monitoramento> getList() { return monitoramentoService.findAll(); }

}
