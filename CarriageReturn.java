class CarriageReturn{
	String[] circCharArr = {"|", "/", "—", "\\", "|", "/", "—", "\\"};
  public static void main(String args[]) throws InterruptedException {

    CarriageReturn cr = new CarriageReturn();

    cr.slashLoader(1);
  }

  public static void main(String[] args){

  }

  public void slashLoader(int numLines) throws InterruptedException{
    if (numLines < 1 || numLines > 3)
    {
      numLines = 3;
    }
//    String[] circCharArr = {"|", "/", "—", "\\", "|", "/", "—", "\\"};

    System.out.println("array length : " + circCharArr.length);
    while(true){
      for (int i = 0; i < circCharArr.length; i++) {
        if (i == circCharArr.length)
        {
          // System.out.print("\r" + circCharArr[i] + "\t\r" + circCharArr[i-1] + "\t\r" + circCharArr[i-2]);
          i = 0;
          // continue;
        }
        //Pause for 1 second
        Thread.sleep(100);

        switch(numLines){
          case 1:
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length] +
            "\t" +
            circCharArr[(i+9)%circCharArr.length] +
            "\t" +
            circCharArr[(i+10)%circCharArr.length] +
            "\t" +
            circCharArr[(i+11)%circCharArr.length] +
            "\t" +
            circCharArr[(i+12)%circCharArr.length] +
            "\t" +
            circCharArr[(i+13)%circCharArr.length] +
            "\t" +
            circCharArr[(i+14)%circCharArr.length] +
            "\t" +
            circCharArr[(i+15)%circCharArr.length] +
            "\t" +
            circCharArr[(i+16)%circCharArr.length]
            );
            // System.out.println();
            break;
          case 2:
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length]
            );
            System.out.println();
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length]
            );
            break;
          case 3:
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length]
            );
            System.out.println();
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length]
            );
            System.out.println();
            System.out.print(
            "\r" +
            circCharArr[i] +
            "\t" +
            circCharArr[(i+1)%circCharArr.length] +
            "\t" +
            circCharArr[(i+2)%circCharArr.length] +
            "\t" +
            circCharArr[(i+3)%circCharArr.length] +
            "\t" +
            circCharArr[(i+4)%circCharArr.length] +
            "\t" +
            circCharArr[(i+5)%circCharArr.length] +
            "\t" +
            circCharArr[(i+6)%circCharArr.length] +
            "\t" +
            circCharArr[(i+7)%circCharArr.length] +
            "\t" +
            circCharArr[(i+8)%circCharArr.length]
            );
          break;
          default:
            System.out.print("default, something went wrong");
            System.exit(0);
          break;
        }
      }
    }
  }
}
