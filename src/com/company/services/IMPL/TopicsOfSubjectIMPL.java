package com.company.services.IMPL;

import com.company.DTO.Topic;
import com.company.repositories.IMPL.TopicsOfSubjectRepositoryIMPL;
import com.company.repositories.TopicsOfSubjectRepository;
import com.company.services.TopicsOfSubjectService;

import java.util.List;
import java.util.UUID;

public class TopicsOfSubjectIMPL implements TopicsOfSubjectService {
    @Override
    public List<Topic> getTopicsBySpecializationSubjectId(UUID specializationId) {
        TopicsOfSubjectRepository repository = new TopicsOfSubjectRepositoryIMPL();
        return repository.getTopicsBySubjectId(specializationId);
    }

    @Override
    public List<Topic> getAllTopics() {
        TopicsOfSubjectRepository repository = new TopicsOfSubjectRepositoryIMPL();
        return repository.getAllTopics();
    }

    @Override
    public void addTopic(Topic topic) {
        TopicsOfSubjectRepository repository = new TopicsOfSubjectRepositoryIMPL();
        repository.addTopic(topic);
    }
}
