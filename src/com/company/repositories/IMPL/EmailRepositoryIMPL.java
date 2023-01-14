package com.company.repositories.IMPL;

import com.company.DTO.Email;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmailRepositoryIMPL implements EmailRepository{
    private static List<Email> emails = new ArrayList<>();

    @Override
    public List<Email> getAllEmails() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Emails.txt"));
            emails = (List<Email>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emails;
    }

    @Override
    public void writeEmails(List<Email> list) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Emails.txt"));
            outputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addEmail(Email email) {
        emails.add(email);
        writeEmails(emails);
    }

    @Override
    public void deleteEmail(UUID uuid) {
        for (Email email : emails) {
            if (email.getId().equals(uuid)) {
                emails.remove(email);
                writeEmails(emails);
            }
        }
    }
}
