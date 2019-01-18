public class Counter {
	  private int result = 0;

	  public int getResult() {
	    return result;
	  }

	  public void count() {
	    for (int i = 0; i < 15; i++) {
	      result += i + 1;
	    }
	  }
	}
