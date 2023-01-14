package com.company.repositories.IMPL;

import com.company.DTO.Phone;
import com.company.DTO.Student;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.util.List;
import java.util.UUID;

public interface PhonesRepository {

    List<Phone> getAllPhones();

    void writePhones(List<Phone> list);

    void addPhone(Phone phone);

    void deletePhone(UUID uuid);
}
