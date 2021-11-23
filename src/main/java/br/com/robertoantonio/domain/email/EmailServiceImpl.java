package br.com.robertoantonio.domain.email;

import br.com.robertoantonio.model.Email;
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
public class EmailServiceImpl implements EmailService {

    private EmailRepository emailRepository;
    
    @Autowired
    public EmailServiceImpl(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public void create(Email email) {
        emailRepository.save(email);
    }

    @Override
    public List<Email> findAll() {
        List<Email> emailList = emailRepository.findAll();
        return emailList;
    }

    @Override
    public Email findById(Long id) {
        return emailRepository.getById(id);
    }

}
