package publicobjectDeop.contents;

/*
	Feedback Code of info
	
	Developer : Cho Young deok(조영덕)
	Deve Started : 2020_07_28
	Github - https://github.com/seomilruss/workruss_public
	E-mail : wde906@naver.com
*/
// ------------------------------------------
import java.util.Scanner;
// ------------------------------------------
class Add {
	// ▼Datas
	private int firstNum;
	private int secondNum;
	private int sum;
	
	public Add(
			int firstNum,
			int secondNum
		) {
		setFirstNum(firstNum);
		setSecondNum(secondNum);
		start();
	}

	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	// ▼UIs
//	★ Constructor Do Input values
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input firstNumber & secondNumber." +
//			"[Input example : firstNumber  secondNumber]: "
//		);
//		input();
//	}
	public String toString() { // Response UI
		String result = "";
		result += "sum Number it's " + (int)getSum() + "\n";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getFirstNum(), getSecondNum());
		toString();
	}
	void input(int sum1, int sum2) {
		process1(getFirstNum(), getSecondNum());
	}
	int process1(int sum1, int sum2) {
		return sum = sum1 + sum2;
	}
}

// -----------------------------

class Bill {
	// ▼Datas
	private int cash;
	private int total;
	private double tax;
	private int change;
	
	public Bill(int cash, int total) {
		setCash(cash);
		setTotal(total);
		start();
	}
	
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	// ▼UIs
//	★ Constructor Do Input values
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input item of price and guest of receive money\n" +
//			"[Input example : price  receiveMoney]"
//		);
//		input();
//	}
	
	public String toString() { // Response UI
		String result = "";
		result += "cash is " + getCash() + "(unit won)." + "\n";
		result += "total is " + getTotal() + "(unit won)." + "\n";
		result += "surtax is " + getTax() + "(unit won)." + "\n";
		result += "balance is " + getChange() + "(unit won).";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getCash(), getTotal());
		toString();
	}
	void input(
			int sum1,
			int sum2
		) {
		process1(sum1);
		process2(sum2);
	}
	double process1(int sum1) {
		return tax = sum1 * 0.1;
	}
	int process2(int sum2) {
		return change = getCash() - sum2;
	}
}

// ------------------------------

class CircleArea {
	// ▼Datas
	private double radius;
	private double area;
	
	public CircleArea(
			double radius
			) {
		setRadius(radius);
		start();
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	// ▼UIs
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input radius : "
//		);
//	}
	public String toString() { // Response UI
		String result = "";
		result += "radius it's " + getRadius() +"(cm)\n";
		result += "area circle it's " + getArea() + "(area)" + "\n";
		return result;
	}
	
	// ▼Logics
	void start() {
		input(getRadius());
		toString();
	}
	void input(double sumNum) {
		process1(radius);	
	}
	double process1(double sum1) {
		return area = 3.14 * radius * radius;
	}
}

// ---------------------------------

class Exchange {
	// ▼Datas
	final double won = 1392.83;
	private int inputMoney;
	String result;
	
	public Exchange(int inputMoney) {
		setInputMoney(inputMoney);
		start();
	}
	
	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	// ▼UIs
//	void inputRequest() { // Request UI
//		System.out.print(
//			"input the sum(unit won) : "
//		);
//		input();
//	}
	public String toString() { // Response UI
		return result  + "dollar.";
	}
	// ▼Logics
	void start() {
		input(getInputMoney());
		toString();
	}
	
	void input(int sum1) {
		result = sum1 / won + " ";
	}
}

// --------------------------------------------------

class SelectLauncher {
	// ▼Datas
	Scanner input = new Scanner(System.in);
	private int uSelectNum;
	// ▼Datas is for UI(UserInterface)
	private String function1 = "add two number";
	private String function2 = "calc surtax & balance";
	private String function3 = "calc area circle";
	private String function4 = "calc exchange dollar";
	
	public SelectLauncher() {
		start();
	}
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public int getuSelectNum() {
		return uSelectNum;
	}
	public void setuSelectNum(int uSelectNum) {
		this.uSelectNum = uSelectNum;
	}
	public String getFunction1() {
		return function1;
	}
	public void setFunction1(String function1) {
		this.function1 = function1;
	}
	public String getFunction2() {
		return function2;
	}
	public void setFunction2(String function2) {
		this.function2 = function2;
	}
	public String getFunction3() {
		return function3;
	}
	public void setFunction3(String function3) {
		this.function3 = function3;
	}
	public String getFunction4() {
		return function4;
	}
	public void setFunction4(String function4) {
		this.function4 = function4;
	}
	// ▼UIs
	void start() {
		outputFunctionList();
		input();
		selectFunction(uSelectNum);
	}
	
	void outputFunctionList() {
		System.out.print(
			"★  Constructor Do Input values, " + "\n" +
			"don't Input Value.\n\n" +
			"select the function." + "\n" +
			"1. " + getFunction1() + "\n" +
			"2. " + getFunction2() + "\n" +
			"3. " + getFunction3() + "\n" +
			"4. " + getFunction4() + "\n"
		);
	}
	
	void input() {
		uSelectNum = input.nextInt();
	}
	void wrong() {
		System.out.println(
			"input was wrong."
		);
	}
	// ▼Logics
	public void selectFunction(int selectNum) {
		switch(selectNum) {
			case 1:
				System.out.println(new Add(222, 555));
			break;
			case 2:
				System.out.println(new Bill(1000,750));
			break;
			case 3:
				System.out.println(new CircleArea(77.7));
			break;
			case 4:
				System.out.println(new Exchange(777));
			break;
			
			default:
				wrong();
			break;
		}
	}
}

public class Contents_UseSelectLauncher {
	public static void main(String[] args) {
		new SelectLauncher();
	}
}
