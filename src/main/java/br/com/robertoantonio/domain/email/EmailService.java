package br.com.robertoantonio.domain.email;

import br.com.robertoantonio.model.Email;

import java.util.List;

public interface EmailService {

    public void create(Email email);

    public Email findById(Long id);

    public List<Email> findAll();

}
