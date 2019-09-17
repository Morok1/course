package com.example.demo.dao;

import com.example.demo.dao.api.Dao;
import com.example.demo.model.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StatementDao implements Dao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void save(Statement statement) {

    }

    @Override
    public Statement getStatementById(Long id) {
        return null;
    }
}
