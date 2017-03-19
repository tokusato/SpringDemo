package procon.chap01.bean;


/**
 * this is the simple pojo class
 *
 * */
public class Apple {
	private int price;
	private String explanation;
	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return explanation
	 */
	public String getExplanation() {
		return explanation;
	}
	/**
	 * @param explanation セットする explanation
	 */
	public void setExplanation(String explanation) {
		explanation = explanation;
	}
}
