package com.breakyizhan.web.Controller.excel;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelDataConvertException;
import com.alibaba.excel.util.StringUtils;
import com.breakyizhan.web.entity.IotDevice;
import com.google.common.collect.Lists;
import java.util.List;

public class CustomerDailyImportListener extends AnalysisEventListener {

  List misCodes = Lists.newArrayList();

  /**
   * 每解析一行，回调该方法
   * @param data
   * @param context
   */
  @Override
  public void invoke(Object data, AnalysisContext context) {
    String deviceName = ((IotDevice) data).getDeviceName();
    if (StringUtils.isEmpty(deviceName)) {
      throw new RuntimeException(String.format("第%s行MIS编码为空，请核实", context.readRowHolder().getRowIndex() + 1));
    }
    if (misCodes.contains(deviceName)) {
      throw new RuntimeException(String.format("第%s行MIS编码已重复，请核实", context.readRowHolder().getRowIndex() + 1));
    } else {
      misCodes.add(deviceName);
    }


  }

  /**
   * 出现异常回调
   * @param exception
   * @param context
   * @throws Exception
   */
  @Override
  public void onException(Exception exception, AnalysisContext context) throws Exception {
    // ExcelDataConvertException:当数据转换异常的时候，会抛出该异常，此处可以得知第几行，第几列的数据
    if (exception instanceof ExcelDataConvertException) {
      Integer columnIndex = ((ExcelDataConvertException) exception).getColumnIndex() + 1;
      Integer rowIndex = ((ExcelDataConvertException) exception).getRowIndex() + 1;
      String message = "第" + rowIndex + "行，第" + columnIndex + "列" + "数据格式有误，请核实";
      throw new RuntimeException(message);
    } else if (exception instanceof RuntimeException) {
      throw exception;
    } else {
      super.onException(exception, context);
    }
  }

  /**
   * 解析完全部回调
   * @param context
   */
  @Override
  public void doAfterAllAnalysed(AnalysisContext context) {
    misCodes.clear();
  }
}