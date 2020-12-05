import java.net.URL;
import java.net.HttpURLConnection;

import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

class HttpRequest {
    public static void main(String[] args) throws Exception{
        String url = "http://www.google.com";
        URL obj = new URL(url);

        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();

        connect.setRequestMethod("GET");
        connect.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        String inputLine;
        StringBuffer res = new StringBuffer();
        while((inputLine = br.readLine()) != null) {
            res.append(inputLine);
        }
        br.close();

        System.out.println(res.toString());
    }
}