package com.andy.platform.doc.service;

import com.andy.platform.doc.dbvo.InterfaceInfoDO;

/**
 * Created with springboot.
 * User: Sam
 * Date: 2017/3/5
 * Time: 12:07
 * Description:
 */
public interface InterfaceInfoService {

    public void test();

    public InterfaceInfoDO queryByFuncNo(String func_no);
}
