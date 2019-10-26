package edu.etime.woo.service.impl;

import edu.etime.woo.dao.SysFunMapper;
import edu.etime.woo.pojo.SysFun;
import edu.etime.woo.service.interfaces.SysFunService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author：yjh
 * @date：2019/10/26 9:32
 */

@Service
public class SysFunServiceImpl implements SysFunService {

    private SysFunMapper mapper;

    /**
     * 查询功能列表
     * @return
     */
    @Override
    public List<SysFun> selectList() {
        return null;
    }

    /**
     * 增加新功能
     * @param sysFun
     * @return
     */
    @Override
    public int insert(SysFun sysFun) {
        return 0;
    }

    /**
     *
     * @param sysFun
     * @return
     */
    @Override
    public int update(SysFun sysFun) {
        return 0;
    }

    @Override
    public SysFun selectById(String funid) {
        return null;
    }
}
