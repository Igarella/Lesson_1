package com.company.services.IMPL;

import com.company.DTO.Email;
import com.company.DTO.Phone;

import java.util.List;
import java.util.UUID;

public interface EmailService {
    List<Email> getAllEmails();

    void writeEmails(List<Email> list);

    void addEmail(Email email);

    void deleteEmail(UUID uuid);
}
