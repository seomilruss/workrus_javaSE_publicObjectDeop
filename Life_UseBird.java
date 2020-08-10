package publicobjectDeop.life;

interface IFlyBehavior {
	void fly();
}
class FlyWithWing implements IFlyBehavior {
	@Override
	public void fly() {
		System.out.println("비행하다.");
	}
}
class FlyNoWay implements IFlyBehavior {
	@Override
	public void fly(){
		System.out.println("비행 불가능!");
	}
}

interface ITweetBehavior {
	void tweet();
}
class SparrowTweet implements ITweetBehavior {
	@Override
	public void tweet() {
		System.out.println("짹짹짹~");
	}
}
class DoveTweet implements ITweetBehavior {
	@Override
	public void tweet() {
		System.out.println("구구구~");
	}
}
class EagleTweet implements ITweetBehavior {
	@Override
	public void tweet() {
		System.out.println("독수리의 울음소리");
	}
}
class WildGooseTweet implements ITweetBehavior {
	@Override
	public void tweet() {
		System.out.println("기러기의 울음소리");
	}
}
class MuteTweet implements ITweetBehavior {
	@Override
	public void tweet() {
		System.out.println("지저귈수 없음.");
	}
}

interface ISwimBehavior {
	void swim();
}

class Swim implements ISwimBehavior {
	@Override
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}
class SwimNoWay implements ISwimBehavior {
	@Override
	public void swim() {
		System.out.println("헤엄칠 수 없습니다.");
	}
}

abstract class Bird {
	private String name;
	private IFlyBehavior flyBehavior;
	private ITweetBehavior tweetBehavior;
	private ISwimBehavior swimBehavior;
	
	public Bird() {
	}
	public Bird(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	public void performTweet() {
		tweetBehavior.tweet();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void performSwim() {
		swimBehavior.swim();
	}
	public void walking() {
		System.out.println("걸어갑니다.");
	}
	public void spawn() {
		System.out.println("알을 낳습니다.");
	}
	public abstract void display();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public ITweetBehavior getTweetBehavior() {
		return tweetBehavior;
	}
	public void setTweetBehavior(ITweetBehavior tweetBehavior) {
		this.tweetBehavior = tweetBehavior;
	}
	public ISwimBehavior getSwimBehavior() {
		return swimBehavior;
	}
	public void setSwimBehavior(ISwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
	
	public String toString() {
		String str = "";
		return str;
	}
}

class Sparoow extends Bird {
	public Sparoow(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	@Override
	public void display() {
		System.out.println(this.getName() + "다~");
	}
	public void bugHunt() {
		System.out.println("곤충을 사냥~");
	}
	@Override
	public String toString() {
		String str = super.toString();
		display();
		performFly();
		performTweet();
		performSwim();
		super.walking();
		this.bugHunt();
		super.spawn();
		return str;
	}
}
class Dove extends Bird {
	public Dove(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	@Override
	public void display() {
		System.out.println("비둘기다~");
	}
	public void homingInstict() {
		System.out.println(
			"귀소본능~\n" +
			"(유럽은 전기가 발견되기 전에 비둘기의 귀소본능을 활용해서 통신을 했으며\n" +
			"국가간의 전쟁에서도 비둘기를 활용했으며 전서구 라고 불렀다.)"
		);
	}
	@Override
	public String toString() {
		String str = super.toString();
		display();
		performFly();
		performTweet();
		performSwim();
		super.walking();
		this.homingInstict();
		super.spawn();
		return str;
	}
}
class AmericanEagle extends Bird {
	public AmericanEagle(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	@Override
	public void display() {
		System.out.println("흰머리 독수리다~");
	}
	public void animalHunt() {
		System.out.println("동물을 사냥~");
	}
	@Override
	public String toString() {
		String str = super.toString();
		display();
		performFly();
		performTweet();
		performSwim();
		super.walking();
		this.animalHunt();
		super.spawn();
		return str;
	}
}
class WildGoose extends Bird {
	public WildGoose(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	@Override
	public void display() {
		System.out.println("기러기다~");
	}
	public void seasonMoving() {
		System.out.println("계절이동~");
	}
	@Override
	public String toString() {
		String str = super.toString();
		display();
		performFly();
		performTweet();
		performSwim();
		super.walking();
		this.seasonMoving();
		super.spawn();
		return str;
	}
}

class SculptureBird extends Bird {
	public SculptureBird(String name, IFlyBehavior flyBehavior, ITweetBehavior tweetBehavior, ISwimBehavior swimBehavior) {
		setName(name);
		setFlyBehavior(flyBehavior);
		setTweetBehavior(tweetBehavior);
		setSwimBehavior(swimBehavior);
	}
	@Override
	public void display() {
		System.out.println("새 조형물이다~");
	}
	@Override
	public void walking() {
		System.out.println(
			"걸을 수 없음!\n" +
			"서있기만 가능!"
		);
	}
	@Override
	public void spawn() {
		System.out.println("알을 낳을 수 없음!");
	}
	@Override
	public String toString() {
		String str = super.toString();
		display();
		performFly();
		performTweet();
		performSwim();
		this.walking();
		this.spawn();
		return str;
	}
}

public class Life_UseBird {
	public static void main(String[] args) {
		System.out.println(
			new Sparoow(
				"참새",
				new FlyWithWing(),
				new SparrowTweet(),
				new SwimNoWay()
			)
		);
		
		System.out.println(
			new Dove(
				"비둘기",
				new FlyWithWing(),
				new DoveTweet(),
				new SwimNoWay()
			)
		);
		System.out.println(
			new AmericanEagle(
				"흰머리 독수리",
				new FlyWithWing(),
				new EagleTweet(),
				new SwimNoWay()
			)
		);
		System.out.println(
			new WildGoose(
				"기러기",
				new FlyWithWing(),
				new WildGooseTweet(),
				new Swim()
			)
		);
		
		System.out.println(
			new SculptureBird(
				"조형물 새",
				new FlyNoWay(),
				new MuteTweet(),
				new SwimNoWay()
			)
		);
	}
}
