package design_observer已经ok;

public class Obs2 implements Observer {

	@Override
	public void update(String value) {
		System.out.println("我是学生:"+getClass().getName()+value);
	}

}
