/**
 * FileName: EsCreateIndexDemo
 * Author:   Administrator
 * Date:     2020/5/21 15:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.breakyizhan.web.Controller.es;
import com.breakyizhan.web.common.util.EsInitClient;
import org.elasticsearch.action.admin.indices.alias.Alias;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/5/21
 * @since 1.0.0
 */
public class EsCreateIndexDemo {

    public static void main(String ags[]){
        try(RestHighLevelClient client = EsInitClient.getClient()){

            // 1.创建索引名
            CreateIndexRequest request = new CreateIndexRequest("book8");

            // 2.索引setting配置
            request.settings(Settings.builder().put("index.number_of_shards",5)
                    .put("index.number_of_replicas", 2) // 副本数
                    .put("analysis.analyzer.default.tokenizer","standard")
            );

            // 3.设置索引的mapping
            request.mapping("_doc",
                    "  {\n" +
                            "    \"_doc\": {\n" +
                            "      \"properties\": {\n" +
                            "        \"message\": {\n" +
                            "          \"type\": \"text\"\n" +
                            "        }\n" +
                            "      }\n" +
                            "    }\n" +
                            "  }",
                    XContentType.JSON);

            // 设置索引别名
            request.alias(new Alias("lab1"));

            // 5.发送请求
            // 5.1同步方式
            CreateIndexResponse response = client.indices().create(request, RequestOptions.DEFAULT);

            // 处理响应
            boolean acknowledged = response.isAcknowledged();
            boolean shardsAcknowledged = response.isShardsAcknowledged();

            System.out.println("请求结果---------------");
            System.out.println("acknowledged:"+acknowledged);
            System.out.println("shardsAcknowledged:"+shardsAcknowledged);

            // 5.2 异步方式发送请求
           /* ActionListener<CreateIndexResponse> listener = new ActionListener<CreateIndexResponse>() {

                @Override
                public void onResponse(CreateIndexResponse createIndexResponse) {
                    boolean acknowledged = createIndexResponse.isAcknowledged();
                    boolean shardsAcknowledged = createIndexResponse.isShardsAcknowledged();
                    System.out.println("请求结果---------------");
                    System.out.println("acknowledged:"+acknowledged);
                    System.out.println("shardsAcknowledged:"+shardsAcknowledged);
                }

                @Override
                public void onFailure(Exception e) {
                    e.printStackTrace();
                }
            };

            client.indices().createAsync(request, listener);*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
