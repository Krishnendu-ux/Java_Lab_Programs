import java.io.*; 
import java.net.*;

public class ChatServer {
  public static void main(String[] a) throws Exception {
    try (ServerSocket ss = new ServerSocket(5000);
         Socket s = ss.accept();
         BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
         PrintWriter out = new PrintWriter(s.getOutputStream(), true);
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))) {

      System.out.println("Client: " + s.getRemoteSocketAddress());
      Thread recv = new Thread(() -> { try {
        for (String line; (line = in.readLine()) != null; ) {
          System.out.println("[Client] " + line);
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
