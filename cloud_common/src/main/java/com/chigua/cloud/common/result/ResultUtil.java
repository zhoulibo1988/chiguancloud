package com.chigua.cloud.common.result;

/**
 * 
 * @ClassName: ResultUtil
 * @Description: 统一返回工具类
 * @author Mr.zhou
 * @date 2018年10月30日 上午11:04:30
 *
 */
public class ResultUtil {
	//当正确时返回的值
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(HttpStatusEnum.OK.code());
        result.setMsg(HttpStatusEnum.OK.reasonPhraseUS());
        result.setData(data);
        return result;
    }
 
    public static Result success(){
        return success(null);
    }
 
    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
