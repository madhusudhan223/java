


public class HasARelation1 {
public static void main(String[] args) {
	Engine engine=new Engine();
	Benz benz=new Benz();
	benz.setEngine(engine);
	benz.StartEngine();
	Ni20 ni20=new Ni20();
	ni20.setEngine(engine);
	ni20.StartEngine();
}
}
class Engine{
	public void engineType_petrol() {
		System.out.println("this car runs in petrol engine");
	}
	public void engineType_Gas() {
		System.out.println("this car runs in Gas engine ");
	}
}
class Ni20{
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void StartEngine() {
			engine.engineType_petrol();
		}
	}

	class Benz{
		private Engine engine;

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public void StartEngine() {
			engine.engineType_Gas();
		}
	}
						