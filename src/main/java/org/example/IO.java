package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class IO {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://datacenter.taichung.gov.tw/swagger/OpenData/31a8746b-63e0-4eef-9a93-ae4c3df07d34");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            StringBuffer stringBuffer = new StringBuffer();

            String line= bufferedReader.readLine();

            while (line != null){
                stringBuffer.append(line).append("\n");
                line = bufferedReader.readLine();
            }

            System.out.println(stringBuffer.toString());
            bufferedReader.close();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}