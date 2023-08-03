package codingchallenges;

import java.util.Objects;

public class WeatherData {
	private String id;
	private String name;
	private Double temp;
	private Double pressure;
	private Double humiditiy;

	public WeatherData(final String id, final String name, final Double temp, final Double pressure, final Double humiditiy) {

		this.id = id;
		this.name = name;
		this.temp = temp;
		this.pressure = pressure;
		this.humiditiy = humiditiy;
	}

	public String getId() {

		return id;
	}

	public void setId(final String id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(final String name) {

		this.name = name;
	}

	public Double getTemp() {

		return temp;
	}

	public void setTemp(final Double temp) {

		this.temp = temp;
	}

	public Double getPressure() {

		return pressure;
	}

	public void setPressure(final Double pressure) {

		this.pressure = pressure;
	}

	public Double getHumiditiy() {

		return humiditiy;
	}

	public void setHumiditiy(final Double humiditiy) {

		this.humiditiy = humiditiy;
	}

	@Override
	public boolean equals(final Object o) {

		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final WeatherData that = (WeatherData) o;
		return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(temp, that.temp)
				&& Objects.equals(pressure, that.pressure) && Objects.equals(humiditiy, that.humiditiy);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name, temp, pressure, humiditiy);
	}

	@Override
	public String toString() {

		return "WeatherData{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", temp=" + temp +
				", pressure=" + pressure +
				", humiditiy=" + humiditiy +
				'}';
	}
}
