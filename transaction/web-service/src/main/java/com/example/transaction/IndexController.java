package com.example.transaction;

import com.example.transaction.ServicesNS.BusinessService;
import com.example.transaction.ServicesNS.BusinessServiceImpl;
import com.example.transaction.TransactionApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;
//import service.UserService;


import javax.annotation.Resource;
import java.sql.*;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    BusinessService businessService;

    BusinessServiceImpl businessServiceImpl = new BusinessServiceImpl();

    @RequestMapping("/greed")
    @Transactional
    public String greed(String name) {
        testMysql();
        testInsertTransaction();
//        businessServiceImpl.insertTransactionVerificationInPrivateMethodInterface();
        return "Hi " + name;
    }


    @Autowired
    UserService userService;

    @Autowired
    @Qualifier("second")
    UserService userService2;

    @RequestMapping("/inject")
    @Transactional
    public String injectTest(String name) {

        String name1 = userService.findUserByID("test");

        String name2 = userService2.findUserByID("test");

        return "Hi First: " + name1 + " Second: " + name2;
    }

    public void testMysql() {

        JdbcTemplate jdbcTemplate = TransactionApplication.context.getBean(JdbcTemplate.class);

        List<Map<String, Object>> result =

                jdbcTemplate.queryForList("SELECT * FROM transaction1");

        System.out.println(result);
    }

    public void testInsertTransaction() {
        boolean insertResult = businessService.insertTransactionVerification();
        boolean updateResult = businessService.updateTransactionVerification();
        System.out.println(insertResult);
        System.out.println(updateResult);

    }

    @RequestMapping("/testOracle")
    public String testOracle() {
        String url = "jdbc:oracle:thin:@15r262l208.51mypc.cn:1521:eflag";
        String username = "qesms";
        String password = "qesms";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String reuslt = null;

        try {
//            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            Statement state = con.createStatement();   //容器
            String sql = "select * from item_tab";   //SQL语句
            ResultSet resultSet = state.executeQuery(sql);         //将sql语句上传至数据库执行
            while (resultSet.next()) {
                reuslt +=  resultSet.getString(1) + "--" + resultSet.getString(9) + "\r\n" ;
                System.out.println(resultSet.getString(1) + "--" + resultSet.getString(9));
            }
            con.close();//关闭通道

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reuslt;
    }

}

/*


 */