package com.yingjun.ssm.util;


//import com.alibaba.fastjson.JSONObject;
//import net.sf.*;
import net.sf.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2019/4/13.
 */
public class RequestHelper {
    public static JSONObject httpRequest(String requestUrl, String requestMethod) {
        JSONObject jsonObject = null;
        StringBuffer buffer = new StringBuffer();
        try {

            URL url = new URL(requestUrl);
            // http协议传输
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);
//            httpUrlConn.setConnectTimeout(6000);
//            httpUrlConn.setReadTimeout(6000);
            // 设置请求方式（GET/POST）
            httpUrlConn.setConnectTimeout(100000);
            httpUrlConn.setReadTimeout(100000);
            httpUrlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpUrlConn.setRequestProperty("connection","Keep-Alive");
            httpUrlConn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            httpUrlConn.setRequestMethod(requestMethod);

            if ("GET".equalsIgnoreCase(requestMethod))
                httpUrlConn.connect();
            // 将返回的输入流转换成字符串
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            // 释放资源
            inputStream.close();
            inputStream = null;
            httpUrlConn.disconnect();
            jsonObject = JSONObject.fromObject(buffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public static void main(String[] args) {
        String string = "http://service.envicloud.cn:8082/v2/weatherforecast/YMFYB256AGFUZZE0ODQ3MZM1MZE2NTU=/101020100";
        JSONObject jsonObject = RequestHelper.get(string);
        System.out.println(jsonObject);
    }

    public static JSONObject get(String url) {
        HttpURLConnection http = null;
        InputStream is = null;
        try {
            URL urlGet = new URL(url);
            http = (HttpURLConnection) urlGet.openConnection();

            http.setRequestMethod("GET");
            http.setConnectTimeout(100000);
            http.setReadTimeout(100000);
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            http.setRequestProperty("connection","Keep-Alive");
            http.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            http.setDoOutput(true);
            http.setDoInput(true);
//            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
//            System.setProperty("sun.net.client.defaultReadTimeout", "30000");

            http.connect();

            is = http.getInputStream();
            int size = is.available();
            byte[] jsonBytes = new byte[size];
            is.read(jsonBytes);
            String message = new String(jsonBytes, "UTF-8");
            return JSONObject.fromObject(message);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (null != http) http.disconnect();
            try {
                if (null != is) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}