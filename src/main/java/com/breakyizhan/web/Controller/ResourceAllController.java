package com.breakyizhan.web.Controller;

import com.breakyizhan.web.common.util.MyResult;
import com.breakyizhan.web.model.ResourceAllModel;
import com.breakyizhan.web.service.ResourceAllService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ResourceALlController

 **/
@RestController
@Api(value="resourceAllController",description=" 资源库")
@RequestMapping("/resourceAllController")
public class ResourceAllController {

    @Autowired
    private ResourceAllService resourceAllService;


    @GetMapping("findrecords")
    @ApiOperation(value = "按照公司名称和类型分页查询")
    public MyResult findrecords(ResourceAllModel model,
    @RequestParam(value="pagenow", defaultValue="1") int pagenow,
    @RequestParam(value="pagesize", defaultValue="10" )int pagesize ){
        MyResult result = resourceAllService.findAllRecords(model,pagenow,pagesize);
        return result;
    }

    @GetMapping("findById")
    @ApiOperation(value = "根据id查询详情")
    @ResponseBody
    public MyResult findById(ResourceAllModel model) throws Exception {
        MyResult result = resourceAllService.findById(model);
        return result;
    }

    @GetMapping("findCountData")
    @ApiOperation(value = "查询总数和今日和本周的数据")
    public MyResult findCountData(){
        MyResult result = resourceAllService.findCountDate();
        return result;
    }

    @GetMapping("findCountByType")
    @ApiOperation(value ="数据按照处罚类型查询，分别查询总数，和新增的数据" )
    public MyResult findCountByType(){
        MyResult result = resourceAllService.findCountByType();
        return result;
    }
    @GetMapping("findCountByProvince")
    @ApiOperation(value ="按照省份查询各个省份的数据总数" )
    public MyResult findCountByProvince(){
        MyResult result = resourceAllService.findCountByProvince();
        return result;
    }
    @GetMapping("findLatestData")
    @ApiOperation(value ="数据滚动" )
    public MyResult findLatestData(){
        MyResult result = resourceAllService.findLatestData();
        return result;
    }

    @GetMapping("findTopFiveData")
    @ApiOperation(value ="新增数据类别Top5" )
    public MyResult findTopFiveData(){
        MyResult result = resourceAllService.findTopFiveData();
        return result;
    }



}
