import java.io.PrintWriter;
public class helloworld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Helo!");
    pen.flush();
  } // main(String[])
}
