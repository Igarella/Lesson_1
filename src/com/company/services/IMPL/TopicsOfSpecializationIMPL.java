package com.company.services.IMPL;

import com.company.DTO.Topic;
import com.company.repositories.IMPL.TopicsOfSpecializationRepositoryIMPL;
import com.company.repositories.TopicsOfSpecializationRepository;
import com.company.services.TopicsOfSpecializationService;

import java.util.List;
import java.util.UUID;

public class TopicsOfSpecializationIMPL implements TopicsOfSpecializationService {
    @Override
    public List<Topic> getTopicsBySpecializationId(UUID specializationId) {
        TopicsOfSpecializationRepository repository = new TopicsOfSpecializationRepositoryIMPL();
        return repository.getTopicsBySpecializationId(specializationId);
    }

    @Override
    public List<Topic> getAllTopics() {
        TopicsOfSpecializationRepository repository = new TopicsOfSpecializationRepositoryIMPL();
        return repository.getAllTopics();
    }

    @Override
    public void addTopic(Topic topic) {
        TopicsOfSpecializationRepository repository = new TopicsOfSpecializationRepositoryIMPL();
        repository.addTopic(topic);
    }
}
