package com.company.repositories.IMPL;

import com.company.DTO.Phone;
import com.company.DTO.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PhoneRepositoryIMPL implements PhonesRepository{

    static private List<Phone> phones = new ArrayList<>();

    @Override
    public List<Phone> getAllPhones() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Phones.txt"));
            phones =(List<Phone>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phones;
    }

    @Override
    public void writePhones(List<Phone> list) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Phones.txt"));
            outputStream.writeObject(phones);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPhone(Phone phone) {
        phones.add(phone);
        writePhones(phones);
    }

    @Override
    public void deletePhone(UUID uuid) {
        for (Phone phone : phones) {
            if (phone.getId().equals(uuid)) {
                phones.remove(phone);
                writePhones(phones);

            }
        }
    }
}
