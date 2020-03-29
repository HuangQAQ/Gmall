package com.test.gmalluser.mapper;

import com.test.gmalluser.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
