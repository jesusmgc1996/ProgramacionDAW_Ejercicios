package capitulo06.bloque02;

public class Articulo {

	private String barcode;
	private String name;
	private String shelfNum;
	private int stock;
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}

	/**
	 * @param barcode
	 * @param name
	 * @param shelfNum
	 * @param stock
	 */
	public Articulo(String barcode, String name, String shelfNum, int stock) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.shelfNum = shelfNum;
		this.stock = stock;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShelfNum() {
		return shelfNum;
	}

	public void setShelfNum(String shelfNum) {
		this.shelfNum = shelfNum;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Articulo [barcode=" + barcode + ", name=" + name + ", shelfNum=" + shelfNum + ", stock=" + stock + "]";
	}
	
}
