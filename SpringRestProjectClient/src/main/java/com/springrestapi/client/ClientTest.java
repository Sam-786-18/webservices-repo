package com.springrestapi.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class ClientTest
{
    public static void main( String[] args )
    {
        String url="http://localhost:2525/SpringRestProject/users/getUser/{userId}";
        RestTemplate restTemplate=new RestTemplate();
        Map<String,Object> map=new HashMap<>();
        map.put("userId", 101);
        String jsonUser=restTemplate.getForObject(url, String.class,map);
        System.out.println(jsonUser);
    }
}
