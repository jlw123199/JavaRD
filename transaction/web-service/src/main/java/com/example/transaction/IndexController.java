package com.example.transaction;

import com.example.transaction.ServicesNS.BusinessService;
import com.example.transaction.ServicesNS.BusinessServiceImpl;
import com.example.transaction.TransactionApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import service.UserService;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    BusinessService businessService ;

    BusinessServiceImpl businessServiceImpl = new BusinessServiceImpl() ;

    @RequestMapping("/greed")
    @Transactional
    public String greed(String name){
        testMysql();
        testInsertTransaction();
//        businessServiceImpl.insertTransactionVerificationInPrivateMethodInterface();
        return "Hi " + name;
    }


//    @Resource
//    UserService userService;

    @RequestMapping("/inject")
    @Transactional
    public String injectTest(String name){

        String name1 = "test";
        return "Hi " + name1;
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
