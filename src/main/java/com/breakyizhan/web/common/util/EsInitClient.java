/**
 * FileName: EsInitClient
 * Author:   Administrator
 * Date:     2020/5/21 15:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.common.util;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/5/21
 * @since 1.0.0
 */
public class EsInitClient {

    public  static RestHighLevelClient getClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.56.104", 9200, "http")
                )
        );
        return client;
    }



}
