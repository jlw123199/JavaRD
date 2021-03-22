package com.example.advicdsample;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/testController")
public class TestController {
    @RequestMapping(value = "/hashMapTest")
//    @ResponseBody
    public HashMap<String, String> hashMapTest() {
        HashMap<String, String> result = new HashMap<>();
        result.put("Name", "Bill Gates");
        result.put("Age", "88");
        return result;
    }


    @GetMapping(value = "/test")
    @ResponseBody
    public Map<String, String> test(ModelMap modelMap) throws Exception {
        Map<String, String> result = new LinkedHashMap<String, String>();
        result.put("aa", "bb");
        modelMap.getClass();
        result.put("test", modelMap.get("author").toString());
        if (1 == 1) {

            throw new IOException("IO");
        }
        return result;
    }
}



        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D010501','NM01','9','1','D0105货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D010502','NM01','9','1','D0105货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D011101','NM01','9','1','D0111货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D011102','NM01','9','1','D0111货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D011401','NM01','9','1','D0114货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D011402','NM01','9','1','D0114货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D020001','NM01','9','1','D0200货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D020002','NM01','9','1','D0200货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D029901','NM01','9','1','D02东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D029902','NM01','9','1','D02东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D049901','NM01','9','1','D04东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D049902','NM01','9','1','D04东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D069901','NM01','9','1','D06东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D069902','NM01','9','1','D06东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D080001','NM01','9','1','D0800货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D080002','NM01','9','1','D0800货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D089901','NM01','9','1','D08东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D089902','NM01','9','1','D08东面靠墙'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D101101','NM01','9','1','D1011货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D101102','NM01','9','1','D1011货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D101401','NM01','9','1','D1014货位'	);
        insert into POSITION_TAB (id,warehouse_id,type,status,name) values ('09C0100D101402','NM01','9','1','D1014货位'	);
,