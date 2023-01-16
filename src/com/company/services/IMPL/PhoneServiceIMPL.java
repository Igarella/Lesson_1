package com.company.services.IMPL;

import com.company.DTO.Phone;
import com.company.repositories.IMPL.PhoneRepositoryIMPL;
import com.company.repositories.PhonesRepository;
import com.company.services.PhoneService;

import java.util.List;
import java.util.UUID;

public class PhoneServiceIMPL implements PhoneService {
    @Override
    public List<Phone> getAllPhones() {
        PhonesRepository repository = new PhoneRepositoryIMPL();
        return repository.getAllPhones();
    }

    @Override
    public void writePhones(List<Phone> list) {
        PhonesRepository repository = new PhoneRepositoryIMPL();
        repository.writePhones(list);
    }

    @Override
    public void addPhone(Phone phone) {
        PhonesRepository repository = new PhoneRepositoryIMPL();
        repository.addPhone(phone);
    }

    @Override
    public void deletePhone(UUID uuid) {
        PhonesRepository repository = new PhoneRepositoryIMPL();
        repository.deletePhone(uuid);
    }
}
