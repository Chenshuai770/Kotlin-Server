package com.module.user.utils;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * web项目工具
 */
public class HttpUtils {

    /**
     * 获取Request中的String参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static String getParamAsString(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        String result = request.getParameter(str);
        return null == result ? (String) request.getAttribute(str) : result;
    }

    /**
     * 获取Request中的int参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Integer getParamAsInt(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strInt = request.getParameter(str);
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 获取Request中的short参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Short getParamAsShort(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strShort = request.getParameter(str);
            return Short.parseShort(strShort);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取Request中的byte参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Byte getParamAsByte(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strByte = request.getParameter(str);
            return Byte.parseByte(strByte);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取Request中的long参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Long getParamAsLong(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strLong = request.getParameter(str);
            return Long.parseLong(strLong);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取Request中的double参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Double getParamAsDouble(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strDouble = request.getParameter(str);
            return Double.parseDouble(strDouble);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取Request中的float参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static Float getParamAsFloat(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return null;
        try {
            String strFloat = request.getParameter(str);
            return Float.parseFloat(strFloat);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取Request中的boolean参数
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @param b       如果为null默认返回的值
     * @return 参数Value/Null
     */
    public static boolean getParamAsBoolean(HttpServletRequest request, String str, boolean b) {
        if (null == request || null == str)
            return b;
        try {
            String strBoolean = request.getParameter(str);
            return Boolean.parseBoolean(strBoolean == null ? request.getAttribute(str) == null ? Boolean.toString(b) : (String) request.getAttribute(str) : strBoolean);
        } catch (Exception e) {
            return b;
        }
    }

    /**
     * 获取Request中的String参数并转为JSONObject
     *
     * @param request 请求
     * @param str     获取的参数Key
     * @return 参数Value/Null
     */
    public static JSONObject getParamAsJSONObject(HttpServletRequest request, String str) {
        if (null == request || null == str)
            return new JSONObject();
        try {
            String strString = request.getParameter(str);
            return JSONObject.parseObject(strString == null ? request.getAttribute(str) == null ? "" : (String) request.getAttribute(str) : strString);
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    /**
     * 编码
     *
     * @param source 编码资源
     * @return 返回
     */
    public static String urlEncode(String source, String encode) {
        String result;
        try {
            result = URLEncoder.encode(source, encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "0";
        }
        return result;
    }

    public static String urlEncodeGBK(String source) {
        String result;
        try {
            result = URLEncoder.encode(source, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "0";
        }
        return result;
    }

    /**
     * 发起http请求获取返回结果
     *
     * @param req_url 请求地址
     * @return 返回
     */
    public static String httpRequest(String req_url) {
        StringBuilder buffer = new StringBuilder();
        try {
            URL url = new URL(req_url);
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

            httpUrlConn.setDoOutput(false);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);

            httpUrlConn.setRequestMethod("GET");
            httpUrlConn.connect();

            // 将返回的输入流转换成字符串
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            // 释放资源
            inputStream.close();
            httpUrlConn.disconnect();

        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return buffer.toString();
    }

    /**
     * 发送http请求取得返回的输入流
     *
     * @param requestUrl 请求地址
     * @return InputStream
     */
    public static InputStream httpRequestIO(String requestUrl) {
        InputStream inputStream = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
            httpUrlConn.setDoInput(true);
            httpUrlConn.setRequestMethod("GET");
            httpUrlConn.connect();
            // 获得返回的输入流
            inputStream = httpUrlConn.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputStream;
    }


    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result.toString();
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url     发送请求的 URL
     * @param param   请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param isproxy 是否使用代理模式
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param, boolean isproxy) throws IOException {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL(url);
            HttpURLConnection conn;
            if (isproxy) {//使用代理模式
                String proxyHost = "127.0.0.1";
                int proxyPort = 8087;
                @SuppressWarnings("static-access")
                Proxy proxy = new Proxy(Proxy.Type.DIRECT.HTTP, new InetSocketAddress(proxyHost, proxyPort));
                conn = (HttpURLConnection) realUrl.openConnection(proxy);
            } else {
                conn = (HttpURLConnection) realUrl.openConnection();
            }
            // 打开和URL之间的连接

            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");    // POST方法


            // 设置通用的请求属性

            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            conn.connect();

            // 获取URLConnection对象对应的输出流
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            // 发送请求参数
            out.write(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }

        //使用finally块来关闭输出流、输入流
        finally {

            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();

            }

        }
        return result.toString();
    }

}
