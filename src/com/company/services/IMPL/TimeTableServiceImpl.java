package com.company.services.IMPL;

import com.company.DTO.TimeTable;
import com.company.repositories.IMPL.TimeTableRepositoryImpl;
import com.company.repositories.TimeTableRepository;
import com.company.services.TimeTableService;

import java.util.List;
import java.util.UUID;

public class TimeTableServiceImpl implements TimeTableService {
    @Override
    public List<TimeTable> getAllTimeTable() {
        TimeTableRepository repository = new TimeTableRepositoryImpl();
        return repository.getAllTimeTable();
    }

    @Override
    public void addTimeTable(TimeTable timeTable) {
        TimeTableRepository repository = new TimeTableRepositoryImpl();
        repository.addTimeTable(timeTable);
    }

    @Override
    public TimeTable getTimeTableBySubjectId(UUID subjectId) {
        TimeTableRepository repository = new TimeTableRepositoryImpl();
        return repository.getTimeTableBySubjectId(subjectId);
    }

    @Override
    public TimeTable getTimeTableById(UUID timeTableId) {
        TimeTableRepository repository = new TimeTableRepositoryImpl();
        return repository.getTimeTableById(timeTableId);
    }
}
