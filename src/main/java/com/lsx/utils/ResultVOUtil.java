package com.lsx.utils;

import com.lsx.vo.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Author lanshanxiang
 * @Date 2019/10/10 13:21
 * @Version V1.0
 **/
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
