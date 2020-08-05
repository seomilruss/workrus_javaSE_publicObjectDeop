package publicobjectDeop.contents;

interface IMove {
	void move();
}
interface IStop {
	void stop();
}
interface IUseWeapon {
	void attack();
}
interface IPatrol {
	void patrol();
}
interface IHold {
	void hold();
}

abstract class Unit implements IMove, IStop, IUseWeapon, IPatrol, IHold {
	private String name;
	private int hp;
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String toString() {
		String str = "========================" + "\n";
		str += "유닛 정보" + "\n";
		str += "이름 : " + name + "\n";
		str += "체력 : " + hp;
		return str;
	}
}

class Zealot extends Unit {
	private int protossArmor = 1;
	private int plasmaShields;
	// private psiBlades = 8 * 2;
	// private kills;
	public Zealot(String name, int plasmaShields, int hp) {
		setName(name);
		setplasmaShields(plasmaShields);
		setHp(hp);
	}
	public int getplasmaShields() {
		return plasmaShields;
	}
	public int getProtossArmor() {
		return protossArmor;
	}
	public void setplasmaShields(int plasmaShields) {
		this.plasmaShields = plasmaShields;
	}
	public void setProtossArmor(int protossArmor) {
		this.protossArmor = protossArmor;
	} 
	
	@Override
	public void move() {
		System.out.println("이동");
		stop();
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println(
			this.getName() + " : " + "사이오닉 검을 사용한 공격"
		);
		stop();
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "보호막 : " + plasmaShields + "\n";
		str += "보호막 : " + plasmaShields + "\n";
		str += "========================";
		return str;
	}
}
class Medic extends Unit {
	private int mp;
//	Terran InfantryArmor(Armor : 1)
	public Medic(String name, int hp, int mp) {
		setName(name);
		setHp(hp);
		setMp(mp);
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}	
	@Override
	public void move() {
		System.out.println("이동");
		stop();
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println(
			this.getName() + " : " + "무기 없음! 공격이 불가능합니다."
		);
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	public void heal() {
		System.out.println(
				this.getName() + " : " + "(사이오닉)에너지 1을 소모해서 해당 유닛의 hp를 2 증가합니다."
		);
	}
	public void restoration() {
		System.out.println(
				this.getName() + " : " + "(사이오닉)에너지 50을 소모해서 해당유닛의 상태를 초기화합니다."
		);
	}
	public void opticalFlare() {
		System.out.println(
			this.getName() + " : " + "(사이오닉)에너지 75를 소모해서 섬광탄을 투사합니다.\n" +
			"해당유닛의 시야를 1로 변경합니다.\n" +
			"디텍팅 유닛의 경우 디텍팅기능을 상실함."
		);
	}	
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "(사이오닉)에너지 : " + mp + "\n";
		str += "========================";
		return str;
	}
}
class Mutalisk extends Unit {
//	private int zergFlyerCarapse = 0;
//	private GlaveWurm = 9;
	public Mutalisk(String name, int hp) {
		setName(name);
		setHp(hp);
	}
	@Override
	public void move() {
		System.out.println("이동");
		stop();
	}
	@Override
	public void stop() {
		System.out.println("정지");
	}
	@Override
	public void attack() {
		System.out.println(
			this.getName() + " : " + "쐐기벌레를 투척하는 공격!"
		);
		stop();
	}
	@Override
	public void patrol() {
		System.out.println("순찰");
	}
	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	public void guardianAspect() {
		System.out.println(
			this.getName() + " : " + "Mineral 50과 " +
			"VespeneGeyser 100을 소모해서 " +
			"Guardian으로 변이합니다."
		);
	}
	public void devourerAspect() {
		System.out.println(
			this.getName() + " : " +
			"Mineral 150과 " +
			"VespeneGeyser 50을 소모해서 " +
			"Devourer로 변이합니다."
		);
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "========================";
		return str;
	}
}

class Cocoon extends Unit {
//	private int zergFlyerCarapse = 10;
	public Cocoon(String name, int hp) {
		setName(name);
		setHp(hp);
		changing();
	}
	public void changing() {
		System.out.println(this.getName() + " : " + "변이중 (카운트다운이 끝나면 선택한 타입으로 형변환)");
	}
	@Override
	public void move() {
		System.out.println("이동 불가능!");
	}
	@Override
	public void stop() {
		System.out.println(this.getName() + " : " + "변이 취소 (자원을 반환하고 뮤탈리스크로 형변환)");
	}
	@Override
	public void attack() {
		System.out.println(this.getName() + " : " + "공격불가능!");
	}
	@Override
	public void patrol() {
		System.out.println(this.getName() + " : " + "순찰 불가능!");
	}
	@Override
	public void hold() {
		System.out.println(this.getName() + " : " + "위치사수 불가능!");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "========================";
		return str;
	}
}

class Guardian extends Unit {
//	private int zergFlyerCarapse = 2;
//	private int acidSpore = 20;
	public Guardian(String name, int hp) {
		setName(name);
		setHp(hp);
	}
	@Override
	public void move() {
		System.out.println("이동");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	@Override
	public void attack() {
		System.out.println(
			this.getName() + " : " + "지상공격을 합니다.\n" +
			"공중공격은 불가능합니다."
		);
	}

	@Override
	public void patrol() {
		System.out.println("순찰");
	}

	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "========================";
		return str;
	}
}

class Devourer extends Unit {
//	private int zergFlyerCarapse = 2;
//	private int CorrosiceAcid = 25;
	public Devourer(String name, int hp) {
		setName(name);
		setHp(hp);
	}
	@Override
	public void move() {
		System.out.println("이동");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	@Override
	public void attack() {
		System.out.println(
			this.getName() + " : " + "지상공격은 불가능합니다.\n" +
			"공중공격을 합니다."
		);
	}

	@Override
	public void patrol() {
		System.out.println("순찰");
	}

	@Override
	public void hold() {
		System.out.println("위치사수");
	}
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		str += "========================";
		return str;
	}
}

class Contents_UseStarCraft {
	public static void main(String[] args) {
		Zealot zealot = new Zealot("질럿", 60, 100);
		Medic medic = new Medic("메딕", 60, 200);
		Mutalisk mutalisk = new Mutalisk("뮤탈리스크", 120);
		Cocoon cocoon = new Cocoon("코쿤", 200);
		Guardian guardian = new Guardian("가디언", 150);
		Devourer devourer = new Devourer("디바우러", 250);
		System.out.println(zealot);
		zealot.attack();
		System.out.println(medic);
		medic.attack();
		medic.heal();
		medic.restoration();
		medic.opticalFlare();
		System.out.println(mutalisk);
		mutalisk.attack();
		mutalisk.guardianAspect();
		mutalisk.devourerAspect();
		System.out.println(cocoon);
		cocoon.move();
		cocoon.attack();
		cocoon.hold();
		cocoon.patrol();
		cocoon.stop();
		System.out.println(guardian);
		guardian.attack();
		System.out.println(devourer);
		devourer.attack();
	}
}