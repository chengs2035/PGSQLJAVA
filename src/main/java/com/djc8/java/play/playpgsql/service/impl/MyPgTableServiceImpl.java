package com.djc8.java.play.playpgsql.service.impl;

import com.djc8.java.play.playpgsql.model.MyPgTable;
import com.djc8.java.play.playpgsql.mapper.MyPgTableMapper;
import com.djc8.java.play.playpgsql.service.IMyPgTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * a 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-25
 */
@Service
public class MyPgTableServiceImpl extends ServiceImpl<MyPgTableMapper, MyPgTable> implements IMyPgTableService {

}
