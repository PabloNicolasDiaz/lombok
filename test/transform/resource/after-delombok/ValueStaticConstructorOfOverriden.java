public final class ValueStaticConstructorOfOverriden {
	private final String name;
	private final Double price;

	private ValueStaticConstructorOfOverriden(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public static ValueStaticConstructorOfOverriden of(String name, Double price) {
		return new ValueStaticConstructorOfOverriden(name, price);
	}

	@java.lang.SuppressWarnings("all")
	public String getName() {
		return this.name;
	}

	@java.lang.SuppressWarnings("all")
	public Double getPrice() {
		return this.price;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof ValueStaticConstructorOfOverriden)) return false;
		final ValueStaticConstructorOfOverriden other = (ValueStaticConstructorOfOverriden) o;
		final java.lang.Object this$name = this.getName();
		final java.lang.Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final java.lang.Object this$price = this.getPrice();
		final java.lang.Object other$price = other.getPrice();
		if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
		return true;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final java.lang.Object $price = this.getPrice();
		result = result * PRIME + ($price == null ? 43 : $price.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "ValueStaticConstructorOfOverriden(name=" + this.getName() + ", price=" + this.getPrice() + ")";
	}
}