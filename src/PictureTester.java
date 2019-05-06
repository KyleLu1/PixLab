/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture test = new Picture("src/images/koala.jpg");
      test.explore();
      test.keepOnlyBlue();
      test.explore();
  }
  
  public static void testNegate()
  {
      Picture test = new Picture("src/images/koala.jpg");
      test.explore();
      test.Negate();
      test.explore();
  }
  
  public static void testGrayscale()
  {
      Picture test = new Picture("src/images/koala.jpg");
      test.explore();
      test.grayScale();
      test.explore();
  }
  
  public static void fixUnderwater()
  {
      Picture water = new Picture("src/images/water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture koala = new Picture("src/images/koala.jpg");
      koala.explore();
      koala.mirrorVerticalRightToLeft();
      koala.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture koala = new Picture("src/images/koala.jpg");
      koala.explore();
      koala.mirrorHorizontal();
      koala.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture koala = new Picture("src/images/seagull.jpg");
      koala.explore();
      koala.mirrorHorizontalBotToTop();
      koala.explore();
    
    
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/koala.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
      
    //fixUnderwater();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testMirrorVerticalRightToLeft();
      testMirrorHorizontalBotToTop();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
