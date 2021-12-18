package com.ck.ri.b0.module.test;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.apache.log4j.Logger;
import java.sql.Timestamp;

import com.ck.common.service.authenticate.UserObject;
import com.ck.common.util.AuthUtil;
import com.ck.ri.b0.module.XIB0_0110_mod;
import com.ck.util.DBTestCase;
import com.ck.ri.vo.DTRIA030;

@SuppressWarnings("unchecked")
public class XIB0_0110_modTest extends DBTestCase {
    private static final Logger log = Logger.getLogger(XIB0_0110_modTest.class);

    private XIB0_0110_mod theXIB0_0110_mod = new XIB0_0110_mod();

    public XIB0_0110_modTest(String arg) {
        super(arg);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testcheckDelete() {

        try {

            theXIB0_0110_mod.checkDelete(null);
            log.error("Test null Success");

        } catch (Exception e) {
            log.error("Test null Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("0");
            theXIB0_0110_mod.checkDelete(theDTRIA030);
            log.error("Test Success");

        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("10");
            theXIB0_0110_mod.checkDelete(theDTRIA030);
            log.error("Test Success-2");

        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

    }

    public void testcheckConfirm() {

        try {

            theXIB0_0110_mod.checkConfirm(null);
            log.error("Test null Success");

        } catch (Exception e) {
            log.error("Test null Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("0");
            theXIB0_0110_mod.checkConfirm(theDTRIA030);
            log.error("Test Success");

        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("10");
            theXIB0_0110_mod.checkConfirm(theDTRIA030);
            log.error("Test Success-2");

        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

    }
   
    public void testcheckInputData() {

        try {

            theXIB0_0110_mod.checkInputData(null, null);
            log.error("Test  nullSuccess");

        } catch (Exception e) {
            log.error("Test  nullFail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("d");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-09-24"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-09-01"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "ABC");
            log.error("Test Success");
        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("d");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-10-01"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "ABC");
            log.error("Test Success-2");
        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("d");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-07-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-07-31"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "ABC");
            log.error("Test Success-3");
        } catch (Exception e) {
            log.error("Test Fail-3");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("d");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-15"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "INSERT");
            log.error("Test Success-4");
        } catch (Exception e) {
            log.error("Test Fail-4");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("d");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-15"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "UPDATE");
            log.error("Test Success-5");
        } catch (Exception e) {
            log.error("Test Fail-5");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("z");
            theDTRIA030.setSUB_ACNT_CODE("z");
            theDTRIA030.setDTL_ACNT_CODE("z");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z");
            theDTRIA030.setACC_TP("z");
            theDTRIA030.setCMP_TP("z");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-07-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-09-30"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "INSERT");
            log.error("Test Success-6");
        } catch (Exception e) {
            log.error("Test Fail-6");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("z");
            theDTRIA030.setSUB_ACNT_CODE("z");
            theDTRIA030.setDTL_ACNT_CODE("z");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z");
            theDTRIA030.setACC_TP("z");
            theDTRIA030.setCMP_TP("z");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-20"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "INSERT");
            log.error("Test Success-7");
        } catch (Exception e) {
            log.error("Test Fail-7");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("z");
            theDTRIA030.setSUB_ACNT_CODE("z");
            theDTRIA030.setDTL_ACNT_CODE("z");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z");
            theDTRIA030.setACC_TP("z");
            theDTRIA030.setCMP_TP("z");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-09-20"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "INSERT");
            log.error("Test Success-8");
        } catch (Exception e) {
            log.error("Test Fail-8");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("z");
            theDTRIA030.setSUB_ACNT_CODE("z");
            theDTRIA030.setDTL_ACNT_CODE("z");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z");
            theDTRIA030.setACC_TP("z");
            theDTRIA030.setCMP_TP("z");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-09-10"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-09-11"));

            theXIB0_0110_mod.checkInputData(theDTRIA030, "INSERT");
            log.error("Test Success-9");
        } catch (Exception e) {
            log.error("Test Fail-9");
            log.error("", e);
        }

    }

    public void testcheckInsert() {

        try {

            theXIB0_0110_mod.checkInsert(null);
            log.error("Test null Success");

        } catch (Exception e) {
            log.error("Test null Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("0");
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test  null-2Success");

        } catch (Exception e) {
            log.error("Test  null-2Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("z");
            theDTRIA030.setSUB_ACNT_CODE("z");
            theDTRIA030.setDTL_ACNT_CODE("z");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z");
            theDTRIA030.setACC_TP("z");
            theDTRIA030.setCMP_TP("z");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-09-10"));
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test Success");

        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("1105100");
            theDTRIA030.setSUB_ACNT_CODE("17YN0");
            theDTRIA030.setDTL_ACNT_CODE("00002");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z1");
            theDTRIA030.setACC_TP("z1");
            theDTRIA030.setCMP_TP("z1");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test Success-2");

        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("2171000");
            theDTRIA030.setSUB_ACNT_CODE("97YN0");
            theDTRIA030.setDTL_ACNT_CODE("01000");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("z1");
            theDTRIA030.setACC_TP("z1");
            theDTRIA030.setCMP_TP("z1");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test Success-3");

        } catch (Exception e) {
            log.error("Test Fail-3");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("z");
            theDTRIA030.setACNT_CODE("1105100");
            theDTRIA030.setSUB_ACNT_CODE("17YN0");
            theDTRIA030.setDTL_ACNT_CODE("00002");
            theDTRIA030.setMCHD_CD("z");
            theDTRIA030.setSEC_TP("ALL");
            theDTRIA030.setACC_TP("z1");
            theDTRIA030.setCMP_TP("z1");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test Success-4");

        } catch (Exception e) {
            log.error("Test Fail-4");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setAREA_TP("a");
            theDTRIA030.setACNT_CODE("4150100");
            theDTRIA030.setSUB_ACNT_CODE("17YN0");
            theDTRIA030.setDTL_ACNT_CODE("00001");
            theDTRIA030.setMCHD_CD("BILL");
            theDTRIA030.setSEC_TP("ALL");
            theDTRIA030.setACC_TP("AFS");            
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-10"));
            theXIB0_0110_mod.checkInsert(theDTRIA030);
            log.error("Test Success-5");

        } catch (Exception e) {
            log.error("Test Fail-5");
            log.error("", e);
        }

    }

    public void testcheckUpdate() {

        try {

            theXIB0_0110_mod.checkUpdate(null);
            log.error("Test null Success");

        } catch (Exception e) {
            log.error("Test null Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("1");
            theXIB0_0110_mod.checkUpdate(theDTRIA030);
            log.error("Test  null-2Success");

        } catch (Exception e) {
            log.error("Test  null-2Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("10");
            theDTRIA030.setAREA_TP("d");
            theDTRIA030.setACNT_CODE("d");
            theDTRIA030.setSUB_ACNT_CODE("d");
            theDTRIA030.setDTL_ACNT_CODE("d");
            theDTRIA030.setMCHD_CD("BILL");
            theDTRIA030.setSEC_TP("d");
            theDTRIA030.setACC_TP("d");
            theDTRIA030.setCMP_TP("d");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-15"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkUpdate(theDTRIA030);
            log.error("Test Success");

        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("20");
            theDTRIA030.setACNT_CODE("a");
            theDTRIA030.setSUB_ACNT_CODE("a");
            theDTRIA030.setDTL_ACNT_CODE("a");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkUpdate(theDTRIA030);
            log.error("Test Success-2");

        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("20");
            theDTRIA030.setACNT_CODE("b");
            theDTRIA030.setSUB_ACNT_CODE("b");
            theDTRIA030.setDTL_ACNT_CODE("b");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkUpdate(theDTRIA030);
            log.error("Test Success-4");

        } catch (Exception e) {
            log.error("Test Fail-4");
            log.error("", e);
        }


        
    }

    public void testcheckCancelConfirm() {

        try {

            theXIB0_0110_mod.checkCancelConfirm(null);
            log.error("Test null Success");

        } catch (Exception e) {
            log.error("Test null Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("1");
            theXIB0_0110_mod.checkCancelConfirm(theDTRIA030);
            log.error("Test  null-2Success");

        } catch (Exception e) {
            log.error("Test  null-2Fail");
            log.error("", e);
        }

        

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("20");
            theDTRIA030.setACNT_CODE("a");
            theDTRIA030.setSUB_ACNT_CODE("a");
            theDTRIA030.setDTL_ACNT_CODE("a");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-08-31"));

            theXIB0_0110_mod.checkCancelConfirm(theDTRIA030);
            log.error("Test Success");

        } catch (Exception e) {
            log.error("Test Fail");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("20");
            theDTRIA030.setACNT_CODE("z1");
            theDTRIA030.setSUB_ACNT_CODE("z1");
            theDTRIA030.setDTL_ACNT_CODE("z1");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-08-31"));

            theXIB0_0110_mod.checkCancelConfirm(theDTRIA030);
            log.error("Test Success-2");

        } catch (Exception e) {
            log.error("Test Fail-2");
            log.error("", e);
        }

        try {
            DTRIA030 theDTRIA030 = new DTRIA030();
            theDTRIA030.setSTS("20");
            theDTRIA030.setACNT_CODE("b");
            theDTRIA030.setSUB_ACNT_CODE("b");
            theDTRIA030.setDTL_ACNT_CODE("b");
            theDTRIA030.setDIV("0");
            theDTRIA030.setEFT_STR_DT(Date.valueOf("2013-08-01"));
            theDTRIA030.setEFT_END_DT(Date.valueOf("2013-10-31"));

            theXIB0_0110_mod.checkCancelConfirm(theDTRIA030);
            log.error("Test Success-3");

        } catch (Exception e) {
            log.error("Test Fail-3");
            log.error("", e);
        }
        
    }  

}