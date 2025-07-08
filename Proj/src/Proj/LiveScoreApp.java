/*

// Removed incorrect package declaration

import java.io.*;
import java.net.*;
import org.json.*;

public class LiveScoreApp {

    public static void main(String[] args) {
       // 1. Setup API URL & Key
        // 2. Connect and fetch data
        // 3. Parse JSON and extract match info
        // 4. Print formatted scores
        // 5. (Optional) Repeat every X seconds

        try {


            // 1. Setup API URL & Key
            URL url = new URL("https://api.football-data.org/v4/matches");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Auth-Token", "ae5965337a5d4a4b937e2ae4534fe7cc");
            
            BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );
            String inputLine;
            StringBuilder content = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();
            
            // Parse JSON
            JSONObject json = new JSONObject(content.toString());
            JSONArray matches = json.getJSONArray("matches");
            
            // Print the matches array length
            System.out.println("Number of matches: " + matches.length());
            

                
            } 
            

            
        catch (Exception e) {
                // TODO: handle exception
            
            
            }


    }


}
*/



import java.io.*;
import java.net.*;
import org.json.*;

public class LiveScoreApp {
    public static void main(String[] args) {
        try {
            // API URL
            URL url = new URL("https://api.football-data.org/v4/matches");

            // Setup connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Auth-Token", "ae5965337a5d4a4b937e2ae4534fe7cc");

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse JSON
            JSONObject json = new JSONObject(response.toString());
            JSONArray matches = json.getJSONArray("matches");

            // Print some matches
            for (int i = 0; i < Math.min(matches.length(), 5); i++) {
                JSONObject match = matches.getJSONObject(i);
                String home = match.getJSONObject("homeTeam").getString("name");
                String away = match.getJSONObject("awayTeam").getString("name");

                JSONObject score = match.getJSONObject("score").getJSONObject("fullTime");
                int homeScore = score.optInt("home", -1);
                int awayScore = score.optInt("away", -1);

                System.out.println(home + " " + (homeScore != -1 ? homeScore : "-") +
                                   " - " + (awayScore != -1 ? awayScore : "-") + " " + away);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
