package br.com.robertoantonio.domain.card;

import br.com.robertoantonio.model.Card;
import java.util.List;

public interface CardService {

    public void create(Card card);

    public Card findById(Long id);

    public List<Card> findAll();

}
