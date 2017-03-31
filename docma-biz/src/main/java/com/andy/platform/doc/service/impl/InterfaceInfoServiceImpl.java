package com.andy.platform.doc.service.impl;

import com.andy.platform.doc.dbvo.InterfaceInfoDO;
import com.andy.platform.doc.mapper.InterfaceInfoDOMapper;
import com.andy.platform.doc.service.InterfaceInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created with springboot.
 * User: Sam
 * Date: 2017/3/5
 * Time: 12:08
 * Description:
 */
@Service("interfaceInfoService")
public class InterfaceInfoServiceImpl implements InterfaceInfoService {

    private static Logger logger = LoggerFactory.getLogger(InterfaceInfoServiceImpl.class);

    @Resource
    private InterfaceInfoDOMapper interfaceInfoDOMapper;//不能注入警告可以忽略，实际是可以注入

    @Transactional(rollbackFor = Exception.class)
    public void test(){
        //int i = this.testMapper.update();
        //logger.info("输出更新记录行数：" + i);
    }

    @Override
    public InterfaceInfoDO queryByFuncNo(String func_no) {

        return interfaceInfoDOMapper.queryByPK(func_no);
    }
}
