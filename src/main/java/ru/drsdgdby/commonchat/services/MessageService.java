package ru.drsdgdby.commonchat.services;

import ru.drsdgdby.commonchat.entities.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
}
