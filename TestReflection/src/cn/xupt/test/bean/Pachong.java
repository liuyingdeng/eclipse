package cn.xupt.test.bean;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Pachong {

    public static String Connect(String address,String encoding){
        StringBuffer sb = new StringBuffer();
        InputStreamReader isr = null;
        try {
            URL url = new URL(address);
            URLConnection uc = url.openConnection();
            uc.setRequestProperty("User-Agent","java");
            InputStream inputStream = uc.getInputStream();
            isr = new InputStreamReader(inputStream,encoding);
            BufferedReader reader = new BufferedReader(isr);
            String line = null;
            File filepath = new File("d:\\1.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(filepath));
            while ((line = reader.readLine())!= null){
                out.append(line+"\n");
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(isr != null){
                    isr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Connect("http://www.hao123.com/","utf-8");
    }
}

