/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package br.com.robertoantonio.job;

import br.com.robertoantonio.domain.card.CardService;
import br.com.robertoantonio.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

*/
/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 *//*


@Component
public class SyncMailJob {

    private static final int TASK_HOUR = 1 * 60 * 1000; // 1 min
    private static final int TASK_INIT = 20 * 1000; // 20 sec

    private static DateFormat formatter = new SimpleDateFormat(("dd/MM/yyyy HH:mm"));

    @Autowired
    private CardService cardService;

    @Scheduled(initialDelay = TASK_INIT, fixedRate = TASK_HOUR)
    public void sincronizaEmails() {
        System.out.println("Inicio do sincronismo");

        //Insert do monitoramento
        addMonitoramento();

        //Verificar a lista de email e os cards que tiverem "Trello"
        inspecionaListaDeEmail();

    }

    private void addMonitoramento(){
        cardService.create(new Card());
    }

    private Card inspecionaListaDeEmail(){
        Card card = criaCardTrello("", "");
        insertLog(card);
        return card;
    }

    private Card criaCardTrello(String descricao, String titulo){
        Card card = new Card();
        card.setTitulo(titulo);
        card.setDescricao(descricao);
        cardService.create(card);
        //Chama aki a aAPI do trello e cria o card tbm no trello
        return card;
    }

    private void insertLog(Card card){
        //Gera o log dos eventos


    }
}
*/
