import java.io.*; 
import java.net.*;

public class ChatClient {
  public static void main(String[] a) throws Exception {
    String host = (a.length > 0 ? a[0] : "127.0.0.1"); int port = 5000;
    try (Socket s = new Socket(host, port);
         BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
         PrintWriter out = new PrintWriter(s.getOutputStream(), true);
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))) {

      System.out.println("Connected to " + host + ":" + port);
      Thread recv = new Thread(() -> { try {
        for (String line; (line = in.readLine()) != null; ) {
          System.out.println("[Server] " + line);
          if ("exit".equalsIgnoreCase(line.trim())) break;
        }} catch (IOException ignored) {} });
      recv.start();

      for (String line; (line = kb.readLine()) != null; ) {
        out.println(line);
        if ("exit".equalsIgnoreCase(line.trim())) break;
      }
      s.shutdownOutput();
      recv.join();
    }
  }
}
