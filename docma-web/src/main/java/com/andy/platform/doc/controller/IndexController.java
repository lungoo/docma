package com.andy.platform.doc.controller;

import com.andy.platform.doc.dbvo.InterfaceInfoDO;
import com.andy.platform.doc.service.InterfaceInfoService;
import com.andy.platform.utils.JsonUtils;
import org.jasypt.encryption.StringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created with springboot.
 * User: Sam
 * Date: 2017/3/3
 * Time: 11:21
 * Description:
 */
@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Resource
    private StringEncryptor stringEncryptor;


    @RequestMapping("/index")
    public String index(){
        logger.info("测试输出");
        logger.info("输出密码密文：" + this.stringEncryptor.encrypt("mysql"));
        InterfaceInfoDO interfaceInfoDO = this.interfaceInfoService.queryByFuncNo("Q101");
        logger.info("结果输出：" + JsonUtils.toJSONString(interfaceInfoDO));
        return "index";
    }

}
