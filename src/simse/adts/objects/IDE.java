/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.objects;

public class IDE extends Tool implements Cloneable {
	private String name;
	private double cost;
	private double productivityincreasefactor;
	private double errorratedecreasefactor;
	private boolean purchased;

	public IDE(String n0, double c1, double p2, double e3, boolean p4) {
		setName(n0);
		setCost(c1);
		setProductivityIncreaseFactor(p2);
		setErrorRateDecreaseFactor(e3);
		setPurchased(p4);
	}

	public Object clone() {
		IDE cl = (IDE) (super.clone());
		cl.name = name;
		cl.cost = cost;
		cl.productivityincreasefactor = productivityincreasefactor;
		cl.errorratedecreasefactor = errorratedecreasefactor;
		cl.purchased = purchased;
		return cl;
	}

	public String getName() {
		return name;
	}

	public void setName(String a) {
		name = a;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double a) {
		if (a < 0.0) {
			cost = 0.0;
		} else {
			cost = a;
		}
	}

	public double getProductivityIncreaseFactor() {
		return productivityincreasefactor;
	}

	public void setProductivityIncreaseFactor(double a) {
		if (a < 0.0) {
			productivityincreasefactor = 0.0;
		} else if (a > 1.0) {
			productivityincreasefactor = 1.0;
		} else {
			productivityincreasefactor = a;
		}
	}

	public double getErrorRateDecreaseFactor() {
		return errorratedecreasefactor;
	}

	public void setErrorRateDecreaseFactor(double a) {
		if (a < 0.0) {
			errorratedecreasefactor = 0.0;
		} else if (a > 1.0) {
			errorratedecreasefactor = 1.0;
		} else {
			errorratedecreasefactor = a;
		}
	}

	public boolean getPurchased() {
		return purchased;
	}

	public void setPurchased(boolean a) {
		purchased = a;
	}

}