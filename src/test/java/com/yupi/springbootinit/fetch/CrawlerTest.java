package com.yupi.springbootinit.fetch;


import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.mapper.UserMapper;
import com.yupi.springbootinit.model.entity.Post;
import com.yupi.springbootinit.model.entity.User;
import com.yupi.springbootinit.service.PostService;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class CrawlerTest {

    @Resource
    private PostService postService;

    @Resource
    private UserMapper userMapper;

    @Test
    void CrawlerByHutool() {
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.eq("id","1727319974591942657");
//        User user = userMapper.selectOne(qw);
//        Long id = user.getId();
//
//        String url = "https://www.code-nav.cn/api/post/search/page/vo";
//        String json = "{\"current\":1,\"pageSize\":8,\"sortField\":\"createTime\",\"sortOrder\":\"descend\",\"category\":\"笔记\",\"reviewStatus\":1}";
//        String result = HttpRequest.post(url)
//                .body(json)
//                .execute().body();
////        System.out.println(result);
//        Map<String, Object> map = JSONUtil.toBean(result, Map.class);
////        System.out.println(map);
//        JSONObject data = (JSONObject) map.get("data");
//        JSONArray records = (JSONArray) data.get("records");
//        List<Post> postList = new ArrayList<>();
//        records.stream().forEach(item -> {
//            JSONObject tempData = (JSONObject) item;
//            Post post = new Post();
//            post.setTitle(tempData.getStr("title"));
//            post.setContent(tempData.getStr("content"));
//            JSONArray tags = (JSONArray) tempData.get("tags");
//            List<String> tagList = tags.toList(String.class);
//            post.setTags(JSONUtil.toJsonStr(tagList));
//            post.setUserId(id);
//            postList.add(post);
//        });
//        boolean b = postService.saveBatch(postList);
//        Assertions.assertTrue(b);
    }

    @Test
    void fetch() {
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.eq("id","1727605851578785794");
//        User user = userMapper.selectOne(qw);
//        Long id = user.getId();
//        String url = "https://www.code-nav.cn/api/post/search/page/vo";
//        String param = "{\"current\":1,\"pageSize\":8,\"sortField\":\"_score\",\"sortOrder\":\"descend\",\"searchText\":\"React\",\"category\":\"文章\",\"reviewStatus\":1}";
//        String result = HttpRequest.post(url)
//                .body(param)
//                .execute().body();
//        System.out.println(result);
//        Map<String, Object> map = JSONUtil.toBean(result, Map.class);
//        JSONObject data = (JSONObject) map.get("data");
//        JSONArray records = (JSONArray) data.get("records");
//        List<Post> postList = new ArrayList<>();
//        records.stream().forEach(item -> {
//            JSONObject temp = (JSONObject) item;
//            Post post = new Post();
//            post.setTitle(temp.getStr("title"));
//            post.setContent(temp.getStr("content"));
//            JSONArray tags = (JSONArray) temp.get("tags");
//            List<String> tagList = tags.toList(String.class);
//            post.setTags(JSONUtil.toJsonStr(tagList));
//            post.setUserId(id);
//            postList.add(post);
//        });
//        boolean saveBatch = postService.saveBatch(postList);
//        Assertions.assertTrue(saveBatch);
    }
}
