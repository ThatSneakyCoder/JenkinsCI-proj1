package com.SuperCalculator.CalcProgram.driver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Class containing terminal application
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        if (args.length < 1) {
            System.out.println("Insufficient parameters");
            System.exit(0);
        }

        if ("--show-message".equals(args[0])) {
            if (args[1] != null && !args[1].isEmpty()) {
                System.out.println(args[1]);
            } else {
                System.out.println("Empty message :O");
                System.exit(1);
            }
        } else if ("--tell-dad-joke".equals(args[0])) {
            URL url = new URL("https://icanhazdadjoke.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept", "application/json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = reader.readLine();
            reader.close();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(line);
            System.out.println(root.path("joke").asText());
        } else {
            System.out.println("Incorrect parameters. Please refer below for how to use the command line tool");
            System.exit(1);
        }
    }
}
