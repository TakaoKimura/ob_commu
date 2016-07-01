package misunderstand;

public class User {

	void saftyUse(){
		Data data = new Data();
		int x = data.getA();
		data.setB(-5.);
	}
}
