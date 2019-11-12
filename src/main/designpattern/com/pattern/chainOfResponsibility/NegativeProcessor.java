package com.pattern.chainOfResponsibility;

public class NegativeProcessor implements NumberChain {

	private NumberChain nextInChain;

	@Override
	public void setNext(NumberChain c) {
		nextInChain = c;
	}

	@Override
	public void process(NumCheck numberRequest) {
		if (numberRequest.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + numberRequest.getNumber());
		} else {
			nextInChain.process(numberRequest);
		}
	}
}
