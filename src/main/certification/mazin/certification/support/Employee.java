package mazin.certification.support;

abstract public class Employee {
	protected abstract double getSalesAmount();
	public double getCommision() {
		return getSalesAmount() * 0.15;
	}
}