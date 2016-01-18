package com.whaix.csc.webspider.api;

/**
 * 删除重复文件
 * Created by wanghaixin on 16/1/18.
 */
public interface DeleteRepeatFileService {
    /**
     * 根据文件名删除重复文件
     * 规则:重复文件名后会自动加(1),(2)等
     */
    void deleteRepeatFileByName();
}
