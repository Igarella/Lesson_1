package com.company.services;

import com.company.DTO.Topic;

import java.util.List;
import java.util.UUID;

public interface TopicsOfSpecializationService {
    List<Topic> getTopicsBySpecializationId(UUID specializationId);

    List<Topic> getAllTopics();

    void addTopic(Topic topic);
}
