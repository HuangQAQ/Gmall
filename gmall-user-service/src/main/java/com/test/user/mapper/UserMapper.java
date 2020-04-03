package com.test.user.mapper;

import com.test.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
