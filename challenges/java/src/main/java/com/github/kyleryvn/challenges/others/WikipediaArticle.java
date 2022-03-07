package com.github.kyleryvn.challenges.others;

import com.google.gson.Gson;

import java.net.URL;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WikipediaArticle {

    public int getTopicCount(String topic) {
        int count = 0;

        try {
            URL url = new URL("https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=" + topic);
            Scanner scan = new Scanner(url.openStream());
            StringBuffer sb = new StringBuffer();

            while (scan.hasNext()) {
                sb.append(scan.next());
            }

            StringTokenizer st = new StringTokenizer(sb.toString());

            while(st.hasMoreTokens()) {
                String word = st.nextToken().toString();
                if(word.equalsIgnoreCase(topic)){
                    count++;
                }
            }

            //String result = sb.toString();
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}
