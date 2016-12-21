import java.util.*;

interface Subject {
	public void attach(Observer ob);
  public void detach (Observer ob);
	public void notifyObserver();
}

class ClubMeeting implements Subject {

	ArrayList<Observer> memberList;
	Appointment ap;

	public ClubMeeting() {
		memberList = new ArrayList<>();
    	ap = new Appointment();
	}

 public void attach(Observer o) {
		memberList.add(o);
	}

  public void detach(Observer o){
    int index = memberList.indexOf(o);
    memberList.remove(index);
    System.out.println("Removed Club Member " +  ++index );
  }

	public void notifyObserver() {
    for ( Observer o : memberList )
  		o.update(ap);
	}

	public void setTheAppointment(String location, String date, String time){
    	ap.setAppointment(location, date, time);
		notifyObserver();
	}

}

class Appointment {

	String location, date, time;

	public void setAppointment(String location, String date, String time){
		this.location = location;
		this.date = date;
		this.time = time;
		System.out.println("Appointment set: " + location + " " + date + " " + time );
	}
}

interface Observer {
	public void update( Appointment a );
}

class ClubMember implements Observer {

	Subject sub;
	Appointment app;
  int memberID;
  static int count = 1;


	public ClubMember(Subject sub){
    this.sub = sub;
		sub.attach(this);
    memberID = count++;
  	System.out.println ("New Member");
	}

	public void update(Appointment a) {
		app = a;
    System.out.println ("Member " + memberID + " notified ");
    System.out.println("Appointment details: ");
    System.out.println("Location : " + this.app.location );
    System.out.println("Date : " + this.app.date );
    System.out.println("Time : " + this.app.time + "\n");
	}
}

public class ObserverTest {

	public static void main(String[] args) {

		ClubMeeting cm = new ClubMeeting();
		ClubMember m1 = new ClubMember(cm);
		ClubMember m2 = new ClubMember(cm);
		ClubMember m3 = new ClubMember(cm);

		cm.setTheAppointment("ESB", "6th Nov", "2:30");
		cm.detach(m2);
		cm.setTheAppointment("DES", "8th Nov", "3:30");

	}

}
