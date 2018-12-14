package com.biz.craw;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Base;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import oracle.net.aso.a;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class YTNCraw {
   

   
   // 가짜 인증서 만든 후 SSL(Secure Soket Layer) 등록
    public static void makeFakeCertAndSSLSetting() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
           } 
        };
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultHostnameVerifier(
            new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            }
        );
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

   
   public ArrayList<YTNVO>  ytnCrawling(String url, String selector) {
      //Connection.class
      //public interface Connection
      
      //Connection$Response.class
      //
      //       interface Response extends Base
       
      /*
      imgstr = aa.jpg
            imgstr.indexOf(".")--->2
            imgstr.lastindexOf(".")--->뒤부터
            */
      
      // 2. SSL 체크
        if(url.indexOf("https://") >= 0){ //첨부파일 확장자 꺼낼때
            try {
            makeFakeCertAndSSLSetting();
         } catch (KeyManagementException e) {
            e.printStackTrace();
         } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
         }
        }

      Connection.Response response;
      
      ArrayList<YTNVO> list = new ArrayList<YTNVO>();
      try {
         
         
         response = Jsoup.connect(url)
               .method(Connection.Method.GET)
               .execute();

         System.out.println(response.statusMessage());
         System.out.println(response.statusCode());
         Document html = response.parse();
         //System.out.println(doc.html());

         Elements elms = html.select(selector);
       

         //conn = db.dbConn();
         for(Element elm : elms) {   // elm이란 한 div 
            YTNVO vo  = new YTNVO();
            Elements AtagTitle = elm.select("dt a");
            System.out.println("http://www.ytn.co.kr"+AtagTitle.attr("href")); //Atag주소 가져와라
            System.out.println(AtagTitle.text());//Atag 글자 가지오 와라

            vo.setUrl("http://www.ytn.co.kr"+AtagTitle.attr("href"));
            vo.setTitle(AtagTitle.text());

            Elements Acontents = elm.select("dd.text a");  //본문글만 
            System.out.println(Acontents.text());
            vo.setContent(Acontents.text());
            
            Elements imgtag = elm.select("dd.vertical p a img");
            System.out.println(imgtag.attr("data-src"));
            vo.setImgsrc(imgtag.attr("data-src"));
            
            
            System.out.println();
            list.add(vo);
            
            
         
         }

      } catch (IOException e) {
        
         e.printStackTrace();
      }
      //return list.size();//크롤링 갯수
      return list;
   }

  // public static void main(String[] args) {
//      JsoupTest soup = new JsoupTest();
//      String url = "http://www.ytn.co.kr/photo/photo_list_1406.html";
//      String selector="div#ytn_list_v2014 dl.photo_list";   //"div#아이디에서 dl 클래스의 (.)포토
//      
//      ArrayList<YTNVO> list = soup.ytnCrawling(url, selector);
//      System.out.println(list.size() + "건 크롤링");


/*      url = "http://www.ytn.co.kr/photo/sports_list_9901.html";
      selector="div#ytn_list_v2014 dl.photo_list";
      res = soup.ytnCrawling(url, selector);
      System.out.println(res + "건 클롤링");


      url = "http://www.ytn.co.kr/health_life/health_life_list_011801.html";
      selector="div#ytn_list_v2014 dl.news_list_v2014";
      res = soup.ytnCrawling(url, selector);
      System.out.println(res + "건 클롤링");*/



   }

  
   
