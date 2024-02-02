package com.springrest.service.impl;

import com.springrest.model.TestModel;
import com.springrest.repository.TestRepo;
import com.springrest.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    public final TestRepo testRepo;

    public TestServiceImpl(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    @Override
    public String fetch() {
        Optional<TestModel> testOptional = testRepo.findById("test");
        if(testOptional.isPresent())
            return testOptional.get().toString();
        return "";
    }
}
