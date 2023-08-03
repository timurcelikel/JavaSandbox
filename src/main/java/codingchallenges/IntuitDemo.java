package codingchallenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntuitDemo {


	/*
	·     You can use any programming language & IDE of your choice

·         Your method should take a list of WeatherData objects. The output should be an object of type WeatherData and TopK data model is described as below.

·         The data types of weather stats are as specified in the data model.



Input data object

    {

        "id": "1",

        "name": "London",

        "temp": 14,

        "pressure": 15,

        "humidity": 51

    }

Requirements:

Write a sorting function that takes in:
the attribute to sort by
k, the number of elements to return
the input data
Create some input data to use
*/

	public static void main(String[] args) {

		List<WeatherData> weatherData = initWeatherDataDetails();

		List<WeatherData> weatherDataSorted = sortWeatherData(weatherData, 2, "temp");

		weatherDataSorted.forEach(System.out::println);

		//System.out.println("Sorted WeatherData: " + weatherDataSorted);
	}

	private static List<WeatherData> sortWeatherData(final List<WeatherData> weatherData, int k, String attribute) {

		List<WeatherData> sortedWeatherDataList = new ArrayList<>();
		if (attribute.equals("temp")) {
			// sort by temp
			//sortedWeatherDataList = weatherData.stream().sorted(Comparator.comparing(x -> x.getTemp()).reversed()).limit(k).toList();
			sortedWeatherDataList = weatherData.stream().sorted(Comparator.comparing(WeatherData::getTemp).reversed()).limit(k).toList();
		} else if (attribute.equals("pressure")) {
			// sort by pressure
			sortedWeatherDataList = weatherData.stream().sorted(Comparator.comparing(WeatherData::getPressure).reversed()).limit(k).toList();
		} else if (attribute.equals("humidity")) {
			// sort by humidity
			sortedWeatherDataList = weatherData.stream().sorted(Comparator.comparing(WeatherData::getHumiditiy).reversed()).limit(k).toList();
		}

		return sortedWeatherDataList;
	}

	private static List<WeatherData> initWeatherDataDetails() {

		List<WeatherData> weatherDataList = new ArrayList<>();
		WeatherData wd1 = new WeatherData("1", "London", 14d, 15d, 51d);
		WeatherData wd2 = new WeatherData("2", "San Diego", 13d, 14d, 50d);
		WeatherData wd3 = new WeatherData("3", "Los Angeles", 15d, 16d, 52d);
		WeatherData wd4 = new WeatherData("4", "Phoenix", 150d, 16d, 52d);
		weatherDataList.add(wd1);
		weatherDataList.add(wd2);
		weatherDataList.add(wd3);
		weatherDataList.add(wd4);

		return weatherDataList;
	}

}