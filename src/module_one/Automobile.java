package module_one;

public class Automobile {
	private String vin;
	private int year;
	private String make;
	private String model;
	private String trim;
	private String color;
	private int price;	
	private int mileage;
	private String extra_info;

	public Automobile(){
		this.vin = "0";
	}

	public Automobile(String vin){
		this.vin=vin;

		//logic to decode vin and set make model trim etc..
	}

	public Automobile(String vin, int year, String make, String model, String trim, String color, int price, int mileage, String extra_info) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.extra_info = extra_info;
    }

    //since all members are private there will need to be getter and setter methods for each

	public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    // Getter and setter methods for 'year'
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter methods for 'make'
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and setter methods for 'model'
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for 'trim'
    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    // Getter and setter methods for 'color'
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and setter methods for 'price'
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getter and setter methods for 'mileage'
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Getter and setter methods for 'extra_info'
    public String getExtraInfo() {
        return extra_info;
    }

    public void setExtraInfo(String extra_info) {
        this.extra_info = extra_info;
    }
}
