package com.example.transaction.ServicesNS;


import com.example.transaction.TransactionApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.r2dbc.EmbeddedDatabaseConnection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
public class BusinessServiceImpl implements com.example.transaction.ServicesNS.BusinessService {

    @Override
    @Transactional
    public Boolean insertTransactionVerification() {

        test();

        JdbcTemplate jdbcTemplate = TransactionApplication.getContext().getBean(JdbcTemplate.class);

//        jdbcTemplate.execute("INSERT transaction1 (name) values('j8')");

        jdbcTemplate.execute("INSERT transaction2 (id,name) values(5,'l8')");


        return true;
    }

    public Boolean insertTransactionVerificationInPrivateMethodInterface(){
        return  this.insertTransactionVerificationInPrivateMethod();
    }

    @Transactional

    private Boolean insertTransactionVerificationInPrivateMethod() {


        JdbcTemplate jdbcTemplate = TransactionApplication.getContext().getBean(JdbcTemplate.class);

        jdbcTemplate.execute("INSERT transaction1 (name) values('j10')");

        jdbcTemplate.execute("INSERT transaction2 (id,name) values(5,'l10')");

        EmbeddedDatabaseConnection d = EmbeddedDatabaseConnection.H2;

        d.notifyAll();

        Object a = null;
        a.notify();

        return true;
    }

    private void test(){

        JdbcTemplate jdbcTemplate = TransactionApplication.getContext().getBean(JdbcTemplate.class);

        jdbcTemplate.execute("INSERT transaction1 (name) values('j8')");

        System.out.println("This is a private method!");
    }

    @Override
    public Boolean updateTransactionVerification() {
        return false;
    }
}
