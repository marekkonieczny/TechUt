package gamingchair;

public class GamingChair {
		
		private long id;
		
		private String name;
		private boolean isComfortable;
		private double price;
		
		public GamingChair() {
		}
		
		public GamingChair(String name, String vendor, double price) {
			super();
			this.name = name;
			this.isComfortable = isComfortable;
			this.price = price;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean getIsComfortable() {
			return isComfortable;
		}
		public void setIsComfortable(boolean isComfortable) {
			this.isComfortable = isComfortable;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
	}

