package ru.drsdgdby.commonchat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.drsdgdby.commonchat.entities.Message;
import ru.drsdgdby.commonchat.repositories.MessageRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
