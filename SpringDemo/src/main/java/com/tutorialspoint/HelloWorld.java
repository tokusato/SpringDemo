package com.tutorialspoint;
public class HelloWorld {
   private String message;
   private int times;
   /**
    * @return times
    */
   public int getTimes() {
	   return times;
   }
   /**
    * @param times セットする times
    */
   public void setTimes(int times) {
	   this.times = times;
   }
   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}