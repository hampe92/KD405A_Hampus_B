import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic {
	
	private digitalClockGUI DigitalClockGUI;
	private int alarmHour = -1;
	private int alarmMinute = -1;
    
	/**Konstruktor*/
	public ClockLogic(digitalClockGUI DigitalClockGUI) {
		this.DigitalClockGUI = DigitalClockGUI;
		new ClockThread().start();
		
		/**sätta alarm metod*/
	}
	public void setAlarm(int hour, int minute){
		this.alarmHour = hour;
		this.alarmMinute = minute;
		
		
	/**clear alarm metod*/	
	}
	public void clearAlarm() {
		setAlarm(-1, -1);
		DigitalClockGUI.activateAlarm(false);
		
		
	}
	/**Inre trådklass ClockThread*/
	public class ClockThread extends Thread {
		
		
		
		
		/**Starta while loopen*/
		@Override
		public void run(){
			
			
			 DecimalFormat timeFormat = new DecimalFormat("00");
             while(true) {
                 
                 try {
                     Thread.sleep(1000);
                     } catch (InterruptedException e) {} 
                 System.out.println("Starting");
                 Calendar cal = Calendar.getInstance();
                 
                 
                 int second = cal.get(Calendar.SECOND);
                 int minute = cal.get(Calendar.MINUTE);
                 int hour = cal.get(Calendar.HOUR_OF_DAY);
                 DigitalClockGUI.setTimeOnLabel(timeFormat.format(hour)+":"+timeFormat.format(minute)+":"+timeFormat.format(second));
                
                 /** If sats som hämtar från GUI ifall alarm är på eller av*/
                 if ((hour == alarmHour && minute == alarmMinute)) {
                     DigitalClockGUI.activateAlarm(true);
                 } else {
                     DigitalClockGUI.activateAlarm(false);
                 }
                 
			}
           
		}
	}

}



