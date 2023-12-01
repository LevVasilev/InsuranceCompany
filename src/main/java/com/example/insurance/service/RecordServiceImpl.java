package com.example.insurance.service;

import com.example.insurance.model.Record;
import com.example.insurance.repository.RecordRepository;
import com.example.insurance.web.dto.RecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordRepository recordRepository;


    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }
}
