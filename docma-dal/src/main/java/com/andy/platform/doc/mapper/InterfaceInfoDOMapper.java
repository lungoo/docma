package com.andy.platform.doc.mapper;

import com.andy.platform.doc.dbvo.InterfaceInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with springboot.
 * User: Sam
 * Date: 2017/3/10
 * Time: 22:56
 * Description:
 */
@Mapper
public interface InterfaceInfoDOMapper {

    int getCount();

    int update();

    public InterfaceInfoDO queryByPK(String func_no);

}
