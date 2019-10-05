package com.wolf.material.untils.redis;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wolf.material.pojo.SoftwareInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class SoftwareRedis {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void add(String key, Long time, SoftwareInfo softwareInfo){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(softwareInfo),time, TimeUnit.MINUTES);
    }

    public void add(String key, Long time, List<SoftwareInfo> softwareInfos){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(softwareInfos),time, TimeUnit.MINUTES);
    }

    public SoftwareInfo get(String key){
        Gson gson=new Gson();
        SoftwareInfo softwareInfo=null;
        String softwareInfoJson=redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(softwareInfoJson)){
            softwareInfo=gson.fromJson(softwareInfoJson,SoftwareInfo.class);
        }
        return softwareInfo;
    }

    public List<SoftwareInfo> getList(String key){
        Gson gson=new Gson();
        List<SoftwareInfo> softwareInfos=null;
        String listJson=redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(listJson)){
            softwareInfos=gson.fromJson(listJson,new TypeToken<List<SoftwareInfo>>(){}.getType());
        }
        return softwareInfos;
    }

    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}