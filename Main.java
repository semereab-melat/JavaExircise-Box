
/***************************************************************
 Filename: Box
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment:  calculate, store and output the perimeter and volume of the box.
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
      //declaring and initialising a variables
      int height = 2; 
      int width = 3;
      int depth = 4;
      int perimeter;
      int volume;
      
      //calculating the perimeter and area of the box
      perimeter = (4 * height + 4 * width + 4 * depth);
      volume = (height * width * depth);
      System.out.println("The box is " + height + "cm high, " + width + "cm wide and " + depth + "cm deep");
      System.out.println("The volume of the box is " + volume + " cms cubed");
      System.out.println("The perimeter of the box is " + perimeter + " cms");
 

  }//main
}//class