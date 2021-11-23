package br.com.robertoantonio.domain.card;

import br.com.robertoantonio.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Roberto Ayres
 * @since 20/11/2021
 * @version 1.0.0
 */
@Service
@Transactional
public class CardServiceImpl implements CardService {

    private CardRepository cardRepository;
    
    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void create(Card card) {
        cardRepository.save(card);
    }

    @Override
    public List<Card> findAll() {
        List<Card> cardList = cardRepository.findAll();
        return cardList;
    }

    @Override
    public Card findById(Long id) {
        return cardRepository.getById(id);
    }

}
