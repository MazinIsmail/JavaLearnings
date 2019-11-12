package com.pattern.chainOfResponsibility;

public interface NumberChain {

	public abstract void setNext(NumberChain nextInChain);

	public abstract void process(NumCheck numberRequest);

}
