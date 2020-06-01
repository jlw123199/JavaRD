package com.example.transaction.Services;

import com.example.transaction.TransactionApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
public class BusinessServiceImpl implements BusinessService {

    @Override
    @Transactional
    public Boolean insertTransactionVerification() {


        JdbcTemplate jdbcTemplate = TransactionApplication.getContext().getBean(JdbcTemplate.class);

        jdbcTemplate.execute("INSERT transaction1 (name) values('j7')");

        jdbcTemplate.execute("INSERT transaction2 (id,name) values(5,'l7')");


        return true;
    }

    @Override
    public Boolean updateTransactionVerification() {
        return false;
    }
}
