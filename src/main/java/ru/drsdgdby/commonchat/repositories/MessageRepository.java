package ru.drsdgdby.commonchat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.drsdgdby.commonchat.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
