import java.util.*;

abstract class Address{
	String door,street,area,city,state;

	abstract void getFullAddress();

	void setAddress(String door,String street, String area,String city,String state){
		this.door=door;
		this.street=street;
		this.area=area;
		this.city=city;
		this.state=state;
	}
}

class USAddress extends Address{
	String sp = " ", nl = "\n";

	void getFullAddress(){

		System.out.println(door+sp+street+sp+nl+area+sp+city+nl+state+nl+"United States of America");

	}
}

class IndianAddress extends Address{
	
	String sp = " ", nl = "\n";

	void getFullAddress(){
		System.out.println(door+sp+street+sp+nl+area+sp+city+nl+state+nl+"India");

	}
}

abstract class PhoneNumber{
	long phone;

	abstract void getPno();
	void setPno(long phone){
		this.phone = phone;
	}
}

class USPhoneNumber extends PhoneNumber{

	void getPno(){

		System.out.println("" + 1054 + " "+phone);
	}
}

class IndianPhoneNumber extends PhoneNumber{

	void getPno(){

		System.out.println("" + 91 + " "+phone);

	}
}

interface ContactFactory{
	Address getAddress();
	PhoneNumber getPhoneNumber();
}

class USContactFactory implements ContactFactory{
	public Address getAddress(){
		return new USAddress();
	}
	public PhoneNumber getPhoneNumber(){
		return new USPhoneNumber();
	}
}

class IndiaContactFactory implements ContactFactory{
	public Address getAddress(){
		return new IndianAddress();
	}
	public PhoneNumber getPhoneNumber(){
		return new IndianPhoneNumber();
	}
}

class IndianContactFactory implements ContactFactory{
	public Address getAddress(){
		return new IndianAddress();
	}
	public PhoneNumber getPhoneNumber(int code)
	{
		return new IndianPhoneNumber(code);
	}
}

public class TestAbstract{
	public static void main(String[] args) {
		//Address US = new USAddress;
		ContactFactory uscf = new USContactFactory();
		Address usa = uscf.getAddress();
		PhoneNumber uspn = uscf.getPhoneNumber();

		usa.setAddress("54", "MGM Boulevard", "15th Avenue", "Seattle", "California");
		usa.getFullAddress();
		uspn.setPno(988665263);
		uspn.getPno();

		ContactFactory incf = new IndiaContactFactory();
		Address ina = incf.getAddress();
		PhoneNumber inpn = incf.getPhoneNumber();

		ina.setAddress("54", "MG road", "Mathikere", "Bangalore", "Karnataka");
		ina.getFullAddress();
		inpn.setPno(988665263);
		inpn.getPno();
	}
}
