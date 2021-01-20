import java.util.Scanner;

/** 
 *The Proj1 program draws copy of Pink Floyd ablum
 *with a noun added to title from user input.
 *
 *Album is "Dark Side of the Moon".
 * 
 *@author Margaret (Maggie) Hernan, JHED
 *@since  2020-07-04
 */

public class Proj1 {

   /** This is the main method.
   
   * @param args command-line arguments, ignored
   */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
   
      //Gets user input for canvas size
      System.out.print("Please enter graphic size: ");
      int graphicSize = scnr.nextInt();
      
      //Gets user input for noun
      System.out.print("Please enter a noun: ");
      scnr.nextLine();
      String noun = scnr.nextLine();
      
      //Gets canvas size
      StdDraw.setCanvasSize(graphicSize, graphicSize);
   
      //Sets backround color
      StdDraw.clear(StdDraw.BLACK);
      
      //Gets white line on left side
      StdDraw.setPenRadius(.002);
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.line(0.0, 0.5, 0.53, 0.63);
      
      //Gets rainbow lines on right side
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledTriangle(.45, .63, 1.0, .567, 1.0, .55);
      
      StdDraw.setPenColor(StdDraw.ORANGE);
      StdDraw.filledTriangle(.45, .63, 1.0, .55, 1.0, .535);
      
      StdDraw.setPenColor(StdDraw.YELLOW);
      StdDraw.filledTriangle(.45, .63, 1.0, .535, 1.0, .52);
      
      StdDraw.setPenColor(StdDraw.GREEN);
      StdDraw.filledTriangle(.45, .63, 1.0, .52, 1.0, .505);
      
      StdDraw.setPenColor(StdDraw.CYAN);
      StdDraw.filledTriangle(.45, .63, 1.0, .505, 1.0, .49);
      
      StdDraw.setPenColor(StdDraw.PURPLE);
      StdDraw.filledTriangle(.45, .63, 1.0, .49, 1.0, .475);
      
      //Gets black filled triangle
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledTriangle(0.33, 0.437, 0.67, 0.437, 0.5, 0.69);
      
      //Gets triangle outline
      StdDraw.setPenRadius(0.01);
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.triangle(0.33, 0.427, 0.67, 0.427, 0.5, 0.697);
      
      //Draws album title
      StdDraw.setPenRadius(1.0);
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.text(0.5, 0.07, "Dark Side of the " + noun.toUpperCase());
      //gets entered noun
      
    
      
   
   }
}