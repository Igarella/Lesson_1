package com.company.repositories;

import com.company.DTO.Topic;

import java.util.List;
import java.util.UUID;

public interface TopicsOfSubjectRepository {
    List<Topic> getTopicsBySubjectId(UUID specializationId);

    List<Topic> getAllTopics();

    void addTopic(Topic topic);
}

