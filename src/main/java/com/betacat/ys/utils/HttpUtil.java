package com.betacat.ys.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author ruin
 * @date 2020/2/13-19:56
 */
public class HttpUtil {

    public static HttpClient httpClient= HttpClients.custom().build();

    public static JSONObject get(String url){
        HttpGet httpGet = new HttpGet(url);

        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpEntity entity = response.getEntity();

        String  str = null;
        try {
            str = EntityUtils.toString(entity,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject result = JSON.parseObject(str);
        return result;
    }

    public static String post(String url, Map params) throws Exception {

        BufferedReader in = null;

        // 定义HttpClient
        HttpClient client = new DefaultHttpClient();
        // 实例化HTTP方法
        HttpPost request = new HttpPost();
        request.setURI( new URI( url ) );

        //设置参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        for (Iterator iter = params.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String value = String.valueOf( params.get( name ) );
            nvps.add( new BasicNameValuePair( name, value ) );

            //System.out.println(name +"-"+value);
        }
        request.setEntity( new UrlEncodedFormEntity( nvps, HTTP.UTF_8 ) );

        HttpResponse response = client.execute( request );
        int code = response.getStatusLine().getStatusCode();
        if (code == 200) {  //请求成功
            in = new BufferedReader( new InputStreamReader( response.getEntity()
                    .getContent(), "utf-8" ) );
            StringBuffer sb = new StringBuffer( "" );
            String line = "";
            String NL = System.getProperty( "line.separator" );
            while ((line = in.readLine()) != null) {
                sb.append( line + NL );
            }
            in.close();
            return sb.toString();
        } else {  //
            System.out.println( "状态码：" + code );
            return null;
        }

    }
}
