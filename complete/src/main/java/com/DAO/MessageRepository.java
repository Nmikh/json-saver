package com.DAO;

import com.model.JMessage;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<JMessage, Integer> {
}
