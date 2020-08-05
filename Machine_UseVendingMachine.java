package publicobjectDeop.machine;

import java.util.ArrayList;
import java.util.Scanner;
class Drink { // 자판기 외부에서도 존재가능한 객체
	private int number;
	private String name;
	private int price;
	private double kcal; // 칼로리
	private double ml; // 용량
	private boolean caffeine; // 카페인의 유무
	private boolean seal; // 밀봉유무
	
	public Drink(
		int number,
		String name,
		int price
		) {
		setNumber(number);
		setName(name);
		setPrice(price);
	}
	public Drink(
		String name,
		double kcal,
		double ml,
		boolean caffeine,
		boolean seal
		) {
		setName(name);
		setKcal(kcal);
		setMl(ml);
		setCaffeine(caffeine);
		setSeal(seal);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getKcal() {
		return kcal;
	}
	public void setKcal(double kcal) {
		this.kcal = kcal;
	}
	public double getMl() {
		return ml;
	}
	public void setMl(double ml) {
		this.ml = ml;
	}
	public boolean isCaffeine() {
		return caffeine;
	}
	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	public boolean isSeal() {
		return seal;
	}
	public void setSeal(boolean seal) {
		this.seal = seal;
	}
	public void openSeal() {
		seal = true;
		System.out.println("캔을 열었습니다.");
	}
	
	public void drinking() {
		openSeal();
		tase();
		deThirst();
		caffeinUp();
		change();
	}
	private void tase() {
		System.out.println("달고 쓴 맛");
	}
	private void deThirst() {
		System.out.println("갈증해소");
	}
	private void caffeinUp() {
		System.out.println("카페인 Up");
	}
	private void change() {
		System.out.println("에너지 Up");
	}
	public String toString() {
		String str = number + ". " + name + " : ";
		return str += price + "원";
	}
	
//	public String toString() {
//		String info = "음료수 정보" + "\n";
//		info += "이름 : " + name + "\n";
//		info += "가격 : " + price + "\n";
//		info += "칼로리 : " + kcal + "kcal\n";
//		info += "용량 : " + ml + "ml\n";
//		info += "카페인 유무 : " + caffeine + "\n";
//		info += "밀봉여부 : " + seal + "\n";
//	}
	
//	sampleDrink Info
//	Drink("맥스월하우스", 500, 65, 175, true, false); 단맛
//	Drink("디&카페", 600, 40, 175, true, false); 쓴맛
//	Drink("조지아", 800, 69, 175, true, false); 쓴고 단맛
}

class VendingMachine { // 자판기
	// ▼Datas
	private Drink gorgiaCoffe;
	private Drink maxwellCoffe;
	private Drink dAndCafeCoffe;
	
	Scanner inputNum = new Scanner(System.in);
	DisplayUserInterface dUI = new DisplayUserInterface(); // 디스플레이 UI
	MainControler mct = new MainControler(); // 메인 컨트롤러
	ArrayList<Drink> cans = new ArrayList<Drink>();
	
	public int userSelect; // 사용자 입력값
	public int insertMoney; // 입력값
	public int balance; // 잔액
//	public int gorgiaCoffe = 800;
//	public int maxwellCoffe = 500;
//	public int dAndCafeCoffe = 600;
	
	class DisplayUserInterface {
		// ▼UIs
		void itemList() {
			System.out.println("원하시는 상품의 번호를 선택해주세요" + "\n" +
				gorgiaCoffe + "\n" +
				maxwellCoffe + "\n" +
				dAndCafeCoffe
			);
		}
		void requestMoney() {
			System.out.println("돈을 투입해주세요");
		}
		void selectMoneyUnit() {
			System.out.println("투입할 돈의 단위의 번호를 선택해주세요." + "\n" +
				"1. 10원" + "\n" +
				"2. 50원" + "\n" +
				"3. 100원" + "\n" +
				"4. 500원" + "\n" +
				"5. 1000원" + "\n"
			);
		}
		void checkMomey() { // 금액 확인
			System.out.println("[현재 금액 : " + balance + " 원]");
		}
		void payOk() {
			System.out.println("결제완료, 상품이 배출되었습니다.");
		}
		void askOtherTransaction() {
			System.out.println(
				"추가로 구매하실 것이 있으신가요?" +
				"[입력예 _ 0 : true, 1 : false]"
			);
		}
		void wrong() {
			System.out.println("잘못된 입력입니다.");
		}
		void goodBye() {
			System.out.println(
				"거래가 종료되었습니다.\n" + "안녕히가세요."
			);
		}
	}
	public int getUserSelect() {
		return userSelect;
	}
	public void setUserSelect(int userSelect) {
		this.userSelect = userSelect;
	}
	public int getInsertMoney() {
		return insertMoney;
	}
	public void setInsertMoney(int insertMoney) {
		this.insertMoney = insertMoney;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ▼Logics
	void start() {
		itemStorageBox();
	}
	void itemStorageBox() { // 아이템 보관함
		gorgiaCoffe = new Drink(0, "조지아", 800);
		maxwellCoffe = new Drink(1, "맥스웰", 500);
		dAndCafeCoffe = new Drink(2, "D&CAFE", 600);
		mct.transactionModule();
	}
	void userSelect() {
		userSelect = inputNum.nextInt();
	}
	class MainControler {
		public void transactionModule() { // 거래
			selectItem();
			inputMoney();
		}
		public void selectItem() { // 상품선택
			dUI.itemList();
			userSelect();
			switch (userSelect) {
			case 0:
				insertMoney = gorgiaCoffe.getPrice();
				System.out.println("조지아 커피를 선택했습니다.");
				break;
			case 1:
				insertMoney = maxwellCoffe.getPrice();
				System.out.println("맥스윌 커피를 선택했습니다.");
				break;
			case 2:
				insertMoney = dAndCafeCoffe.getPrice();
				System.out.println("D&cafe 커피를 선택했습니다.");
				break;
			default:
				dUI.wrong();
				selectItem();
				break;
			}
		}
		public void inputMoney() { // 금액투입
			if (balance > insertMoney) {
				payMoney();
			} else {
				dUI.requestMoney();
				dUI.checkMomey();
				dUI.selectMoneyUnit();
				userSelect();
				coinMec();
				inputMoney();
			}
		}
		public void coinMec() { // coinMechanism
			switch (userSelect) {
			case 1:
				balance += 10;
				break;
			case 2:
				balance += 50;
				break;
			case 3:
				balance += 100;
				break;
			case 4:
				balance += 500;
				break;
			case 5:
				balance += 1000;
				break;
			default:
				dUI.wrong();
				break;
			}
		}
		public void payMoney() { // 결제
			if (balance >= insertMoney) {
				balance -= insertMoney;
				dUI.payOk();
				dUI.checkMomey();
				checkOtherTransaction();
				payReturn();
				dUI.goodBye();
			} else {
				inputMoney();
			}
		}
		public void payReturn() { // 잔액 반환
			balance -= balance;
		}
		public void checkOtherTransaction() { // 다른 거래의 유무 확인
			dUI.askOtherTransaction();
			userSelect = inputNum.nextInt();
			switch (userSelect) {
			case 0:
				transactionModule();
				break;
			case 1:
				break;
			default:
				dUI.wrong();
				break;
			}
		}
	}
}
class Machine_UseVendingMachine {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.start();
	}
}