package com.kakarote.crm9.common.constant;

import com.kakarote.crm9.utils.BaseUtil;

import java.io.Serializable;

/**
 * 一些基础配置
 */
public class BaseConstant implements Serializable {

    public static final String NAME = "72CRM";

    public static final String VERSION = "1.2.1";

    private static final long serialVersionUID = 1L;
    /**
     * 默认的上传文件路径
     * TODO 默认配置文件路径
     */
    public final static String UPLOAD_PATH = BaseUtil.isWindows() ? "D:/upload/" : "/usr/local/upload/";

    /**
     * 默认文件映射路径
     * TODO 将路径换成自己的路径
     */
    public final static String BASE_PATH = "http://127.0.0.1:8080/";

    /**
     * 角色类型列表
     */
    public static final Integer[] ROLE_TYPES = {1, 2, 3, 4, 5, 0};

    /**
     * 超级管理员的roleId
     */
    public static final Integer SUPER_ADMIN_ROLE_ID = 1;

    /**
     * 最终的超级管理员ID，不可被删除
     */
    public static final Long SUPER_ADMIN_USER_ID = 3L;
    /**
     * 查询数据权限递归次数
     */
    public static final int AUTH_DATA_RECURSION_NUM = 20;

}
