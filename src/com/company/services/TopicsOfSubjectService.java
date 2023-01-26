package com.company.services;

import com.company.DTO.Topic;

import java.util.List;
import java.util.UUID;

public interface TopicsOfSubjectService {
    List<Topic> getTopicsBySubjectSubjectId(UUID subjectId);

    List<Topic> getAllTopics();

    void addTopic(Topic topic);
}
