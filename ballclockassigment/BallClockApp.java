package ballclockassigment;

public class BallClockApp {

  private int hr; //store hours
  private int min; //store minutes
  private int sec; //store seconds

  public int getHours() {
    return hr;
 }

 public int getMinutes() {
    return min;
 }

 public int getSeconds() {
    return sec;
 }


public BallClockApp (int hours, int minutes, int seconds) {
   if (0 <= hours && hours < 24)
      hr = hours;
   else
      hr = 0;
   if (0 <= minutes && minutes < 60)
      min = minutes;
   else
      min = 0;
   if (0 <= seconds && seconds < 60)
      sec = seconds;
   else
      sec = 0;
}

 public void addClock(BallClockApp secondClock){
   this.sec += secondClock.getSeconds();
   this.min+= secondClock.getMinutes();
   //add overflow to minutes from seconds
   this.min+=(int)(this.sec/60);
   //update seconds 
    this.sec = this.sec % 60;
   this.hr += secondClock.getHours();
   //add overflow to minutes from seconds

    this.hr+=(int)(this.min/60);
   //update minutes
    this.min= this.min% 60;

    //adjust hours
    this.hr = this.hr%24;
}


public void tick(){
   this.sec += 1;
   //add overflow to minutes from seconds
   this.min+=(int)(this.sec/60);
   //update seconds 
   this.sec = this.sec % 60;
   //add overflow to minutes from seconds
    this.hr+=(int)(this.min/60);
   //update minutes
    this.min= this.min% 60;
    //adjust hours
    this.hr = this.hr%24;
}

public void tickDown(){
   this.sec -= 1;
   if(this.sec <0){
      this.sec+=60;
      this.min-=1;
    }
   if(this.min<0){
      this.min+=60;
      this.hr-=1;
    }
   if(this.hr<0){
      this.hr+=24;
   }
}

 public static void main(String[]  args){
   BallClockApp clock1 = new BallClockApp(2,4,7);
   BallClockApp clock2 = new BallClockApp(8,26,57);
      clock1.tick();
      int newSeconds = clock1.getSeconds();
      //validate it should be 8 now
      System.out.println("clock1 sec :"+newSeconds);

      clock2.tickDown();
      newSeconds = clock1.getSeconds();
      //validate it should be 56 now

      clock1.addClock(clock2);
      //get Hour, minute and second from clock1 and validate
      int newHour = clock1.getHours();
      int newMinute = clock1.getMinutes();
      newSeconds = clock1.getSeconds();
      //validate if they are with the right expected value or not
      System.out.println("final Clock "+newHour+":"+newMinute+":"+newSeconds);

  }

}

