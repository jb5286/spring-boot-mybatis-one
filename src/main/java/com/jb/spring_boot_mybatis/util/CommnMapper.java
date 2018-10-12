package com.jb.spring_boot_mybatis.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2018/9/20.
 */
public interface CommnMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
