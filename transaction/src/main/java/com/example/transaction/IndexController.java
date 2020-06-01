package com.example.transaction;

import com.example.transaction.Services.BusinessService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    BusinessService businessService ;

    @RequestMapping("/greed")
    public String greed(String name){
        testMysql();
        testInsertTransaction();
        return "Hi " + name;
    }

    public void testMysql(){

        JdbcTemplate jdbcTemplate = TransactionApplication.context.getBean(JdbcTemplate.class);

        List<Map<String, Object>> result =

                jdbcTemplate.queryForList("SELECT * FROM transaction1");

        System.out.println(result);
    }

    public void testInsertTransaction(){
        boolean insertResult = businessService.insertTransactionVerification();
        boolean updateResult = businessService.updateTransactionVerification();
        System.out.println(insertResult);
        System.out.println(updateResult);

    }
}
