package design_observer;

public class Obs1 implements Observer{

	@Override
	public void update(String value) {
		System.out.println("我是学生:"+getClass().getName()+value);	
	}
	
}
