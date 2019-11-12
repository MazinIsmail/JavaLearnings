package com.pattern.chainOfResponsibility;

public class ZeroProcessor implements NumberChain {

	private NumberChain nextInChain;

	@Override
	public void setNext(NumberChain c) {
		nextInChain = c;
	}

	@Override
	public void process(NumCheck numberRequest) {
		if (numberRequest.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + numberRequest.getNumber());
		} else {
			nextInChain.process(numberRequest);
		}
	}

}
