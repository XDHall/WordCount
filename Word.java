
/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word
{
  protected String word;
  protected int count;
  
  //Get and Set Methods for Both Variables
  private String getWord() {
      return word;
    }
    
  private int getCount() {
      return count;
    }
    
  public void setWord(String word) {
      this.word = word;
    }
    
  public void setCount(int count) {
      this.count = count;
    }
    
  //Word(String word, int count)
  //{
  //    this.word = word;
  //    this.count = count;
  //  }
}
