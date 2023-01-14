package com.company.repositories.IMPL;

import com.company.DTO.Email;

import java.util.List;
import java.util.UUID;

public interface EmailRepository {
    List<Email> getAllEmails();

    void writeEmails(List<Email> list);

    void addEmail(Email email);

    void deleteEmail(UUID uuid);
}
