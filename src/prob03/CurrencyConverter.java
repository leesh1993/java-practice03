package prob03;

public class CurrencyConverter {
	private static double rate;

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}

	public static double toDollar(double KRW) {
		return KRW * 1.197;
	}

	public static double toKRW(double Dollar) {
		// TODO Auto-generated method stub
		return (Dollar * 1000) / 1.197;
	}
	
}
