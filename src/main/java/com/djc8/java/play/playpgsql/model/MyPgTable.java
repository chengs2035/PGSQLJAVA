package com.djc8.java.play.playpgsql.model;

import com.baomidou.mybatisplus.core.mapper.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * a
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-25
 */
@Data
@Accessors(chain = true)
public class MyPgTable  {

    private static final long serialVersionUID = 1L;

    @TableField("addtime")
    private LocalDateTime addTime;


}
