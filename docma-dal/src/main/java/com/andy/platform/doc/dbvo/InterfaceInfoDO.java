package com.andy.platform.doc.dbvo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class InterfaceInfoDO implements Serializable {
    private String func_no;
    private String func_name;
    private String func_version;
    private String c_type;
    private String c_status;
    private String package_path;
    private String request_path;
    private String last_date;
    private String last_time;

    public String getFunc_no() {
        return func_no;
    }

    public void setFunc_no(String func_no) {
        this.func_no = func_no;
    }

    public String getFunc_name() {
        return func_name;
    }

    public void setFunc_name(String func_name) {
        this.func_name = func_name;
    }

    public String getFunc_version() {
        return func_version;
    }

    public void setFunc_version(String func_version) {
        this.func_version = func_version;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public String getC_status() {
        return c_status;
    }

    public void setC_status(String c_status) {
        this.c_status = c_status;
    }

    public String getPackage_path() {
        return package_path;
    }

    public void setPackage_path(String package_path) {
        this.package_path = package_path;
    }

    public String getRequest_path() {
        return request_path;
    }

    public void setRequest_path(String request_path) {
        this.request_path = request_path;
    }

    public String getLast_date() {
        return last_date;
    }

    public void setLast_date(String last_date) {
        this.last_date = last_date;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }
}
