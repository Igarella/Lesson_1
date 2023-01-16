package com.company.repositories;

import com.company.DTO.Email;
import com.company.DTO.Phone;

import java.util.List;
import java.util.UUID;

public interface EmailRepository {
    List<Email> getAllEmails();

    void writeEmails(List<Email> list);

    void addEmail(Email email);

    void deleteEmail(UUID uuid);

    List<Email> getEmailByStudentId(UUID id);
}
