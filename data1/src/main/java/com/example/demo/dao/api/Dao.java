package com.example.demo.dao.api;

import com.example.demo.model.Statement;

public interface Dao {
    void save(Statement statement);
    Statement getStatementById(Long id);
}
