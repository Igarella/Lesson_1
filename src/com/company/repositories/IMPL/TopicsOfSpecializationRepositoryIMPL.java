package com.company.repositories.IMPL;

import com.company.DTO.Topic;
import com.company.repositories.TopicsOfSpecializationRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class TopicsOfSpecializationRepositoryIMPL implements TopicsOfSpecializationRepository {

    @Override
    public List<Topic> getTopicsBySpecializationId(UUID specializationId) {
        return getAllTopics()
                .stream()
                .filter(e -> e.getSpecializationId().equals(specializationId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Topic> getAllTopics() {
        List<Topic> topicsList = new ArrayList<>();
        try {
            File file = new File("resources/Topics.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] topicFields = line.split(",");
                Topic topic = new Topic(UUID.fromString(topicFields[0]), topicFields[1], UUID.fromString(topicFields[2]));
                topicsList.add(topic);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return topicsList;
    }

    @Override
    public void addTopic(Topic topic) {
        try {
            FileWriter writer = new FileWriter("resources/Topics.txt",true);
            writer.write(topic.getId() + "," + topic.getName() + "," + topic.getSpecializationId() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
