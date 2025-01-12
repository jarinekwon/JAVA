package com.in28minutes.exceptionhandling;

class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
//	public void add(Amount that) throws CurrenciesDoNotMatchException {
	public void add(Amount that) {
		if (!this.currency.equals(that.currency)) {
//			throw new RuntimeException("Currencies Don't Match");
//			throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

//class CurrenciesDoNotMatchException extends Exception {
class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

//	public static void main(String[] args) throws Exception {
//	public static void main(String[] args) throws CurrenciesDoNotMatchException {
	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
//		Amount amount2 = new Amount("USD", 20);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}
