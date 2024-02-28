package com.springrest.service;

import com.springrest.model.TestModel;

import java.util.List;

public interface TestService {

    public String fetch();

    public List<TestModel> findAllTestModel();

}
