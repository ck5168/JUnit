package com.ck.ri.a0.module.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ck.common.service.authenticate.Auth_mod;
import com.ck.common.service.authenticate.UserObject;
import com.ck.ri.a0.module.RI_A00999;
import com.ck.util.DBTestCase;

@SuppressWarnings("unchecked")
public class RI_A00999Test extends DBTestCase {
    private static final Logger log = Logger.getLogger(RI_A00999Test.class);

    private RI_A00999 theRI_A00999 = new RI_A00999();

    public RI_A00999Test(String arg) {
        super(arg);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testdoCompare() {

       try {
            theRI_A00999.doCompare(null);
            log.error("Test null");

        } catch (Exception e) {
            log.error("Test null");
            log.error("", e);
        }
        try {

            Map resultMap = new HashMap();
            theRI_A00999.doCompare(resultMap);
            log.error("Test empty");

        } catch (Exception e) {
            log.error("Test empty");
            log.error("", e);
        }
        try {
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("FLOW_STS", "1");
            theRI_A00999.doCompare(resultMap);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "1234");
            resultMap.put("COMP_ID", "0");
            resultMap.put("INV_VER", "0");
            resultMap.put("INV_TP", "1");
            resultMap.put("AREA_TP", "");
            theRI_A00999.doCompare(resultMap);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-11-13");
            resultMap.put("COMP_ID", "0");
            resultMap.put("INV_VER", "0");
            resultMap.put("INV_TP", "1");
            resultMap.put("AREA_TP", "");
            theRI_A00999.doCompare(resultMap);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-28");
            resultMap.put("COMP_ID", "0");
            resultMap.put("INV_VER", "0");
            resultMap.put("INV_TP", "1");
            resultMap.put("AREA_TP", "1");
            theRI_A00999.doCompare(resultMap);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-11-13");
            resultMap.put("COMP_ID", "0");
            resultMap.put("INV_VER", "1");
            resultMap.put("INV_TP", "1");
            theRI_A00999.doCompare(resultMap);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
    }
    
    public void testconfirm() {

        try {
            theRI_A00999.confirm(null,null);
            log.error("Test null");

        } catch (Exception e) {
            log.error("Test null");
            log.error("", e);
        }
        try {

            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            theRI_A00999.confirm(resultList,user);
            log.error("Test empty");

        } catch (Exception e) {
            log.error("Test empty");
            log.error("", e);
        }
        try {
            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-31");
            resultMap.put("INV_VER", "1");
            resultMap.put("DIV", "0");
            resultList.add(resultMap);
            theRI_A00999.confirm(resultList,null);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-29");
            resultMap.put("INV_VER", "2");
            resultMap.put("INV_TP", "2");
            resultMap.put("DIV", "0");
            resultMap.put("CE_YBL_AMT", "5");
            resultMap.put("ACNT_CODE", "1460202");
            resultMap.put("SUB_ACNT_CODE", "12364");
            resultMap.put("DTL_ACNT_CODE", "00002");
            resultMap.put("CMP_TP", "1");
            resultMap.put("TOT_CE_YBL_AMT", "9990");
            resultMap.put("TOT_SUM_TWD", "9990");
            resultMap.put("DIFF_AMT", "999");
            resultList.add(resultMap);
            theRI_A00999.confirm(resultList,user);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-30");
            resultMap.put("INV_VER", "1");
            resultMap.put("INV_TP", "1");
            resultMap.put("DIV", "0");
            resultMap.put("CE_YBL_AMT", "5");
            resultMap.put("ACNT_CODE", "1460201");
            resultMap.put("SUB_ACNT_CODE", "12363");
            resultMap.put("DTL_ACNT_CODE", "00001");
            resultMap.put("CMP_TP", "2");
            resultMap.put("TOT_CE_YBL_AMT", "9990");
            resultMap.put("TOT_SUM_TWD", "9990");
            resultMap.put("DIFF_AMT", "999");
            resultList.add(resultMap);
            theRI_A00999.confirm(resultList,user);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-28");
            resultMap.put("INV_VER", "1");
            resultMap.put("INV_TP", "1");
            resultMap.put("DIV", "0");
            resultMap.put("CE_YBL_AMT", "5");
            resultMap.put("ACNT_CODE", "1460205");
            resultMap.put("SUB_ACNT_CODE", "12353");
            resultMap.put("DTL_ACNT_CODE", "00003");
            resultMap.put("CMP_TP", "3");
            resultMap.put("TOT_CE_YBL_AMT", "9990");
            resultMap.put("TOT_SUM_TWD", "9990");
            resultMap.put("DIFF_AMT", "999");
            resultList.add(resultMap);
            theRI_A00999.confirm(resultList,user);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
        try {
            List<Map> resultList = new ArrayList();
            String empID = "E18900913D";
            UserObject user = new Auth_mod().setUserInfo(empID, "0");
            Map resultMap = new HashMap();
            resultMap.put("BAL_DT", "2013-10-21");
            resultMap.put("INV_VER", "1");
            resultMap.put("INV_TP", "1");
            resultMap.put("DIV", "0");
            resultMap.put("AREA_TP", "0");
            resultMap.put("MCHD_CD", "0");
            resultMap.put("ACC_TP", "0");
            resultMap.put("SEC_TP", "0");
            resultMap.put("CE_YBL_AMT", "5");
            resultMap.put("ACNT_CODE", "1460256");
            resultMap.put("SUB_ACNT_CODE", "11553");
            resultMap.put("DTL_ACNT_CODE", "00011");
            resultMap.put("CMP_TP", "1");
            resultMap.put("TOT_CE_YBL_AMT", "9990");
            resultMap.put("TOT_SUM_TWD", "9990");
            resultMap.put("DIFF_AMT", "999");
            Map resultMap1 = new HashMap();
            resultMap1.put("BAL_DT", "2013-10-27");
            resultMap1.put("INV_VER", "1");
            resultMap1.put("INV_TP", "1");
            resultMap1.put("DIV", "0");
            resultMap1.put("AREA_TP", "0");
            resultMap1.put("ACC_TP", "0");
            resultMap1.put("SEC_TP", "0");
            resultMap1.put("MCHD_CD", "0");
            resultMap1.put("CE_YBL_AMT", "5");
            resultMap1.put("ACNT_CODE", "1460299");
            resultMap1.put("SUB_ACNT_CODE", "12359");
            resultMap1.put("DTL_ACNT_CODE", "00006");
            resultMap1.put("CMP_TP", "1");
            resultMap1.put("TOT_CE_YBL_AMT", "9990");
            resultMap1.put("TOT_SUM_TWD", "9990");
            resultMap1.put("DIFF_AMT", "999");
            resultList.add(resultMap);
            resultList.add(resultMap1);
            theRI_A00999.confirm(resultList,user);
            log.error("Test Data Correct");

        } catch (Exception e) {
            log.error("Data Correct");
            log.error("", e);
        }
    }
}