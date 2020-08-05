package publicobjectDeop.contents;

class Gugu {
	void partOutput() {
		int dan = 1;
		int doubleNum = 1;
		while(doubleNum < 9) {
			doubleNum++;
			System.out.println(
				dan + " * " + doubleNum + " = " + dan * doubleNum + "\t"
			);
		}
	}
	void allOutput() {
		for(int dan=1; dan < 10; dan++) {
			for(int doubleNum =1; doubleNum < 10; doubleNum++) {
				System.out.print(
					dan + " * " + doubleNum + " = " + dan * doubleNum + "\t"
				);
			}
			System.out.println();
		}
	}
}

class GuguCore {
	Gugu gugu;
	public GuguCore() {
		gugu = new Gugu();
		gugu.allOutput();
		gugu.partOutput();
	}
}

class Contents_UseGugu {
	public static void main(String[] args) {
		new GuguCore();
	}
}